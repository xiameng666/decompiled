import java.nio.ByteBuffer;

public final class fuwo {
    private final fuwn a;

    public fuwo(Comparable[] arr_comparable, ByteBuffer byteBuffer0, long v) {
        fuwn fuwn0 = new fuwn(arr_comparable, byteBuffer0, v);
        super();
        this.a = fuwn0;
    }

    public final int a() {
        return this.a.h.length;
    }

    @Deprecated
    public final fuwm b(int v, float[] arr_f) {
        int v5;
        int v3;
        ByteBuffer byteBuffer0;
        fuwn fuwn0 = this.a;
        int v1 = fuwn0.h[v];
        int v2 = v1;
        while(true) {
            byteBuffer0 = fuwn0.g;
            v3 = 0;
            if((byteBuffer0.get(v2) & 1) != 0) {
                break;
            }
            long v4 = 0L;
            while(true) {
                v5 = fuwn0.e;
                if(v3 >= v5) {
                    break;
                }
                v4 |= (((long)byteBuffer0.get(v2 + v3)) & 0xFFL) << v3 * 8;
                ++v3;
            }
            long v6 = v4 >>> 1 >>> fuwn0.a;
            if((arr_f[((int)(v4 >>> 1 & (1L << fuwn0.a) - 1L))] <= Float.intBitsToFloat(((int)v6)))) {
                v2 += v5;
            }
            else {
                v2 = ((int)(v6 >>> 0x20)) + v1;
            }
        }
        int v7 = 0;
        while(v3 < fuwn0.d) {
            v7 |= (byteBuffer0.get(v2 + v3) & 0xFF) << v3 * 8;
            ++v3;
        }
        return fuwn0.c == 0 ? new fuwm(fuwn0.f[v7 >>> 1 & (1 << fuwn0.b) - 1], 1.0f) : new fuwm(fuwn0.f[v7 >>> 1 & (1 << fuwn0.b) - 1], ((float)(v7 >>> 1 >>> fuwn0.b)) / ((float)((1 << fuwn0.c) - 1)));
    }
}

