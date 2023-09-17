public class ConsoleLogger extends BaseLogger implements Logger {

    ConsoleLogger(LoggingConfig config) {
        super(config);
    }
    @Override
    public synchronized void log(String message) {
        System.out.println(createLogMessage(message));
    }
}
