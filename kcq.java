import android.uwb.RangingReport;

public final class kcq implements Runnable {
    public final kct a;
    public final RangingReport b;
    public final djgk c;

    public kcq(kct kct0, RangingReport rangingReport0, djgk djgk0) {
        this.a = kct0;
        this.b = rangingReport0;
        this.c = djgk0;
    }

    @Override
    public final void run() {
        this.a.a.x(this.b, this.c);
    }
}

