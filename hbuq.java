import android.os.SystemClock;

public final class hbuq implements hbqx {
    public final hbkn a;
    public final long b;

    public hbuq(hbkn hbkn0, long v) {
        this.a = hbkn0;
        this.b = v;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbkp hbkp0 = new hbkp();
        hbkp0.c = hbkm.b;
        hblp hblp0 = new hblp();
        hblp0.a = this.a;
        long v = SystemClock.elapsedRealtime() - this.b;
        Long.valueOf(v).getClass();
        hblp0.b = (long)(v & 0x7FFFFFFFFFFFFFFFL);
        hbkp0.p = new hblq(hblp0);
        return new hbrb(hbkp0, 0);
    }
}

