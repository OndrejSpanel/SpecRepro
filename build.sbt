name := "SpecRepro"

val commonSettings = Seq(scalaVersion := "2.13.3")

lazy val root = (project in file(".")).settings(commonSettings)

lazy val examples = (project in file("examples")).dependsOn(root).settings(commonSettings)
