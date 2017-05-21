buildscript {

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

plugins {
    application
}

apply {
    plugin("kotlin")
    plugin("groovy")
}

application {
    mainClassName = "tennis.HelloWorldKt"
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    compile(kotlinModule("stdlib"))
    testCompile("org.spockframework:spock-core:1.0-groovy-2.4")
    testCompile("org.codehaus.groovy:groovy-all:2.4.5")
}
