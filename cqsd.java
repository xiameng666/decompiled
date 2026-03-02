import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class cqsd {
    private final long a;
    protected final String[] c;
    public final int d;
    public final long e;

    protected cqsd(String[] arr_s, int v, cqrw cqrw0) {
        this.c = arr_s;
        this.d = v;
        cqrw0.b();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        cqrw0.d(4);
        int v1 = cqrw0.c;
        cqrw0.c = v1 + 1;
        cqrw0.c = v1 + 2;
        cqrw0.c = v1 + 3;
        cqrw0.c = v1 + 4;
        this.e = timeUnit0.toMillis(((long)(cqrw0.a[v1] & 0xFF)) << 24 | ((long)(cqrw0.a[v1 + 1] & 0xFF)) << 16 | ((long)(cqrw0.a[v1 + 2] & 0xFF)) << 8 | ((long)(cqrw0.a[v1 + 3] & 0xFF)));
        int v2 = cqrw0.b();
        this.a = SystemClock.elapsedRealtime();
        int v3 = cqrw0.c + v2;
        if(v3 > cqrw0.b) {
            throw new IOException(String.format(Locale.ROOT, "attempt to set limit beyond available data: %d exceeds %d", ((int)(cqrw0.c + v2)), ((int)cqrw0.b)));
        }
        cqrw0.d = v3;
        this.a(cqrw0);
        cqrw0.d = -1;
    }

    protected abstract void a(cqrw arg1);

    public final long c(long v) {
        long v1 = v - this.a;
        return v1 <= this.e ? this.e - v1 : 0L;
    }

    public static String d(String[] arr_s) {
        return arr_s == null ? null : TextUtils.join(".", arr_s);
    }

    public static boolean e(String[] arr_s, String[] arr_s1) {
        int v = arr_s1.length - arr_s.length;
        if(v > 0) {
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(!arr_s[v1].equals(arr_s1[v1 + v])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object object0) {
        return (object0 instanceof cqsd) ? Arrays.equals(this.c, ((cqsd)object0).c) && this.d == ((cqsd)object0).d : false;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, ((int)this.d)});
    }
}

