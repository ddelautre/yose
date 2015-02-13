package com.ilunin.yose

import com.jayway.restassured.RestAssured.given
import org.scalatest.{Matchers, FlatSpec}

class HelloYoseTest extends FlatSpec with Matchers {

  "The home page" should "return 200" in {
    Yose.main(Array.empty)
    val response = given().get("http://localhost:8080/")
    response.statusCode should be (200)
  }

}
