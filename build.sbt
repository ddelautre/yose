lazy val yose = (project in file("."))
  .enablePlugins(JavaAppPackaging)

name := "yose"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "io.spray" %% "spray-routing" % "1.3.2",
  "io.spray" %% "spray-can" % "1.3.2",
  "com.jayway.restassured" % "rest-assured" % "2.4.0" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.3.7"
)

