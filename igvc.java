import java.util.Arrays;

public final class igvc {
    public final byte[] a;
    public byte[] b;
    public final byte[] c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    private static final byte[] i;
    private static final byte[] j;

    static {
        igvc.i = new byte[]{0, -92, 4, 0, 11, (byte)0xA0, 0, 0, 2, 22, 73, 84, 83, 0x4F, 45, 49};
        igvc.j = new byte[]{0, -92, 4, 0, 11, (byte)0xA0, 0, 0, 2, 22, 73, 84, 83, 0x4F, 45, 50};
    }

    public igvc(byte[] arr_b) {
        this.c = new byte[296];
        this.d = 0;
        this.g = true;
        this.a = arr_b;
        if(arr_b.length >= 4) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, 0, 16);
            boolean z = Arrays.equals(igvc.i, arr_b1);
            this.h = z;
            if(!z) {
                byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, 16);
                this.h = Arrays.equals(igvc.j, arr_b2);
            }
            if(arr_b.length == 4) {
                this.e = 0;
                this.f = 0;
                this.b = new byte[0];
                return;
            }
            if(arr_b.length == 5) {
                this.e = 0;
                this.f = arr_b[4] & 0xFF;
                this.b = new byte[0];
                return;
            }
            int v = arr_b[4] & 0xFF;
            this.e = v;
            this.b = Arrays.copyOfRange(arr_b, 5, v + 5);
            int v1 = this.e;
            if(arr_b.length >= v1 + 5 && arr_b.length <= v1 + 6) {
                if(arr_b.length == v1 + 5) {
                    this.f = 0;
                    return;
                }
                this.f = arr_b[v1 + 5] & 0xFF;
                return;
            }
        }
        this.g = false;
    }

    public final byte a() {
        return this.a[2];
    }

    public final byte b() {
        return this.a[3];
    }

    public static short c(byte[] arr_b, int v) {
        return (short)(arr_b[v + 1] & 0xFF | arr_b[v] << 8);
    }

    public final short d(int v) {
        return igvc.c(this.a, v);
    }

    public final byte[] e() {
        int v = this.d;
        int v1 = v + 1;
        this.d = v1;
        this.c[v] = (byte)0x90;
        int v2 = v + 2;
        this.d = v2;
        this.c[v1] = 0;
        return Arrays.copyOf(this.c, v2);
    }

    public final void f(byte[] arr_b) {
        this.g(arr_b, 0, arr_b.length);
    }

    public final void g(byte[] arr_b, int v, int v1) {
        System.arraycopy(arr_b, v, this.c, this.d, v1);
        this.d += v1;
    }
}

