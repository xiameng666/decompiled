public final class fvkb {
    public final long a;
    public short b;
    public long c;

    public fvkb(long v) {
        this.c = -1L;
        this.a = v;
        this.b = 0x7FFF;
    }

    public fvkb(gwwe gwwe0) {
        this(gwwe0.c);
        if((gwwe0.b & 4) != 0) {
            this.b = (short)gwwe0.d;
        }
    }

    public static final short a(long v) {
        long v1 = (long)Math.floor(((double)v) / 86400000.0);
        return (short)(((int)(Math.abs(86400000L * v1 - v) <= 85800000L ? ((long)Math.floor(((double)v) / 86400000.0)) : v1 + 1L)));
    }

    @Override
    public final String toString() {
        return "SeenWifiAp: bssid " + this.a;
    }
}

