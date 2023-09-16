public class LoggingConfig {
    boolean timeStamp;
    boolean line;
    boolean fileName;
    boolean threadId;
    boolean processID;

    public LoggingConfig withTimeStamp(boolean timeStamp){
        this.timeStamp = timeStamp;
        return this;
    }
}
