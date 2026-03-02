import android.os.SystemClock;
import java.io.File;

public final class dfyc implements Runnable {
    public final dfzz a;
    public final dcpv b;

    public dfyc(dfzz dfzz0, dcpv dcpv0) {
        this.a = dfzz0;
        this.b = dcpv0;
    }

    @Override
    public final void run() {
        this.a.K = SystemClock.elapsedRealtime();
        this.a.ae.i(this.b);
        this.a.t.j(this.b);
        this.a.u.f(false, this.b);
        this.a.k.d();
        dfzz.aS(this.a.c);
        dfzz.aS(this.a.e);
        File file0 = this.a.aj(false);
        djas.f(this.a.i, file0);
        djad.j(this.a.aj(true), hvqs.as());
        djad.j(djao.c(this.a.i), hvqs.h());
    }
}

