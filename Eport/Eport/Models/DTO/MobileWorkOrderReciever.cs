﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Eport.Models.DTO
{
    public class MobileWorkOrderReciever
    {
        public string id { get; set; }
        public string imgURL { get; set; }
        public int status { get; set; }
    }

    public class MobileWorkOrderGetReciever
    {
        public string count_id { get; set; }
    }
}