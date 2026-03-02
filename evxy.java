public final class evxy extends Exception {
    public evxy(String s) {
        super(s);
    }

    public evxy(Throwable throwable0) {
        super("Failed to start mDNS service browser", throwable0);
    }
}

