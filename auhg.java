import android.os.SystemClock;

public final class auhg implements Runnable {
    public final auhh a;
    public final int b;

    public auhg(auhh auhh0, int v) {
        this.a = auhh0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.b = SystemClock.elapsedRealtime();
        atxs atxs0 = this.a.g.i.b;
        if(atxs0 != null) {
            atxs0.d(this.b);
        }
    }
}

