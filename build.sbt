lazy val root = (project in file("."))
  .settings(
    name := "CDK scala experiment",
    libraryDependencies ++= Seq(
      "software.amazon.awscdk" % "aws-cdk-lib" % "2.0.0-rc.1",
      "software.constructs" % "constructs" % "[10.0.0,11.0.0)",
      "org.scalatest" %% "scalatest" % "3.2.7" % Test
    )
  )