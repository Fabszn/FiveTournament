package services

import zio.*
import zio.http.*
import zio.http.codec.PathCodec.trailing

object httpServer {

  val app: HttpApp[Any] =
    Routes(
      Method.GET / "assets" -> handler(Response.text("hello")),
      Method.GET / "static" / trailing -> handler {
        val extractPath = Handler.param[(Path, Request)](_._1)

        for {
          path <- extractPath
          file <- Handler.getResourceAsFile(path.encode)
          r <- Handler.fromFile(file)
        } yield r
      }
    ).sandbox.toHttpApp

}
