import android.os.SystemClock;
import j..util.Objects;

final class crpi implements Runnable {
    final long a;
    final crpq b;

    public crpi(crpq crpq0, long v) {
        this.a = v;
        Objects.requireNonNull(crpq0);
        this.b = crpq0;
        super();
    }

    @Override
    public final void run() {
        crpq crpq0 = this.b;
        crpq0.n();
        crpq0.q();
        crjg crjg0 = crpq0.aJ().k;
        long v = this.a;
        crjg0.b("Activity resumed, time", Long.valueOf(v));
        if(!crpq0.am().t(crif.aH)) {
            if(crpq0.am().w() || crpq0.ap().r.b()) {
                crpq0.d.b(v);
            }
        }
        else if(crpq0.am().w() || crpq0.b) {
            crpq0.d.b(v);
        }
        crpq crpq1 = crpq0.e.b;
        crpq1.n();
        crpl crpl0 = crpq0.e.a;
        if(crpl0 != null) {
            crpq1.a.removeCallbacks(crpl0);
        }
        crpq1.ap().r.a(false);
        crpq1.r(false);
        if(crpq1.am().t(crif.aG) && crpq1.h().f) {
            crpq1.aJ().k.a("Retrying trigger URI registration in foreground");
            crpq1.h().y();
        }
        crpp crpp0 = crpq0.c;
        crpq crpq2 = crpp0.a;
        crpq2.n();
        if(!crpq2.y.v()) {
            return;
        }
        crpp0.c(System.currentTimeMillis(), (crpq2.am().t(crif.aT) ? SystemClock.elapsedRealtime() : 0L));
    }
}

