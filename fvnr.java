import android.hardware.SensorEvent;
import android.os.Looper;

public abstract class fvnr {
    private volatile boolean a;
    private volatile fvlv b;
    protected final fybc j;
    protected final fvlt k;
    public final fvsi l;
    public final fvls m;
    protected volatile fvkt n;
    volatile boolean o;

    public fvnr(fvls fvls0, fvlt fvlt0, fybc fybc0) {
        boolean z = false;
        this.a = false;
        this.o = false;
        gftb.z(fvls0, "No Handler specified!");
        this.m = fvls0;
        this.j = fybc0;
        fvsi fvsi0 = new fvsi(this.getClass().getSimpleName());
        this.l = fvsi0;
        Looper looper0 = fvls0.getLooper();
        if(looper0 != null) {
            Thread thread0 = looper0.getThread();
            if(fvsi0.b == thread0) {
                z = true;
            }
            gftb.b(z, "Scanner should be called in handler\'s thread.");
        }
        this.k = fvlt0;
    }

    protected abstract void b();

    protected abstract void c();

    public final void i(fvns fvns0, long v, SensorEvent sensorEvent0) {
        if(this.b != null) {
            fvlv fvlv0 = this.b;
            if(fvlv0.n != null) {
                fvlv0.n.c(fvns0, v, sensorEvent0);
            }
        }
    }

    final void j() {
        synchronized(this) {
            gftb.b(this.o, "Call start before calling stop!");
            if(!this.a) {
                this.a = true;
                if(this.n != null) {
                    this.n.b();
                }
                this.c();
                this.getClass();
                return;
            }
            this.getClass();
        }
    }

    public final boolean k() {
        synchronized(this) {
        }
        return this.a;
    }

    final void l(fvlv fvlv0) {
        synchronized(this) {
            this.m(null, fvlv0);
        }
    }

    final void m(fvkt fvkt0, fvlv fvlv0) {
        synchronized(this) {
            this.l.a();
            gftb.b(((boolean)(this.o ^ 1)), "Start should be called only once!");
            this.n = fvkt0;
            if(fvkt0 != null) {
                fvkt0.a();
            }
            this.b = fvlv0;
            this.b();
            this.o = true;
            this.getClass();
        }
    }
}

