import android.os.SystemClock;

public final class ddhv extends ibzr {
    public static final ddhv a;

    static {
        ddhv.a = new ddhv();
    }

    private ddhv() {
        super(ibzz.c);
    }

    @Override  // ibzr
    protected final long a() {
        return SystemClock.elapsedRealtime();
    }
}

