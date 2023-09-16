public class Main {

    public static void main(String[] args) {
        LoggerFactory factory = new ConsoleLoggerFactory();
        Logger ConsoleLogger = factory.createLogger();
        ConsoleLogger.log("hello, this is from line 9 in file: main");
    }


}