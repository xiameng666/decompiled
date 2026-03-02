import android.os.SystemClock;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

abstract class cjhv implements cjic, Closeable {
    public final cjif a;
    private volatile Throwable b;
    private volatile long c;
    private int d;

    public cjhv(cjif cjif0) {
        this.c = 0L;
        this.d = 0;
        this.a = cjif0;
        this.b = null;
    }

    @Override  // cjic
    public final long a() {
        return this.c;
    }

    @Override  // cjic
    public final Throwable b() {
        return this.b;
    }

    protected abstract void c();

    @Override
    public final void close() {
        this.e();
    }

    protected abstract void d();

    public final void e() {
        synchronized(this) {
            int v1 = this.d;
            if(v1 == 0) {
                return;
            }
            if(v1 > 1) {
                this.d = v1 - 1;
                return;
            }
            this.d();
            this.b = null;
            --this.d;
        }
    }

    protected abstract boolean f(long arg1, TimeUnit arg2);

    @Override
    public final void finalize() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.d <= 0) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalStateException("Lock wasn\'t released correctly");
    }

    public final boolean g() {
        synchronized(this) {
        }
        return this.d > 0;
    }

    public final boolean h(long v, TimeUnit timeUnit0) {
        synchronized(this) {
            if(this.d > 0) {
                this.c = SystemClock.elapsedRealtime();
                this.b = new Throwable();
                ++this.d;
                return true;
            }
            if(!this.f(v, timeUnit0)) {
                return false;
            }
            this.c = SystemClock.elapsedRealtime();
            this.b = new Throwable();
            ++this.d;
        }
        return true;
    }

    public final void i() {
        synchronized(this) {
            if(this.d > 0) {
                this.c = SystemClock.elapsedRealtime();
                this.b = new Throwable();
                ++this.d;
                return;
            }
            this.c();
            this.c = SystemClock.elapsedRealtime();
            this.b = new Throwable();
            ++this.d;
        }
    }
}

