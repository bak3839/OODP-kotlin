package chain_of_responsibility.log

enum class LogLevel {
    // 뒤에 오는 쪽의 ordinal이 더 큰값을 반환
    INFO, DEBUG, WARN
}

abstract class Logger {
    protected var level: LogLevel = LogLevel.INFO
    protected var nextLogger: Logger? = null

    // 다음 logger 연결
    fun chainNextLogger(nextLogger: Logger) {
        this.nextLogger = nextLogger
    }

    fun logMessage(level: LogLevel, message: String) {
        if(this.level.ordinal <= level.ordinal) {
            write(message)
        }

        nextLogger?.logMessage(level, message)
    }

    protected abstract fun write(message: String)
}

class ConsoleLogger(
    level: LogLevel
) : Logger() {
    init {
        this.level = level
    }

    override fun write(message: String) {
        println("Console::Logger: $message")
    }
}

class FileLogger(
    level: LogLevel
) : Logger() {
    init {
        this.level = level
    }

    override fun write(message: String) {
        println("File::Logger: $message")
    }
}

class NetworkLogger(
    level: LogLevel
) : Logger() {
    init {
        this.level = level
    }

    override fun write(message: String) {
        println("Network::Logger: $message")
    }
}