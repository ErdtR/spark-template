val dependencies = Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-sql" % "2.2.0",
  "org.apache.spark" %% "spark-streaming" % "2.2.0"
)

lazy val root = (project in file(".")).settings(
  name := "spark-template",
  version := "1.0",
  scalaVersion := "2.11.8",
  libraryDependencies ++= dependencies
)