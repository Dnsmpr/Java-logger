public class ConsoleLoggerFactory implements LoggerFactory {
    private final LoggingConfig config;

    ConsoleLoggerFactory(LoggingConfig config) {
        this.config = config;
    }
    @Override
    public Logger createLogger() {
        return new ConsoleLogger(this.config);
    }
}
