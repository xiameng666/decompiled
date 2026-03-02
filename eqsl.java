import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class eqsl {
    public final Executor a;
    public final eqsk b;
    public long c;
    public boolean d;
    public long e;
    private static final erqc f;
    private final ExecutorService g;
    private final Runnable h;

    static {
        eqsl.f = new erqc(new String[]{"TimeoutHelper"});
    }

    public eqsl(ExecutorService executorService0, Executor executor0, long v, eqsk eqsk0) {
        this.h = new eqsi(this);
        this.d = true;
        this.g = executorService0;
        this.a = executor0;
        this.e = v;
        this.b = eqsk0;
    }

    public final void a() {
        eqsl.f.j("started", new Object[0]);
        this.c = SystemClock.elapsedRealtime();
        this.d = false;
        this.c();
    }

    public final void b() {
        synchronized(this) {
            eqsl.f.j("stopped", new Object[0]);
            this.d = true;
        }
    }

    public final void c() {
        this.g.execute(this.h);
    }

    public final void d() {
        synchronized(this) {
            eqsl.f.j("updated", new Object[0]);
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public final void e(long v) {
        synchronized(this) {
            eqsl.f.j(a.u(v, "updateTimeoutValue: "), new Object[0]);
            this.e = v;
        }
    }

    public final boolean f() {
        return !this.d;
    }
}

