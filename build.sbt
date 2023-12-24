import Dependencies.zio

import scala.language.postfixOps

ThisBuild / scalaVersion := "3.3.1"

lazy val server = (project in file("."))
    .enablePlugins(DockerPlugin,JavaAppPackaging)
    .settings(
        libraryDependencies ++= zio,
        dockerExposedPorts := Seq(9000)

    )
