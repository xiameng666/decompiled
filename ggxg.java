import java.io.InputStream;

public final class ggxg {
    public static long a(ggxh ggxh0, long v, int v1) {
        int v2 = 0;
        long v3 = 0L;
        while(v2 < v1) {
            v3 += (((long)ggxh0.a(v)) & 0xFFL) << v2 * 8;
            ++v2;
            v = 1L + v;
        }
        return v3;
    }

    public static long b(ggxh ggxh0, ggxj ggxj0) {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            long v2 = ggxj0.a;
            ggxj0.a = 1L + v2;
            int v3 = ggxh0.a(v2);
            v |= ((long)(v3 & 0x7F)) << v1;
            if((v3 & 0x80) == 0) {
                return v;
            }
        }
        throw new IllegalArgumentException("Malformed varint.");
    }

    public static InputStream c(ggxh ggxh0, ggxj ggxj0) {
        boolean z = true;
        gftb.checkTrue(Long.compare(ggxj0.a, 0L) >= 0 && ggxj0.a <= ggxj0.b);
        if(ggxj0.a() > ggxh0.b()) {
            z = false;
        }
        gftb.checkTrue(z);
        return new ggxi(ggxh0, ggxj0);
    }
}

