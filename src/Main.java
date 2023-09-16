public class Main {

    public static void main(String[] args) {
        LoggingConfig config = new LoggingConfig
                .Builder()
                .withTimeStamp()
                .withFileName()
                .withProcessID()
                .withThreadId()
                .withLine()
                .build();
        LoggerFactory factory = new ConsoleLoggerFactory(config);
        Logger ConsoleLogger = factory.createLogger();
        ConsoleLogger.log("Not allowed to use function like this!");
    }


}