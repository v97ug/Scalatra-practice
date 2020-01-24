package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

  get("/hello") {
    println(params.get("user_id"))
    "hello world!"
  }

  get("/hello/:user") {
    val user: String = params.get("user").getOrElse("")
    s"<h1>hello $user</h1>"
  }

  get("/compare/:value") {
    println(params.get("value"))
    println(request.getParameter("value"))
  }

  post("/") {
    request.body

  }
}
