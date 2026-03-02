import android.os.SystemClock;

abstract class ffee {
    public final long a;
    public final String b;

    public ffee(String s) {
        this.b = s;
        this.a = SystemClock.elapsedRealtime();
    }

    public abstract void a();
}

