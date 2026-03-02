import java.util.Set;

public final class flsg implements Runnable {
    public final flsl a;
    public final fmaj b;

    public flsg(flsl flsl0, fmaj fmaj0) {
        this.a = flsl0;
        this.b = fmaj0;
    }

    @Override
    public final void run() {
        Set set0 = this.a.b;
        fmaj fmaj0 = this.b;
        synchronized(set0) {
            for(Object object0: set0) {
                ((flsl)object0).b(fmaj0);
            }
        }
    }
}

