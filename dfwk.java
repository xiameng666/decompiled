import android.os.SystemClock;

public final class dfwk implements Runnable {
    public final dfzz a;
    public final dcpv b;

    public dfwk(dfzz dfzz0, dcpv dcpv0) {
        this.a = dfzz0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        this.a.K = SystemClock.elapsedRealtime();
        this.a.u.f(true, this.b);
        this.a.ae.g(this.b);
    }
}

