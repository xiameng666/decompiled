import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class flul implements glzm {
    public final flvd a;
    public final gmcu b;
    public final gmcd c;
    public final flzo d;
    public final UUID e;

    public flul(flvd flvd0, gmcu gmcu0, gmcd gmcd0, flzo flzo0, UUID uUID0) {
        this.a = flvd0;
        this.b = gmcu0;
        this.c = gmcd0;
        this.d = flzo0;
        this.e = uUID0;
    }

    @Override  // glzm
    public final gmcd a() {
        flzo flzo0 = this.d;
        flvd flvd0 = this.a;
        gmcd gmcd0 = this.c;
        UUID uUID0 = this.e;
        long v = this.b.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((long)(((Long)this.b.u())))) : 0L;
        try {
            flzo0.e(uUID0, gmbu.r(gmcd0), flvd0.c, v);
        }
        catch(Exception exception0) {
            flzo0.d(uUID0, flvt.b().a(flvd0.a, exception0.getCause()), iapk.d(exception0.getCause()), flvd0.c, v);
        }
        return gmcd0;
    }
}

