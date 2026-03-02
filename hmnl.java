import java.util.Map;

public abstract class hmnl implements hmno {
    public Map a;

    public hmnl() {
        this.a = null;
    }

    @Override  // hmno
    public final void a(byte[] arr_b, byte[] arr_b1, int v) {
        System.arraycopy(arr_b1, 0, arr_b, v, arr_b1.length);
    }

    @Override  // hmno
    public final byte[] b(byte[] arr_b) {
        int v = 0x6363;
        int v1 = 0;
        while(v1 < arr_b.length) {
            int v2 = arr_b[v1] ^ v & 0xFF;
            ++v1;
            int v3 = ((byte)(((byte)v2) ^ ((byte)v2) << 4)) & 0xFF;
            v = v >>> 8 ^ v3 << 8 ^ v3 << 3 ^ v3 >>> 4;
        }
        return new byte[]{((byte)v), ((byte)(v >> 8))};
    }

    @Override  // hmno
    public final byte[] c(byte[] arr_b, boolean z) {
        int v = -1;
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            v = hmnl.k(v, arr_b[v1]);
        }
        if(z) {
            v = hmnl.k(v, 0);
        }
        return new byte[]{((byte)v), ((byte)(v >> 8)), ((byte)(v >> 16)), ((byte)(v >> 24))};
    }

    @Override  // hmno
    public final byte[] d(byte[] arr_b, int v, int v1) {
        byte[] arr_b1 = new byte[v1];
        System.arraycopy(arr_b, v, arr_b1, 0, v1);
        return arr_b1;
    }

    @Override  // hmno
    public final hmnr e(String s) {
        return (hmnr)this.a.get(s);
    }

    private static final int k(int v, byte b) {
        int v1 = v ^ b & 0xFF;
        for(int v2 = 0; v2 < 8; ++v2) {
            int v3 = v1 & 1;
            v1 >>>= 1;
            v1 = v3 == 0 ? v1 >>> 1 : v1 ^ 0xEDB88320;
        }
        return v1;
    }
}

