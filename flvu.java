import android.util.Pair;

public final class flvu implements Runnable {
    public final flvw a;
    public final Pair b;

    public flvu(flvw flvw0, Pair pair0) {
        this.a = flvw0;
        this.b = pair0;
    }

    @Override
    public final void run() {
        flvw flvw0 = this.a;
        Pair pair0 = this.b;
        synchronized(flvw0) {
            try {
                ((gmcu)pair0.first).q(flvw0.a.get());
                flvw0.a = null;
                flvw0.b();
            }
            catch(Throwable throwable0) {
                ((gmcu)pair0.first).r(throwable0);
                flvw0.a = null;
                flvw0.c(throwable0);
            }
        }
    }
}

