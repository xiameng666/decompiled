import android.os.SystemClock;

public final class hbve implements hbqx {
    public final hbvg a;
    public final hbkn b;
    public final long c;

    public hbve(hbvg hbvg0, hbkn hbkn0, long v) {
        this.a = hbvg0;
        this.b = hbkn0;
        this.c = v;
    }

    @Override  // hbqx
    public final hbrb a() {
        hbkp hbkp0 = new hbkp();
        hbkp0.c = hbkm.b;
        hblu hblu0 = new hblu();
        hblu0.b = this.b;
        hbix hbix0 = new hbix();
        hbix0.a = this.a.d.h();
        hblu0.a = new hbiz(hbix0);
        long v = SystemClock.elapsedRealtime() - this.c;
        Long.valueOf(v).getClass();
        hblu0.c = (long)(v & 0x7FFFFFFFFFFFFFFFL);
        hbkp0.m = new hblv(hblu0);
        return new hbrb(hbkp0, 0);
    }
}

