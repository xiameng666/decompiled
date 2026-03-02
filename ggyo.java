import java.io.IOException;

public final class ggyo implements ggyy {
    public static final ggyo a;

    static {
        ggyo.a = new ggyo();
    }

    public final ggyn a(ggxh ggxh0, ggxj ggxj0) {
        long v8;
        try {
            long v = ggxj0.a;
            ggxj0.a = v + 1L;
            int v1 = ggxh0.a(v);
            int v2 = (v1 & 0xFF) >> 3;
            if(v2 == 0x1F) {
                long v3 = ggxj0.a;
                ggxj0.a = v3 + 1L;
                v2 = (ggxh0.a(v3) & 0xFF) + 29;
            }
            long v4 = ggxg.a(ggxh0, ggxj0.a, v1 & 7);
            ggxj0.a += (long)(v1 & 7);
            long v5 = v4 << 0x40 - Math.max(1, v1 & 7) * 8;
            if(v2 >= 29) {
                long v6 = (long)(v2 - 29);
                long v7 = v6 + v6;
                v8 = v7 + 1L;
                v5 |= 1L << ((int)v7);
            }
            else {
                long v9 = (long)v2;
                v8 = v9 + v9;
            }
            return new ggyn(this, ghdx.a.a(ggxh0, ggxj0), v8, v5);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new IOException("Insufficient or invalid input bytes: ", indexOutOfBoundsException0);
        }
    }

    @Override  // ggyy
    public final Object b(ggxh ggxh0, ggxj ggxj0) {
        return this.a(ggxh0, ggxj0);
    }
}

