import android.os.SystemClock;
import java.util.Map;
import java.util.Set;

public final class czrx {
    private final Map a;
    private long b;
    private long c;
    private int d;

    public czrx() {
        this.a = new bxd();
        this.b = hvog.g();
        this.c = SystemClock.elapsedRealtime() - hvog.h();
        this.d = 1;
    }

    public final long a() {
        long v1;
        synchronized(this) {
            v1 = SystemClock.elapsedRealtime();
        }
        return v1 - this.c;
    }

    public final Set b() {
        Set set0;
        synchronized(this) {
            set0 = new bxf(this.a.values());
        }
        return set0;
    }

    public final void c(int v, byte[] arr_b) {
        synchronized(this) {
            this.a.put(Integer.valueOf(v), arr_b);
        }
    }

    public final void d(boolean z) {
        int v1;
        synchronized(this) {
            this.c = SystemClock.elapsedRealtime();
            if(z) {
                this.b = hvog.g();
                v1 = 2;
            }
            else {
                this.b = this.d == 3 ? Math.min(((long)(hvog.a.bk().a() * ((double)this.b))), hvog.h()) : hvog.g();
                v1 = 3;
            }
            this.d = v1;
        }
    }

    public final boolean e(int v) {
        synchronized(this) {
        }
        return this.a.containsKey(Integer.valueOf(v));
    }

    public final int f() {
        long v1;
        synchronized(this) {
            if(this.d == 2) {
                return 3;
            }
            v1 = this.a();
        }
        return Long.compare(v1, this.b) >= 0 ? 2 : 4;
    }
}

