public class LoggingConfig {

    private final boolean timeStamp;
    private final boolean line;
    private final boolean fileName;
    private final boolean threadId;
    private final boolean processID;

    public LoggingConfig(Builder builder) {
        this.timeStamp = builder.timeStamp;
        this.line = builder.line;
        this.fileName = builder.fileName;
        this.threadId = builder.threadId;
        this.processID = builder.processID;
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

    static class Builder {
        private boolean timeStamp;
        private boolean line;
        private boolean fileName;
        private boolean threadId;
        private boolean processID;


        public Builder withTimeStamp(){
            this.timeStamp = true;
            return this;
        }
        public Builder withLine(){
            this.line = true;
            return this;
        }

        public Builder withFileName(){
            this.fileName = true;
            return this;
        }

        public Builder withThreadId(){
            this.threadId = true;
            return this;
        }

        public Builder withProcessID(){
            this.processID = true;
            return this;
        }
        public LoggingConfig build() {
            return new LoggingConfig(this);
        }
    }
}
