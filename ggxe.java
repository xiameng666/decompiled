import java.io.IOException;
import java.io.InputStream;

public final class ggxe {
    public final InputStream a;

    public ggxe(InputStream inputStream0) {
        this.a = inputStream0;
    }

    public final byte a() {
        return ggxd.a(this.a);
    }

    public final double b() {
        return Double.longBitsToDouble(ggxe.e(this.a));
    }

    public final int c() {
        int v = this.a() & 0xFF;
        int v1 = this.a() & 0xFF;
        int v2 = this.a() & 0xFF;
        return (this.a() & 0xFF) << 24 | (v | v1 << 8 | v2 << 16);
    }

    public final int d() {
        return (int)this.f();
    }

    public static long e(InputStream inputStream0) {
        return ((long)ggxd.a(inputStream0)) & 0xFFL | (((long)ggxd.a(inputStream0)) & 0xFFL) << 8 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 16 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 24 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 0x20 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 40 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 0x30 | (((long)ggxd.a(inputStream0)) & 0xFFL) << 56;
    }

    public final long f() {
        long v = 0L;
        for(int v1 = 0; v1 < 0x40; v1 += 7) {
            int v2 = ggxd.a(this.a);
            v |= ((long)(v2 & 0x7F)) << v1;
            if((v2 & 0x80) == 0) {
                return v;
            }
        }
        throw new IOException("Malformed varint.");
    }
}

