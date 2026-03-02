import android.os.SystemClock;

public final class fves implements Runnable {
    public final fvet a;

    public fves(fvet fvet0) {
        this.a = fvet0;
    }

    @Override
    public final void run() {
        fvev fvev0 = this.a.a;
        if(!fvev0.j && fvev0.h != null && fvev0.b != null) {
            long v = fvev0.c - ((long)(hunn.a.e().b() * ((double)fvev0.h.b.toMillis())));
            long v1 = SystemClock.elapsedRealtime();
            if(v < v1 && v1 < fvev0.c) {
                fvev0.f();
            }
        }
    }
}

