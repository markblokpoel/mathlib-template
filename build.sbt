ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "mathlib-template",
    libraryDependencies += "com.markblokpoel" %% "mathlib" % "0.9.1"
  )
