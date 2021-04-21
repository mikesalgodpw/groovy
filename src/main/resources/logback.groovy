import ch.qos.logback.classic.encoder.PatternLayoutEncoder

import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import static ch.qos.logback.classic.Level.DEBUG

def LOG_PATH = "logs"

appender("Console-Appender", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%date{\"yyyy-MM-dd'T'HH:mm:ss.SSS\", UTC} %-35([%thread]) [%X{className}/%X{methodName}] %-5level %logger{0} - %msg%n"
    }
}

appender("File-Appender", FileAppender) {
    file = "${LOG_PATH}/createpatch.log"
    encoder(PatternLayoutEncoder) {
        pattern = "%date{\"yyyy-MM-dd'T'HH:mm:ss.SSS\", UTC} %-35([%thread]) [%X{className}/%X{methodName}] %-5level %logger{0} - %msg%n"
        outputPatternAsHeader = true
    }
}

root(DEBUG, ["Console-Appender", "File-Appender"])