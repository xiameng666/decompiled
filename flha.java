import android.util.Pair;

public final class flha implements Runnable {
    public final flit a;
    public final Pair b;

    public flha(flit flit0, Pair pair0) {
        this.a = flit0;
        this.b = pair0;
    }

    @Override
    public final void run() {
        synchronized(this.a.g) {
            this.a.k.remove(this.b);
        }
    }
}

