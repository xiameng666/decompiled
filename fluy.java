import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class fluy implements glzm {
    public final flvd a;
    public final gmcu b;
    public final gmcd c;
    public final UUID d;
    public final flyz e;

    public fluy(flvd flvd0, gmcu gmcu0, gmcd gmcd0, flyz flyz0, UUID uUID0) {
        this.a = flvd0;
        this.b = gmcu0;
        this.c = gmcd0;
        this.e = flyz0;
        this.d = uUID0;
    }

    @Override  // glzm
    public final gmcd a() {
        flvd flvd0 = this.a;
        gmcd gmcd0 = this.c;
        flyz flyz0 = this.e;
        UUID uUID0 = this.d;
        long v = this.b.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((long)(((Long)this.b.u())))) : 0L;
        try {
            Void void0 = (Void)gmbu.r(gmcd0);
            fmai fmai0 = fmaj.a();
            fmai0.g(10003);
            fmai0.n(flyz0.a.c().f());
            fmai0.o(flyz0.a.d().toStringUtf8());
            fmai0.p(uUID0.toString());
            fmai0.j(11);
            fmai0.f(1);
            fmai0.e(v);
            fmaj fmaj0 = fmai0.a();
            flvd0.c.b(fmaj0);
        }
        catch(Exception exception0) {
            int v1 = flvt.b().a(flvd0.a, exception0.getCause());
            fmai fmai1 = fmaj.a();
            fmai1.g(10003);
            fmai1.n(flyz0.a.c().f());
            fmai1.o(flyz0.a.d().toStringUtf8());
            fmai1.p(uUID0.toString());
            fmai1.j(11);
            fmai1.m(Integer.valueOf(iapk.d(exception0.getCause()).t.r));
            fmai1.f(v1);
            fmai1.e(v);
            fmaj fmaj1 = fmai1.a();
            flvd0.c.b(fmaj1);
        }
        return gmcd0;
    }
}

