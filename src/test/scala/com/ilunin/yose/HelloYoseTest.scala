package com.ilunin.yose

import com.jayway.restassured.RestAssured.given
import org.scalatest.{BeforeAndAfterAll, Matchers, FlatSpec}

class HelloYoseTest extends FlatSpec with Matchers with BeforeAndAfterAll {

  override def beforeAll(): Unit = {
    Yose.start(8080)
  }

  override def afterAll(): Unit = {
    Yose.stop()
  }

  "The home page" should "return 200" in {
    val response = given().get("http://localhost:8080/")
    response.statusCode should be (200)
  }

  it should "contains Hello Yose" in {
    val response = given().get("http://localhost:8080/")
    response.body.asString should include ("Hello Yose")
  }

}
