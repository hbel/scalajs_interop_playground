lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    inThisBuild(List(
      organization := "com.example",
      version      := "0.1-SNAPSHOT",
      scalaVersion := "2.12.5"
    )),
    name := "sjs-frontend",
    libraryDependencies ++= Seq(
      "org.scala-js"  %%% "scalajs-dom"    % "0.9.5",
      "org.scalatest" %%% "scalatest"      % "3.0.5"    % "test"
    ),
    scalaJSUseMainModuleInitializer := false,
    unmanagedSourceDirectories in Compile += baseDirectory.value / ".." / "scala-backend" / "src" / "main" / "scala",
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) }
  )

