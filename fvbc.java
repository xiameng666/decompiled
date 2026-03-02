import android.os.SystemClock;
import android.util.Pair;

public final class fvbc implements Runnable {
    public final fvbo a;

    public fvbc(fvbo fvbo0) {
        this.a = fvbo0;
    }

    @Override
    public final void run() {
        fvbo fvbo0 = this.a;
        cjhf cjhf0 = fvbo0.g.k;
        fvbw fvbw0 = fvbo0.n ? ((fvbw)((ProtoLiteMessage)fvbx.a).v_newBuilder()) : null;
        fvbo0.f(cjhf0, fvbw0);
        synchronized(fvbo0.j) {
            if(fvbw0 != null && fvbo0.m != null) {
                fvbo0.d();
                fvbo0.m.add(Pair.create(Long.valueOf(SystemClock.elapsedRealtimeNanos()), ((fvbx)((ProtoLiteBuilder)fvbw0).N_build())));
            }
        }
    }
}

