import Dependencies.*

import scala.language.postfixOps

ThisBuild / scalaVersion := "3.3.0"
ThisBuild / useCoursier := false

lazy val fiveTournament = (project in file("."))
  .enablePlugins(DockerPlugin, JavaAppPackaging)
  .settings(
    libraryDependencies ++= zio,
    libraryDependencies += zioHttp
  )
  .settings(dockerConf)

lazy val dockerConf = Seq(
  dockerBaseImage := "openjdk:17",
  dockerExposedPorts := Seq(9000)
)
