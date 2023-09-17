public class LoggingConfig extends BaseBuilder {

    private final boolean timeStamp;
    private final boolean line;
    private final boolean fileName;
    private final boolean threadId;
    private final boolean processID;

    public LoggingConfig(Builder builder) {
        this.timeStamp = builder.isTimeStamp();
        this.line = builder.isLine();
        this.fileName = builder.isFileName();
        this.threadId = builder.isThreadId();
        this.processID = builder.isProcessID();
    }
    public boolean isTimeStamp() {
        return timeStamp;
    }

    public boolean isLine() {
        return line;
    }

    public boolean isFileName() {
        return fileName;
    }

    public boolean isThreadId() {
        return threadId;
    }

    public boolean isProcessID() {
        return processID;
    }

}
