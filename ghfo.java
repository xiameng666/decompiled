import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

public final class ghfo {
    public final AtomicLongArray a;
    public final ghgm b;

    public ghfo(long v) {
        gftb.b(v > 0L, "data length is zero!");
        this.a = new AtomicLongArray(glwy.a(glun.b(v, 0x40L, RoundingMode.CEILING)));
        this.b = ghgq.a();
    }

    public ghfo(long[] arr_v) {
        gftb.b(arr_v.length > 0, "data length is zero!");
        this.a = new AtomicLongArray(arr_v);
        this.b = ghgq.a();
        long v1 = 0L;
        for(int v = 0; v < arr_v.length; ++v) {
            v1 += (long)Long.bitCount(arr_v[v]);
        }
        this.b.b(v1);
    }

    public final long a() {
        return ((long)this.a.length()) * 0x40L;
    }

    final boolean b(long v) {
        return (this.a.get(((int)(v >>> 6))) & 1L << ((int)v)) != 0L;
    }

    public final boolean c(long v) {
        if(!this.b(v)) {
            while(true) {
                AtomicLongArray atomicLongArray0 = this.a;
                long v1 = atomicLongArray0.get(((int)(v >>> 6)));
                long v2 = v1 | 1L << ((int)v);
                if(v1 == v2) {
                    break;
                }
                if(atomicLongArray0.compareAndSet(((int)(v >>> 6)), v1, v2)) {
                    this.b.c();
                    return true;
                }
            }
        }
        return false;
    }

    public static long[] d(AtomicLongArray atomicLongArray0) {
        int v = atomicLongArray0.length();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = atomicLongArray0.get(v1);
        }
        return arr_v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ghfo) ? Arrays.equals(ghfo.d(this.a), ghfo.d(((ghfo)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(ghfo.d(this.a));
    }
}

