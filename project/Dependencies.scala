import Dependencies.version._
import sbt._

object Dependencies {

  object version {
    lazy val zioVersion     = "2.0.20"
    lazy val zioHttpVersion = "3.0.0-RC3"
  }

  lazy val zioHttp = "dev.zio" %% "zio-http" % zioHttpVersion
  lazy val zio = Seq(
    "dev.zio" %% "zio"          % zioVersion
  )

}
