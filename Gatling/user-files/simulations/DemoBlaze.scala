
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DemoBlaze extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.demoblaze.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:93.0) Gecko/20100101 Firefox/93.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> """"TTo8pA"""",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Cache-Control" -> "max-age=0",
		"If-None-Match" -> """"TTo8pA"""",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_2 = Map(
		"Origin" -> "https://www.demoblaze.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_3 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8",
		"If-None-Match" -> """"TTo8pA"""",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_4 = Map(
		"Access-Control-Request-Headers" -> "content-type",
		"Access-Control-Request-Method" -> "POST",
		"Origin" -> "https://www.demoblaze.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

	val headers_5 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "https://www.demoblaze.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-site")

    val uri2 = "https://api.demoblaze.com"

	val scn = scenario("DemoBlaze")
		.exec(http("HomePage")
			.get("/")
			.headers(headers_0)
			.resources(http("ConfigJson")
			.get("/config.json")
			.headers(headers_1),
            http("Entries")
			.get(uri2 + "/entries")
			.headers(headers_2)))
		//.pause(2)
		.exec(http("ProdHtml")
			.get("/prod.html?idp_=1")
			.headers(headers_3)
			.resources(http("POST_View")
			.post(uri2 + "/view")
			.headers(headers_5)
			.body(RawFileBody("demoblaze/0005_request.json"))))
		//.pause(1)
		.exec(http("POST_addtocart")
			.post(uri2 + "/addtocart")
			.headers(headers_5)
			.body(RawFileBody("demoblaze/0007_request.json")))

	setUp(scn.inject(constantConcurrentUsers(100) during (60 seconds))).protocols(httpProtocol)
	//setUp(scn.inject(atOnceUsers(100))).protocols(httpProtocol)
	//setUp(scn.inject(rampUsers(100).during(10.seconds))).protocols(httpProtocol)
}