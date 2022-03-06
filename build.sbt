import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.jonasjonker"
ThisBuild / organizationName := "jonasjonker"
ThisBuild / homepage         := Some(url("https://github.com/jonasjonker/tokenizer"))
ThisBuild / licenses         := List("Apache 2" -> new URL("https://opensource.org/licenses/MIT"))
ThisBuild / description      := "A command line tool to split text into tokens."
ThisBuild / developers := List(
  Developer(
    id    = "001",
    name  = "Jonas Jonker",
    email = "jonasjonker@gmail.com",
    url   = url("www.jonasjonker.com")
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "tokenizer",
    libraryDependencies += scalaTest % Test
  )

// Uncomment the following for publishing to Sonatype.
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for more detail.

// ThisBuild / scmInfo := Some(
//   ScmInfo(
//     url("https://github.com/your-account/your-project"),
//     "scm:git@github.com:your-account/your-project.git"
//   )
// )
// ThisBuild / pomIncludeRepository := { _ => false }
// ThisBuild / publishTo := {
//   val nexus = "https://oss.sonatype.org/"
//   if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
//   else Some("releases" at nexus + "service/local/staging/deploy/maven2")
// }
// ThisBuild / publishMavenStyle := true
