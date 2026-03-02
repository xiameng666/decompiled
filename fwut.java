import android.os.SystemClock;

public final class fwut implements Runnable {
    public final fwux a;
    public final fwzf b;
    public final long c;
    public final Runnable d;

    public fwut(fwux fwux0, fwzf fwzf0, long v, Runnable runnable0) {
        this.a = fwux0;
        this.b = fwzf0;
        this.c = v;
        this.d = runnable0;
    }

    @Override
    public final void run() {
        fwux fwux0 = this.a;
        fwzf fwzf0 = this.b;
        if(!huvd.z()) {
            if(fwzf0 == fwzf.a) {
                fwwq.b(fwux0.b);
            }
        }
        else if(fwzf0 == fwzf.v) {
            fwwq.b(fwux0.b);
        }
        long v = SystemClock.elapsedRealtime() - this.c;
        fwso.d(fwux0.c, fwzf0, ((int)v), fwux0.f.t);
        this.d.run();
        fwuw fwuw0 = new fwuw(fwux0, fwzf0);
        fwux0.f.r(fwuw0);
    }
}

