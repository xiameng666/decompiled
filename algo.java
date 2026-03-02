import com.google.android.gms.auth.proximity.firstparty.Subscription;

public final class algo implements Runnable {
    public final algs a;
    public final Subscription b;

    public algo(algs algs0, Subscription subscription0) {
        this.a = algs0;
        this.b = subscription0;
    }

    @Override
    public final void run() {
        this.a.a.i(this.b);
    }
}

