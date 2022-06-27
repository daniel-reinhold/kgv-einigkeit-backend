package de.kgvzschocken

import io.ktor.server.application.*
import de.kgvzschocken.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}
