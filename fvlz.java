import android.hardware.SensorEvent;

public final class fvlz extends fvkt {
    private final fvnx d;
    private int e;
    private long f;

    public fvlz(fvnr fvnr0, fvls fvls0, fvnx fvnx0) {
        super(fvnr0, fvls0);
        this.e = 0;
        this.f = -1L;
        this.d = fvnx0;
    }

    @Override  // fvkt
    public final void a() {
        this.c.postDelayed(this.a, this.d.b);
    }

    @Override  // fvkt
    public final void b() {
        this.c.removeCallbacks(this.a);
    }

    @Override  // fvkt
    public final void c(fvns fvns0, long v, SensorEvent sensorEvent0) {
        if(fvns0 == fvns.d) {
            int v1 = this.e;
            fvnx fvnx0 = this.d;
            int v2 = fvnx0.a;
            if(v1 < v2) {
                this.e = v1 + 1;
                if(v1 + 1 >= v2) {
                    Runnable runnable0 = this.a;
                    this.c.removeCallbacks(runnable0);
                    this.c.postDelayed(runnable0, fvnx0.c + 60L);
                }
            }
            else {
                long v3 = this.f;
                if(v3 < 0L) {
                    this.f = v;
                    return;
                }
                if(v - v3 >= fvnx0.c) {
                    this.c.postAtFrontOfQueue(this.a);
                }
            }
        }
    }
}

