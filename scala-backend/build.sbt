import Dependencies._

lazy val scalaJSVersion = "0.6.22"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-backend",
    libraryDependencies ++= Seq(scalaTest % Test,
      "org.scala-js" %% "scalajs-stubs" % scalaJSVersion % "provided")
  )
