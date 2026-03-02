import android.os.SystemClock;
import android.text.TextUtils;
import j..util.Objects;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class gprm {
    private final int a;
    protected final String[] c;
    public final int d;
    public final long e;
    public final long f;

    protected gprm(String[] arr_s, int v, int v1, long v2, boolean z, long v3) {
        this.c = arr_s;
        this.d = v;
        this.a = (z ? 0x8000 : 0) | v1;
        this.e = v2;
        this.f = v3;
    }

    protected gprm(String[] arr_s, int v, gprh gprh0, boolean z) {
        this.c = arr_s;
        this.d = v;
        this.a = gprh0.b();
        this.e = SystemClock.elapsedRealtime();
        if(z) {
            this.f = 0L;
            return;
        }
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        gprh0.d(4);
        int v1 = gprh0.c;
        gprh0.c = v1 + 1;
        gprh0.c = v1 + 2;
        gprh0.c = v1 + 3;
        gprh0.c = v1 + 4;
        this.f = timeUnit0.toMillis(((long)(gprh0.a[v1 + 1] & 0xFF)) << 16 | ((long)(gprh0.a[v1] & 0xFF)) << 24 | ((long)(gprh0.a[v1 + 2] & 0xFF)) << 8 | ((long)(gprh0.a[v1 + 3] & 0xFF)));
        int v2 = gprh0.b();
        int v3 = gprh0.c + v2;
        if(v3 > gprh0.b) {
            throw new IOException(String.format(Locale.ROOT, "attempt to set limit beyond available data: %d exceeds %d", ((int)(gprh0.c + v2)), ((int)gprh0.b)));
        }
        gprh0.d = v3;
        this.a(gprh0);
        gprh0.d = -1;
    }

    protected abstract void a(gprh arg1);

    protected abstract void b(gpri arg1);

    public final long d(long v) {
        long v1 = this.e;
        if(v1 == 0L) {
            return this.f;
        }
        long v2 = v - v1;
        return v2 <= this.f ? this.f - v2 : 0L;
    }

    public static String e(String[] arr_s) {
        return arr_s == null ? null : TextUtils.join(".", arr_s);
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof gprm) ? gpqj.b(this.c, ((gprm)object0).c) && this.d == ((gprm)object0).d : false;
    }

    public final void f(gpri gpri0) {
        gpri0.c(this.c);
        gpri0.d(this.d);
        gpri0.d(this.a);
    }

    public final boolean g() {
        return (this.a & 0x8000) != 0;
    }

    public static boolean h(String[] arr_s, String[] arr_s1) {
        int v = arr_s1.length - arr_s.length;
        if(v > 0) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!gpqj.c(arr_s[v1], arr_s1[v1 + v])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(gpqj.d(this.c)), ((int)this.d)});
    }

    public final void i(gpri gpri0) {
        this.f(gpri0);
        long v = this.d(0L);
        long v1 = TimeUnit.MILLISECONDS.toSeconds(v);
        gpri0.a(4);
        int v2 = gpri0.b;
        gpri0.b = v2 + 1;
        gpri0.a[v2] = (byte)(((int)(v1 >>> 24 & 0xFFL)));
        gpri0.b = v2 + 2;
        gpri0.a[v2 + 1] = (byte)(((int)(v1 >>> 16 & 0xFFL)));
        gpri0.b = v2 + 3;
        gpri0.a[v2 + 2] = (byte)(((int)(v1 >>> 8 & 0xFFL)));
        gpri0.b = v2 + 4;
        gpri0.a[v2 + 3] = (byte)(((int)(v1 & 0xFFL)));
        gpri0.d(0);
        int v3 = gpri0.b;
        this.b(gpri0);
        int v4 = gpri0.b;
        if(gpri0.c != -1 || v2 + 4 > v4 || v2 + 4 < 0) {
            throw new IOException("invalid rewind");
        }
        gpri0.c = v4;
        gpri0.b = v2 + 4;
        gpri0.d(v4 - v3);
        int v5 = gpri0.c;
        if(v5 == -1) {
            throw new IOException("no rewind is in effect");
        }
        gpri0.b = v5;
        gpri0.c = -1;
    }
}

