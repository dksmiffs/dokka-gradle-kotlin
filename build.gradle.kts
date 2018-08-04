// github.com guidance:
//    gradle/kotlin-dsl/blob/master/samples/hello-kotlin/build.gradle.kts
//    sureshg/kotlin-starter/blob/master/build.gradle.kts
//    eriwen/gradle-digest-plugin/blob/master/build.gradle.kts
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
  application
  id("org.jetbrains.dokka") version "0.9.17"
  kotlin("jvm") version "1.2.60"
}

application {
  mainClassName = "HelloDokka"
}

dependencies {
  compile(kotlin("stdlib"))
}

repositories {
  jcenter()
}

defaultTasks("run")

val dokka by tasks.getting(DokkaTask::class) {
  outputFormat = "html"
  outputDirectory = "$buildDir/javadoc"
  jdkVersion = 8
  reportUndocumented = true
}

