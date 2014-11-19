import bintray.Keys._
import com.typesafe.sbt.SbtGit._

organization := "org.coursera"

name := "autoschema"

version := "0.1"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.2",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test")

publishMavenStyle := false

scalaVersion := "2.11.4"

bintraySettings

repository in bintray := "scala-libs"

bintrayOrganization in bintray := None

packageLabels in bintray := Seq("scala")

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

versionWithGit

