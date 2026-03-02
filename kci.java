import android.os.PersistableBundle;

public final class kci implements Runnable {
    public final kcu a;
    public final PersistableBundle b;

    public kci(kcu kcu0, PersistableBundle persistableBundle0) {
        this.a = kcu0;
        this.b = persistableBundle0;
    }

    @Override
    public final void run() {
        this.a.g.removeControlee(this.b);
    }
}

