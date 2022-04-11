ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "retirement_calculator"
  )

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.2.11",
  "org.scalatest" %% "scalatest" % "3.2.11" % "test"
)

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

assembly / mainClass := Some("retcalc.SimulatePlanApp")
