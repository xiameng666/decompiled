import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class typ {
    public final byte[] a;
    public ByteBuffer b;
    public tyo c;
    public int d;

    public typ() {
        this.a = new byte[0x100];
        this.d = 0;
    }

    public final int a() {
        try {
            return this.b.get() & 0xFF;
        }
        catch(Exception unused_ex) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int b() {
        return this.b.getShort();
    }

    public final void c() {
        int v = this.a();
        this.d = v;
        if(v > 0) {
            for(int v1 = 0; true; v1 += v3) {
                int v2 = this.d;
                if(v1 >= v2) {
                    break;
                }
                try {
                    int v3 = v2 - v1;
                    this.b.get(this.a, v1, v3);
                }
                catch(Exception unused_ex) {
                    this.c.b = 1;
                    break;
                }
            }
        }
    }

    public final void d() {
        do {
            int v = this.a();
            this.b.position(Math.min(this.b.position() + v, this.b.limit()));
        }
        while(v > 0);
    }

    public final boolean e() {
        return this.c.b != 0;
    }

    public final int[] f(int v) {
        int[] arr_v;
        byte[] arr_b = new byte[v * 3];
        try {
            arr_v = null;
            this.b.get(arr_b);
            arr_v = new int[0x100];
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                int v3 = arr_b[v2] & 0xFF;
                int v4 = v2 + 2;
                int v5 = arr_b[v2 + 1] & 0xFF;
                v2 += 3;
                arr_v[v1] = v5 << 8 | (v3 << 16 | 0xFF000000) | arr_b[v4] & 0xFF;
            }
        }
        catch(BufferUnderflowException unused_ex) {
            this.c.b = 1;
            return arr_v;
        }
        return arr_v;
    }
}

