import android.hardware.SensorEvent;

public final class fvos extends fvkt {
    private final long d;

    public fvos(fvnr fvnr0, fvls fvls0, long v) {
        super(fvnr0, fvls0);
        this.d = v;
    }

    @Override  // fvkt
    public final void a() {
        this.c.postDelayed(this.a, this.d);
    }

    @Override  // fvkt
    public final void b() {
        this.c.removeCallbacks(this.a);
    }

    @Override  // fvkt
    public final void c(fvns fvns0, long v, SensorEvent sensorEvent0) {
    }
}

