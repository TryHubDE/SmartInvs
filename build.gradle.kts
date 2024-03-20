group = "world.avionik"
version = "1.3.1"

plugins {
    id("java")
    alias(libs.plugins.sonatypeCentralPortalPublisher)
}

repositories {
    mavenCentral()

    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
}

signing {
    useGpgCmd()
    sign(configurations.archives.get())
}

centralPortal {
    username = project.findProperty("sonatypeUsername") as String
    password = project.findProperty("sonatypePassword") as String

    pom {
        name.set("Smart Inventories")
        description.set("Simplifies minecraft inventories")
        url.set("https://github.com/avionik-world/SmartInvs")

        developers {
            developer {
                id.set("niklasnieberler")
                email.set("admin@avionik.world")
            }
        }
        licenses {
            license {
                name.set("Apache-2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        scm {
            url.set("https://github.com/avionik-world/SmartInvs.git")
            connection.set("git:git@github.com:avionik-world/SmartInvs.git")
        }
    }
}
