package com.ilunin.yose

import com.ilunin.spray.gun.{Get, Server}
import spray.http.HttpResponse

object Yose extends App {

  private var server: Server = _

  def start(port: Int): Unit = {
    server = Server.syncServer(port = port) {
      case Get(_, _) => HttpResponse(entity = "<html><body>Hello Yose!</body></html>")
    }

    server.start()
  }

  def stop(): Unit = server.stop()

  start(args.head.toInt)

}
