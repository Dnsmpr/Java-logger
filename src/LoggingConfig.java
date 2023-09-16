public class LoggingConfig {

    private boolean timeStamp;
    private boolean line;
    private boolean fileName;
    private boolean threadId;
    private boolean processID;
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

    public LoggingConfig withTimeStamp(boolean timeStamp){
        this.timeStamp = timeStamp;
        return this;
    }
    public LoggingConfig withLine(boolean line){
        this.line = line;
        return this;
    }

    public LoggingConfig withFileName(boolean fileName){
        this.fileName = fileName;
        return this;
    }

    public LoggingConfig withThreadId(boolean threadId){
        this.threadId = threadId;
        return this;
    }

    public LoggingConfig withProcessID(boolean processID){
        this.processID = processID;
        return this;
    }
}
