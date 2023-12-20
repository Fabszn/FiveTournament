import Dependencies.zio

import scala.language.postfixOps

scalaVersion:="3.3.1"

lazy val server = (project in file("server")).settings(
    libraryDependencies ++= zio

)
