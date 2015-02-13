package com.ilunin.yose

import com.ilunin.spray.gun.{Get, Server}
import spray.http.HttpResponse

object Yose extends App {

  val server = Server.syncServer(port = args.head.toInt) {
    case Get(_, _) => HttpResponse(entity = "<html><body>Hello Yose!</body></html>")
  }

  server.start()


}
