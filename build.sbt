lazy val root = (project in file("."))
  .settings(
    name := "CDK scala experiment",
    libraryDependencies ++= Seq(
      "software.amazon.awscdk" % "aws-cdk-lib" % "2.0.0-rc.1",
      "software.constructs" % "constructs" % "[10.0.0,11.0.0)",
      // https://github.com/sbt/junit-interface/issues/75#issuecomment-288374837
      "org.junit.platform" % "junit-platform-runner" % "1.7.1" % Test,
      "org.junit.jupiter" % "junit-jupiter-engine" % "5.7.1" % Test,
      "org.junit.vintage" % "junit-vintage-engine" % "5.7.1" % Test,
      "org.assertj" % "assertj-core" % "3.18.1" % Test,
      "com.novocode" % "junit-interface" % "0.11" % Test
    )
  )