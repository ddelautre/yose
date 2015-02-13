package com.ilunin.yose

import com.jayway.restassured.RestAssured.given
import org.scalatest.{Matchers, FlatSpec}

class HelloYoseTest extends FlatSpec with Matchers {
  Yose.main(Array("8080"))

  "The home page" should "return 200" in {
    val response = given().get("http://localhost:8080/")
    response.statusCode should be (200)
  }

  it should "contains Hello Yose" in {
    val response = given().get("http://localhost:8080/")
    response.body.asString should include ("Hello Yose")
  }

}
