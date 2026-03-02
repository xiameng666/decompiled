import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public final class hmle {
    public ByteBuffer a;
    public hmkh b;
    public hmlm c;
    public int d;
    public hmli e;
    public List f;
    public final Deque g;
    public final Deque h;
    public boolean i;
    public boolean j;
    private hmkh k;

    public hmle() {
        this.f = new ArrayList();
        this.g = new LinkedList();
        this.h = new LinkedList();
        this.i = false;
        this.j = false;
    }

    public final hmli a() {
        return this.j ? this.e : new hmli(this.b());
    }

    public final ByteBuffer b() {
        int v4;
        byte[] arr_b;
        int v = this.c.a;
        int v1 = this.c.b;
        int v2 = this.c.c;
        int v3 = this.c.d;
        if(v <= 0 && v3 <= 0) {
            arr_b = new byte[this.a.remaining()];
            this.a.position(0);
            this.a.get(arr_b, 0, this.a.remaining());
            this.a.position(0);
        }
        else {
            boolean z = v > v3;
            if(z) {
                v4 = hmlx.b(v, v3);
            }
            else {
                v4 = hmlx.b(v3, v);
                v3 = v;
            }
            byte[] arr_b1 = new byte[v4];
            this.a.position(v3);
            this.a.get(arr_b1, 0, v4);
            this.a.position(0);
            arr_b = z ? hmlx.o(arr_b1) : arr_b1;
        }
        if(v1 > 0 || v2 > 0) {
            arr_b = hmle.f(arr_b, v1, v2);
        }
        return ByteBuffer.wrap(arr_b);
    }

    public final void c(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
        int v = byteBuffer0.array().length;
        this.c = new hmlm(0, 0, v * 8, v);
        this.d = 0;
        this.e = null;
        this.f = new ArrayList();
        this.k = null;
        this.b = null;
    }

    public final void d(hmkh hmkh0) {
        if(this.k == null) {
            this.k = hmkh0;
        }
        this.b = hmkh0;
        this.c.b(((hmlp)hmkh0.a).b);
    }

    public static hmle e(hmle hmle0) {
        hmle hmle1 = new hmle();
        if(hmle0 != null) {
            hmle1.a = hmle0.a;
            hmle1.b = hmle0.b;
            hmle1.c = hmlm.a(hmle0.c);
            hmle1.d = hmle0.d;
        }
        return hmle1;
    }

    public static final byte[] f(byte[] arr_b, int v, int v1) {
        BitSet bitSet0 = new BitSet(arr_b.length * 8);
        int v2 = v <= v1 ? v1 : v;
        int v3 = v <= v1 ? v : v1;
        int v4 = (int)Math.ceil(((float)(v2 - v3)) / 8.0f);
        bitSet0.set(v3, v2, true);
        byte[] arr_b1 = bitSet0.toByteArray();
        hmlx.p(arr_b1);
        for(int v5 = 0; v5 < arr_b.length && v5 < arr_b1.length; ++v5) {
            arr_b[v5] = (byte)(arr_b[v5] & arr_b1[v5]);
        }
        int v6 = arr_b.length * 8 - v2;
        int v7 = 8 - v6 % 8;
        for(int v8 = arr_b.length - 1; v8 >= 0; --v8) {
            int v9 = v8 - v6 / 8;
            if(v9 < 0) {
                arr_b[v8] = 0;
            }
            else {
                byte b = (byte)((arr_b[v9] & 0xFF) >>> v6 % 8);
                if(v9 - 1 >= 0) {
                    b = (byte)(0xFF << v7 & 0xFF & arr_b[v9 - 1] << v7 | b);
                }
                arr_b[v8] = b;
            }
        }
        int v10 = arr_b.length - v4;
        int v11 = arr_b.length - v10;
        byte[] arr_b2 = new byte[v11];
        System.arraycopy(arr_b, v10, arr_b2, 0, v11);
        if(v > v1) {
            int v12 = hmlx.b(v2, v3);
            byte[] arr_b3 = new byte[v11];
            for(int v13 = 0; v13 < v11; ++v13) {
                int v14 = v13 == v11 - 1 && ((byte)(v12 % 8)) != 0 ? ((byte)(v12 % 8)) : 8;
                byte b1 = 0;
                for(int v15 = 0; v15 < v14; ++v15) {
                    int v16 = ((byte)(v11 * 8 - v12)) + v15;
                    b1 = (byte)(b1 | (arr_b2[((byte)(v16 / 8 + v13))] >> ((byte)(7 - v16 % 8)) & 1) << v15);
                }
                arr_b3[v11 - 1 - v13] = b1;
            }
            return arr_b3;
        }
        return arr_b2;
    }
}

