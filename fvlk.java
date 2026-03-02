import android.location.GnssNavigationMessage;

public final class fvlk implements Runnable {
    public final fvls a;
    public final GnssNavigationMessage b;
    public final long c;

    public fvlk(fvls fvls0, GnssNavigationMessage gnssNavigationMessage0, long v) {
        this.a = fvls0;
        this.b = gnssNavigationMessage0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.a.k(this.b, this.c);
    }
}

