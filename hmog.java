import java.util.Arrays;

public final class hmog extends hmoe {
    public static final byte[] j;
    public static final byte[] k;
    public byte[] l;
    public long m;
    public byte[] n;
    public long o;
    public byte[] p;
    public hmnr q;
    public hmnr r;

    static {
        hmog.j = new byte[]{90, 0, 1, 0, (byte)0x80};
        hmog.k = new byte[]{-91, 0, 1, 0, (byte)0x80};
    }

    public hmog() {
        this.m = 0xFFFFFFFFL;
        this.n = new byte[16];
        this.p = new byte[8];
        this.f = 5;
    }

    @Override  // hmoe
    public final hmoe a() {
        hmoe hmoe0 = new hmog();
        hmoe0.e = this.e;
        hmoe0.d = this.d;
        hmoe0.c = this.c;
        hmoe0.d(((byte[])this.a.clone()));
        hmoe0.i = this.i;
        hmoe0.b = this.b;
        hmoe0.f = this.f;
        hmoe0.n = this.n;
        hmoe0.m = this.m;
        return hmoe0;
    }

    @Override  // hmoe
    public final void b(hmoe hmoe0) {
        super.b(hmoe0);
        hmog hmog0 = (hmog)hmoe0;
        this.m = hmog0.m;
        this.n = hmog0.n;
    }

    @Override  // hmoe
    public final void d(byte[] arr_b) {
        super.d(arr_b);
        this.o = hmpy.B(hmpy.L(Arrays.copyOfRange(arr_b, 0, 4)));
        this.p = Arrays.copyOfRange(arr_b, 4, 12);
    }

    public final int e(byte[] arr_b) {
        int v = arr_b.length & 15;
        return v == 0 ? 0 : 16 - v;
    }

    public final void f(byte[] arr_b, byte[] arr_b1) {
        byte[] arr_b2 = hmpy.F(new byte[][]{hmpy.F(new byte[][]{arr_b1, new byte[this.e(arr_b1)]}), arr_b, new byte[this.e(arr_b)]});
        byte[] arr_b3 = this.l;
        if(arr_b3 != null) {
            arr_b2 = hmpy.F(new byte[][]{arr_b3, arr_b2});
        }
        this.l = arr_b2;
    }

    public final byte[] g(long v) {
        return hmpy.L(hmpy.K(v));
    }
}

