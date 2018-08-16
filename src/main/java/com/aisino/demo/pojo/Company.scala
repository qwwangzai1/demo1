package com.aisino.demo.pojo

class Company(val name: String, val hymx: String,
              val hymx_mc: String, val hyzldm: String,
              val hyzldm_mc: String, val ixn_hyzl: String,
              val ixn_hyzl_mc: String) {
  def this(name: String, hymx: String) = {
    this(name, hymx, "", "", "", "", "")
  }



}
