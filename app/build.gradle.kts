plugins {
    id("com.github.ben-manes.versions") version "0.47.0"
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("hexlet.code.App")
}

checkstyle {
    toolVersion = "10.12.1" 
    configFile = file("config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

repositories {
    mavenCentral()
}

dependencies {
}
