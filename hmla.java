import java.nio.ByteBuffer;

public final class hmla {
    private final hmlg a;
    private final hmkv b;

    public hmla(hmlg hmlg0) {
        this.a = hmlg0;
        this.b = new hmkv(hmlg0);
    }

    public final ByteBuffer a(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        byte[] arr_b = this.f(byteBuffer0);
        byte[] arr_b1 = byteBuffer1.array();
        hmla.g(arr_b, arr_b1);
        for(int v = 0; v < arr_b.length && v < arr_b1.length; ++v) {
            arr_b[v] = (byte)(arr_b[v] & arr_b1[v]);
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final ByteBuffer b(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b = this.f(byteBuffer0);
        hmlx.g(arr_b);
        if(v == 0) {
            throw new hmki("Bit shift should start from 1");
        }
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            int v2 = v1 + v / 8;
            if(v2 >= arr_b.length) {
                arr_b[v1] = 0;
            }
            else {
                byte b = (byte)(arr_b[v2] << v % 8);
                if(v2 + 1 < arr_b.length) {
                    b = (byte)((1 << v % 8) - 1 & (arr_b[v2 + 1] >>> 8 - v % 8 & 0xFF) | b);
                }
                arr_b[v1] = b;
            }
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final ByteBuffer c(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        byte[] arr_b = this.f(byteBuffer0);
        byte[] arr_b1 = byteBuffer1.array();
        hmla.g(arr_b, arr_b1);
        for(int v = 0; v < arr_b.length && v < arr_b1.length; ++v) {
            arr_b[v] = (byte)(arr_b[v] | arr_b1[v]);
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final ByteBuffer d(ByteBuffer byteBuffer0, int v) {
        byte[] arr_b = this.f(byteBuffer0);
        hmlx.g(arr_b);
        if(v == 0) {
            throw new hmki("Bit shift should start from 1");
        }
        int v1 = arr_b.length;
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            int v2 = v1 - v / 8;
            if(v2 < 0) {
                arr_b[v1] = 0;
            }
            else {
                byte b = (byte)((arr_b[v2] & 0xFF) >>> v % 8);
                if(v2 - 1 >= 0) {
                    int v3 = 8 - v % 8;
                    b = (byte)(arr_b[v2 - 1] << v3 & 0xFF & 0xFF << v3 | b);
                }
                arr_b[v1] = b;
            }
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    public final ByteBuffer e(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        byte[] arr_b = this.f(byteBuffer0);
        byte[] arr_b1 = byteBuffer1.array();
        hmla.g(arr_b, arr_b1);
        for(int v = 0; v < arr_b.length && v < arr_b1.length; ++v) {
            arr_b[v] = (byte)(arr_b[v] ^ arr_b1[v]);
        }
        hmlx.g(arr_b);
        return ByteBuffer.wrap(arr_b);
    }

    private final byte[] f(ByteBuffer byteBuffer0) {
        if(byteBuffer0 == null) {
            hmli hmli0 = this.a.f.a().a();
            ByteBuffer byteBuffer1 = ByteBuffer.allocate(1);
            return ((ByteBuffer)this.b.b(hmli0, byteBuffer1)).array();
        }
        return byteBuffer0.array();
    }

    private static final void g(byte[] arr_b, byte[] arr_b1) {
        hmlx.g(arr_b);
        hmlx.g(arr_b1);
    }
}

