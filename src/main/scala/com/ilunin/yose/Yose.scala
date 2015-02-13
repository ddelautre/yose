package com.ilunin.yose

import akka.actor.ActorSystem
import spray.http.HttpResponse
import spray.routing.SimpleRoutingApp

object Yose extends App with SimpleRoutingApp {

  implicit val system = ActorSystem("homerun")
  implicit val executionContext = system.dispatcher

  startServer(interface = "0.0.0.0", port = 8080) {
    get {
      complete(HttpResponse(entity = "<html><body>Hello Yose</body></html>"))
    }
  }

}
