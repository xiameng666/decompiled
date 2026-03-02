import android.os.PersistableBundle;

public final class kcj implements Runnable {
    public final kcu a;
    public final PersistableBundle b;

    public kcj(kcu kcu0, PersistableBundle persistableBundle0) {
        this.a = kcu0;
        this.b = persistableBundle0;
    }

    @Override
    public final void run() {
        this.a.g.addControlee(this.b);
    }
}

