import java.text.SimpleDateFormat;

public class ConsoleLogger implements Logger {
    private final LoggingConfig config;

    ConsoleLogger(LoggingConfig config) {
        this.config = config;
    }
    @Override
    public void log(String message) {
        System.out.println(createLogMessage(message));
    }

    private String createLogMessage(String message) {
        StringBuilder logMessage = new StringBuilder(message + "\n");
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        if(this.config.isTimeStamp()) {
            logMessage.append("Time stamp: ")
                    .append(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()))
                    .append("\n");
        }

        if(this.config.isLine()) {
            logMessage.append("line: ").append(stackTraceElement.getLineNumber()).append("\n");
        }

        if(this.config.isFileName()) {
            logMessage.append("File name: ").append(stackTraceElement.getFileName()).append("\n");
        }

        if(this.config.isThreadId()) {
            logMessage.append("Thread ID: ").append(Thread.currentThread().getId()).append("\n");
        }
        if(this.config.isProcessID()) {
            logMessage.append("Process ID: ").append(ProcessHandle.current().pid()).append("\n");
        }

        return logMessage.toString();
    }
}
