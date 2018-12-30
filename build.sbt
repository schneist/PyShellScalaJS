import sbt.Keys.{libraryDependencies, publishMavenStyle, scalacOptions}

lazy val root = project.in(file(".")).
  enablePlugins(ScalaJSPlugin)

scalaVersion := "2.12.8"

name := "PyShellScalaJS"

organization := "org.novogarchinsk"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-feature",
  "-Ypartial-unification",
  "-P:scalajs:sjsDefinedByDefault"
)

resolvers ++= Seq(
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype OSS Public" at "https://oss.sonatype.org/content/repositories/public",
  "JFrog" at  "http://repo.jfrog.org/artifactory/libs-releases/",
  "JBoss" at "http://repository.jboss.org/nexus/content/groups/public-jboss/",
  "MVNSearch" at "http://www.mvnsearch.org/maven2/"
)

publishMavenStyle := true

libraryDependencies += "org.scalactic" %%% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % "test"

skip in packageJSDependencies := false
scalaJSUseMainModuleInitializer := true

