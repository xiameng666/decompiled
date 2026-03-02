import android.os.Bundle;
import android.os.SystemClock;
import j..util.Objects;

final class crpo {
    protected long a;
    protected long b;
    final crpq c;
    private final crdj d;

    public crpo(crpq crpq0) {
        Objects.requireNonNull(crpq0);
        this.c = crpq0;
        super();
        this.d = new crpn(this, crpq0.y);
        long v = SystemClock.elapsedRealtime();
        this.a = v;
        this.b = v;
    }

    final long a(long v) {
        long v1 = v - this.b;
        this.b = v;
        return v1;
    }

    final void b(long v) {
        this.c.n();
        this.d.a();
        this.a = v;
        this.b = v;
    }

    public final boolean c(boolean z, boolean z1, long v) {
        crpq crpq0 = this.c;
        crpq0.n();
        crpq0.a();
        if(crpq0.y.v()) {
            crpq0.ap().o.b(System.currentTimeMillis());
        }
        long v1 = v - this.a;
        if(!z && v1 < 1000L) {
            crpq0.aJ().k.b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(v1));
            return false;
        }
        if(!z1) {
            v1 = this.a(v);
        }
        crpq0.aJ().k.b("Recording user engagement, ms", Long.valueOf(v1));
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_et", v1);
        crqx.H(crpq0.j().t(((boolean)(crpq0.am().w() ^ 1))), bundle0, true);
        if(!z1) {
            crpq0.h().w("auto", "_e", bundle0);
        }
        this.a = v;
        this.d.a();
        long v2 = (long)(((Long)crif.aj.a()));
        this.d.c(v2);
        return true;
    }

    final void d() {
        this.d.a();
    }
}

