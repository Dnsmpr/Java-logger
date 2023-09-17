abstract class BaseBuilder {

    static class Builder {
        private boolean timeStamp;

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

        private boolean line;
        private boolean fileName;
        private boolean threadId;
        private boolean processID;


        public Builder withTimeStamp() {
            this.timeStamp = true;
            return this;
        }
        public Builder withLine(){
            this.line = true;
            return this;
        }

        public Builder withFileName() {
            this.fileName = true;
            return this;
        }

        public Builder withThreadId() {
            this.threadId = true;
            return this;
        }

        public Builder withProcessID() {
            this.processID = true;
            return this;
        }
        public LoggingConfig build() {
            return new LoggingConfig(this);
        }
    }
}