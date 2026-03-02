import android.os.SystemClock;

public final class fxps implements fxpt {
    private final long a;
    private int b;
    private long c;

    public fxps(long v) {
        this.a = v;
        this.c = -v;
    }

    @Override  // fxpt
    public final boolean b(Runnable runnable0) {
        long v = SystemClock.elapsedRealtime();
        if(Long.compare(v - this.c, this.a) < 0) {
            ++this.b;
            return false;
        }
        this.c = v;
        runnable0.run();
        return true;
    }
}

