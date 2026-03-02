import android.hardware.SensorEvent;

public abstract class fvkt {
    protected final Runnable a;
    public final fvnr b;
    public final fvls c;

    public fvkt(fvnr fvnr0, fvls fvls0) {
        this.a = new fvks(this);
        this.b = fvnr0;
        this.c = fvls0;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(fvns arg1, long arg2, SensorEvent arg3);
}

