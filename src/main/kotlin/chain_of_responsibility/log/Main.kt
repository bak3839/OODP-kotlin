package chain_of_responsibility.log

private fun getChainOfLoggers(): Logger {
    val networkLogger = NetworkLogger(LogLevel.WARN)
    val fileLogger = FileLogger(LogLevel.DEBUG)
    val consoleLogger = ConsoleLogger(LogLevel.INFO)

    networkLogger.chainNextLogger(fileLogger)
    fileLogger.chainNextLogger(consoleLogger)
    return networkLogger
}

fun main() {
    val loggerChain = getChainOfLoggers()

    loggerChain.logMessage(LogLevel.INFO, "This is an information")
    loggerChain.logMessage(LogLevel.DEBUG, "This is a debug level information")
    loggerChain.logMessage(LogLevel.WARN, "This is a warning information")
}
