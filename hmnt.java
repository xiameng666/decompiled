import j..util.Objects;

public final class hmnt {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public byte[] f;
    public final byte[] g;
    public int h;
    public byte[] i;
    public hmnr j;
    public hmnr k;
    public hmnr l;
    public hmnr m;
    private byte[] n;

    public hmnt(hmnx hmnx0) {
        Objects.requireNonNull(hmnx0);
        super();
        this.f = new byte[16];
        this.g = new byte[6];
        this.i = new byte[4];
    }

    public final int a() {
        return this.k() ? 2 : 4;
    }

    public final int b() {
        return this.k() ? 4 : 8;
    }

    public final void c() {
        this.k = null;
    }

    public final void d() {
        ++this.h;
    }

    public final void e() {
        this.f = new byte[16];
    }

    public final void f(boolean z, boolean z1) {
        this.c = z;
        this.d = z1;
    }

    public final void g(byte[] arr_b) {
        this.n = (byte[])arr_b.clone();
    }

    public final boolean h() {
        return this.d && this.b == 0;
    }

    public final boolean i() {
        return this.c || this.d;
    }

    public final boolean j() {
        return this.a == 10;
    }

    public final boolean k() {
        return this.a == 10;
    }

    public final boolean l() {
        return this.a == 26 || this.a == 130 || this.a == 170;
    }

    public final boolean m() {
        return this.a == 0x71 || this.a == 0x77;
    }

    public final byte[] n() {
        return (byte[])this.n.clone();
    }
}

