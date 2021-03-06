﻿using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Threading.Tasks;
using System.Web.Http;
using System.Web.Http.Description;
using Eport.Models;

namespace Eport.Controllers
{
    public class workController : ApiController
    {
        private Entities db = new Entities();

        /// <summary>
        /// return all the work sheets
        /// </summary>
        /// <returns></returns>
        [HttpGet]
        [Route("api/sheets/checkSheet")]
        public returnDto<IQueryable<checkSheetDto>> GetCheckSheets()
        {
            var checkSheets = db.PATROL_LOG.Join(db.STAFF, p => p.PATROL_ID, s => s.ID, (p, staff) => new { p, staff }).Join
                (db.EQ_IN_USE, p =>p.p.EQ_ID, e => e.ID, (p, EQ) => new checkSheetDto()
                {
                    id = "PS" + p.p.ID,
                    checkArea = EQ.ADDRESS,
                    checkPic = p.p.PATROL_PICTURE,
                    checkTime = p.p.PATROL_TIME,
                    eqID = "EQ" + EQ.ID,
                    potrolID = "ST" + p.staff.ID,
                    potrolName = p.staff.NAME,
                    createTime = (DateTime)p.p.INSERT_TIME,
                    updateTime = (DateTime)p.p.UPDATE_TIME
                });
            return returnHelper.make(checkSheets);
        }

        /// <summary>
        /// </summary>
        /// <returns></returns>
        [HttpPost]
        [Route("api/sheets/checkSheetRow")]
        public async Task<IHttpActionResult> DeleteCheckSheet(stringReceiver sR)
        {
            try
            {
                string id = sR.decoded();
                PATROL_LOG patrol_log = await db.PATROL_LOG.FindAsync(id);
                if (patrol_log == null)
                {
                    throw new ApplicationException();
                }
                db.PATROL_LOG.Remove(patrol_log);
                await db.SaveChangesAsync();
                NotificationController.NotificationCallbackMsg("删", "巡检单" + sR.decoded());
                var checkSheets = GetCheckSheets().data.ToList();
                return Ok(returnHelper.make(checkSheets));
            }
            catch (Exception)
            {
                return Ok(returnHelper.fail());
            }
        }
    }
}