import android.os.PersistableBundle;

public final class kcm implements Runnable {
    public final kcu a;

    public kcm(kcu kcu0) {
        this.a = kcu0;
    }

    @Override
    public final void run() {
        this.a.g.start(new PersistableBundle());
    }
}

