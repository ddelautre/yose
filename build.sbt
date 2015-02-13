lazy val yose = (project in file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(resolvers += Resolver.jcenterRepo)

name := "yose"

version := "1.0"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "spray-gun" %% "spray-gun" % "1.0.1",
  "io.spray" %% "spray-can" % "1.3.2",
  "com.jayway.restassured" % "rest-assured" % "2.4.0" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.3.7"
)

