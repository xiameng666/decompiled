import android.util.Pair;

public final class flic implements Runnable {
    public final flit a;
    public final Pair b;

    public flic(flit flit0, Pair pair0) {
        this.a = flit0;
        this.b = pair0;
    }

    @Override
    public final void run() {
        synchronized(this.a.h) {
            this.a.l.remove(this.b);
        }
    }
}

