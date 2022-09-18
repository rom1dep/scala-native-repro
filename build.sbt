scalaVersion := "3.2.0"

enablePlugins(ScalaNativePlugin)
libraryDependencies ++= Seq(
  "org.typelevel"%%%"cats-effect"%"3.3.14",
  "com.lihaoyi"%%%"os-lib"%"0.8.1"
)
