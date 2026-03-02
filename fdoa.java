public final class fdoa implements ccyq {
    @Override  // ccyq
    public final long a(long v) {
        if(v <= 5000L) {
            return 5000L;
        }
        if(v <= 30000L) {
            return 30000L;
        }
        if(v <= 60000L) {
            return 60000L;
        }
        if(v <= 600000L) {
            return 600000L;
        }
        if(v <= 1800000L) {
            return 1800000L;
        }
        if(v <= 3600000L) {
            return 3600000L;
        }
        if(v <= 14400000L) {
            return 14400000L;
        }
        if(v <= 28800000L) {
            return 28800000L;
        }
        if(v <= 57600000L) {
            return 57600000L;
        }
        return v > 86400000L ? 172800000L : 86400000L;
    }
}

