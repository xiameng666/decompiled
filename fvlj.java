import android.location.GnssMeasurementsEvent;

public final class fvlj implements Runnable {
    public final fvls a;
    public final GnssMeasurementsEvent b;
    public final long c;

    public fvlj(fvls fvls0, GnssMeasurementsEvent gnssMeasurementsEvent0, long v) {
        this.a = fvls0;
        this.b = gnssMeasurementsEvent0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.a.j(this.b, this.c);
    }
}

