public class Main {

    public static void main(String[] args) {
        LoggingConfig config = new LoggingConfig()
                .withLine(true)
                .withTimeStamp(true)
                .withProcessID(true)
                .withThreadId(true)
                .withFileName(true);
        LoggerFactory factory = new ConsoleLoggerFactory(config);
        Logger ConsoleLogger = factory.createLogger();
        ConsoleLogger.log("Not allowed to use function like this!");
    }


}