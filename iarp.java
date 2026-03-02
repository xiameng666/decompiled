final class iarp {
    public volatile boolean a;
    private long b;
    private long c;

    public final boolean a(long v) {
        synchronized(this) {
            long v1 = this.c;
            if(v1 - v >= 0L) {
                v = v1;
            }
            this.c = v;
            if(Long.compare(this.b - v, 0x20000L) < 0 && this.a) {
                this.a = false;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long v) {
        synchronized(this) {
            long v1 = this.b + v;
            this.b = v1;
            if(v1 - this.c >= 0x20000L && !this.a) {
                this.a = true;
                return true;
            }
        }
        return false;
    }
}

