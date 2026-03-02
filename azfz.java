public final class azfz {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    @Override
    public final String toString() {
        return "Cleanup Results\nNum corrupted PlayLoggerContexts deleted: " + this.d + "\nNum of log events deleted due to over size: " + this.f + "\nBytes of LogEvents deleted due to over size: " + this.b + "\nNum of log events deleted due to too old: " + this.e + "\nBytes of logEvents deleted due to too old: " + this.a + "\nNum of log events deleted due to corrupted PlayLoggerContexts: " + this.g + "\nBytes of logEvents deleted due to corrupted PlayLoggerContexts: " + this.c + "\nNum of log files deleted due to corrupted name: " + this.h;
    }
}

