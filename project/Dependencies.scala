import Dependencies.version._
import sbt._


object Dependencies {

    object version{
        lazy val zioVersion                 = "2.0.2"
    }


    lazy val zio = Seq(
        "dev.zio" %% "zio"          % zioVersion,
        "dev.zio" %% "zio-test"     % zioVersion % "test",
        "dev.zio" %% "zio-test-sbt" % zioVersion % "test"
    )

}
