import android.os.SystemClock;
import j..util.Objects;

abstract class crbj implements Runnable {
    final long c;
    final long d;
    final boolean e;
    final crbs f;

    public crbj(crbs crbs0) {
        this(crbs0, true);
    }

    public crbj(crbs crbs0, boolean z) {
        Objects.requireNonNull(crbs0);
        this.f = crbs0;
        super();
        this.c = System.currentTimeMillis();
        this.d = SystemClock.elapsedRealtime();
        this.e = z;
    }

    public abstract void a();

    @Override
    public final void run() {
        if(this.f.d) {
            return;
        }
        try {
            this.a();
        }
        catch(Exception exception0) {
            this.f.a(exception0, false, this.e);
        }
    }
}

