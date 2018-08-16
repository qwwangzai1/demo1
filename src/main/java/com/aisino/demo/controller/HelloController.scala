package com.aisino.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.{RequestMapping, RequestParam, ResponseBody, RestController}

@Controller
class HelloController {

  @RequestMapping(Array("hello"))
  def greet() = {
    "hello"
  }


  @RequestMapping(Array("/list"))
  def listUser(model: Model): String = {

    model.addAttribute("users", "zengxiang")
    "/user/list"
  }

  @RequestMapping(Array(""))
  def entry() = {
    "/user/submit"
  }

  @RequestMapping(Array("/name"))
  @ResponseBody
  def name(@RequestParam("name") name: String) = {
    println(name)
    name
  }
}
