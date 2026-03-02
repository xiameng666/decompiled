import android.os.SystemClock;

public final class atoa implements bbng {
    private static atoa a;

    @Override  // bbng
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override  // bbng
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override  // bbng
    public final long c() {
        return System.nanoTime();
    }

    public static atoa d() {
        if(atoa.a == null) {
            atoa.a = new atoa();
        }
        return atoa.a;
    }
}

