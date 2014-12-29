
lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.github",
  scalaVersion := "2.10.4"
)

lazy val app = (project in file("app")).
  settings(commonSettings: _*).
  settings(
    assemblyJarName in assembly := "fabricator.jar"
  )

name := "fabricator"

version := "1.0"

scalaVersion := "2.10.4"

crossScalaVersions := Seq("2.10.4", "2.11.4")

resolvers += "Typesafe Simple Repository" at "http://repo.typesafe.com/typesafe/simple/maven-releases/"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "JCenter" at "http://dl.bintray.com/"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += Classpaths.sbtPluginReleases

libraryDependencies ++= Seq(
  "com.typesafe.play"           %% "play-json"             % "2.4.0-M2",
  "org.testng"                  %  "testng" % "6.8.8"      % "test",
  "org.scalatest"               %% "scalatest"             % "3.0.0-SNAP4" % "test",
  "com.github.nscala-time"      %% "nscala-time"           % "1.2.0",
  "com.typesafe.scala-logging"  %% "scala-logging-slf4j"   % "2.1.2",
  "org.slf4j"                   %  "slf4j-api"             % "1.7.1",
  "ch.qos.logback"              %  "logback-classic"       % "1.0.3",
  "com.spatial4j"               %  "spatial4j"             % "0.4.1",
  "org.iban4j"                  %  "iban4j"                % "2.1.1",
  "commons-validator"           %  "commons-validator"     % "1.4.0",
  "com.google.inject"           %  "guice"                 % "3.0",
  "com.github.tototoshi"        %% "scala-csv"             % "1.2.0-SNAPSHOT"
)

scalacOptions += "-deprecation"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

unmanagedResourceDirectories in Compile += { baseDirectory.value / "src/main/resources" }

