﻿namespace Eport.Models
{
    using System;
    using System.Collections.Generic;

    //wyc
    public partial class EqInUseDto
    {
        public string id { get; set; }
        public string type { get; set; }
        public string status { get; set; }
        public string model { get; set; }
        public string address { get; set; }
    }

    //wyc
    public partial class detailedEqInUseDto
    {
        public string name { get; set; }
        public string factory_time { get; set; }
        public string install_time { get; set; }
        public string unit { get; set; }
        public string address { get; set; }
        public string if_damage { get; set; }
        public string QRcode { get; set; }
        public string icon { get; set; }
    }

    //wyc
    public partial class eqStoredReceiver
    {
        public string name { get; set; }
        public string productTime { get; set; }
        public string warehouse { get; set; }
        public string model { get; set; }
    }
}
