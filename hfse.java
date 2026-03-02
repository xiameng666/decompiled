import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public final class hfse extends OutputStream {
    private static final byte[] a;
    private final int b;
    private final ArrayList c;
    private int d;
    private byte[] e;
    private int f;

    static {
        hfse.a = new byte[0];
    }

    public hfse(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Buffer size < 0");
        }
        this.b = v;
        this.c = new ArrayList();
        this.e = new byte[v];
    }

    public final int a() {
        synchronized(this) {
        }
        return this.d + this.f;
    }

    public final ByteString b() {
        ByteString hfsf0;
        synchronized(this) {
            int v1 = this.f;
            byte[] arr_b = this.e;
            if(v1 >= arr_b.length) {
                hfsb hfsb1 = new hfsb(this.e);
                this.c.add(hfsb1);
                this.e = hfse.a;
            }
            else if(v1 > 0) {
                hfsb hfsb0 = new hfsb(Arrays.copyOf(arr_b, v1));
                this.c.add(hfsb0);
            }
            this.d += this.f;
            this.f = 0;
            hfsf0 = ByteString.u(this.c);
        }
        return hfsf0;
    }

    public final void c() {
        synchronized(this) {
            this.c.clear();
            this.d = 0;
            this.f = 0;
        }
    }

    private final void d(int v) {
        hfsb hfsb0 = new hfsb(this.e);
        this.c.add(hfsb0);
        int v1 = this.d + this.e.length;
        this.d = v1;
        this.e = new byte[Math.max(this.b, Math.max(v, v1 >>> 1))];
        this.f = 0;
    }

    @Override
    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), this.a());
    }

    @Override
    public final void write(int v) {
        synchronized(this) {
            if(this.f == this.e.length) {
                this.d(1);
            }
            int v2 = this.f;
            this.f = v2 + 1;
            this.e[v2] = (byte)v;
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            byte[] arr_b1 = this.e;
            int v3 = this.f;
            int v4 = arr_b1.length - v3;
            if(v1 <= v4) {
                System.arraycopy(arr_b, v, arr_b1, v3, v1);
                this.f += v1;
                return;
            }
            System.arraycopy(arr_b, v, arr_b1, v3, v4);
            int v5 = v1 - v4;
            this.d(v5);
            System.arraycopy(arr_b, v + v4, this.e, 0, v5);
            this.f = v5;
        }
    }
}

