import java.nio.ByteBuffer;
import java.util.Arrays;

public final class bmbb {
    public final byte a;
    public final byte b;
    public byte c;
    public byte d;
    public boolean e;
    public ghjh f;
    private int g;
    private byte[] h;
    private final int i;

    public bmbb(byte b, byte b1, int v) {
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.a = b;
        this.b = b1;
        this.i = v;
        this.g = bmbb.b(v);
    }

    public final byte[] a() {
        int v1;
        int v;
        if(this.h == null || this.e) {
            byte[] arr_b = this.f == null ? new byte[0] : this.f.a();
            if(this.i - 1 == 0) {
                if(arr_b.length > 0xFF) {
                    throw new IllegalArgumentException("Short encoding mandated, but APDU has more than 255 bytes of data");
                }
                v = arr_b.length == 0 ? 0 : 1;
                v1 = this.g == 0 ? 0 : 1;
            }
            else {
                if(arr_b.length > 0xFFFF) {
                    throw new IllegalArgumentException("Extended encoding mandated, but APDU has more than 65535 bytes of data");
                }
                v = arr_b.length == 0 ? 0 : 3;
                if(this.g != 0) {
                    if(v > 0) {
                        v1 = 2;
                        goto label_17;
                    }
                    v1 = 3;
                    goto label_17;
                }
                v1 = 0;
            }
        label_17:
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v + 4 + arr_b.length + v1);
            byteBuffer0.put(new byte[]{this.a, this.b, this.c, this.d});
            byteBuffer0.put(glwy.l(arr_b.length), 4 - v, v);
            if(arr_b.length != 0) {
                byteBuffer0.put(arr_b);
            }
            byteBuffer0.put(glwy.l(((char)this.g)), 4 - v1, v1);
            this.h = byteBuffer0.array();
            this.e = false;
            return this.h;
        }
        return this.h;
    }

    public static int b(int v) {
        return v == 1 ? 0x100 : 0x10000;
    }

    public final void c(byte[] arr_b) {
        if(this.f == null) {
            this.f = ghjj.i();
        }
        this.e = true;
        this.f.write(arr_b);
    }

    public final void d(int v) {
        if(this.i == 1 && v > 0x100) {
            throw new IllegalArgumentException("Short encoding has maximum result length 256, requested: " + v);
        }
        this.e = true;
        this.g = v;
    }

    public final void e(byte b) {
        this.e = true;
        this.c = b;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmbb) ? Arrays.equals(((bmbb)object0).a(), this.a()) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a());
    }
}

