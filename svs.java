public final class svs {
    public final byte a;
    public final byte b;
    public final byte c;
    public final byte d;
    public final int e;
    public final boolean f;
    private final byte[] g;
    private final byte[] h;

    public svs(byte b, byte b1, byte b2, byte b3, byte[] arr_b, int v, byte[] arr_b1, boolean z) {
        this.a = b;
        this.b = b1;
        this.c = b2;
        this.d = b3;
        this.g = arr_b;
        this.e = v;
        this.h = arr_b1;
        this.f = z;
    }

    public final byte a() {
        return stn.b(this.a, ((byte)4), ((byte)false));
    }

    public final boolean b() {
        return stn.e(this.a, ((byte)4));
    }

    public final boolean c() {
        return swu.a(this.a, 0xFFFFFF80, false);
    }

    public final boolean d() {
        return this.e(false);
    }

    public final boolean e(boolean z) {
        return swu.a(this.a, 0, z);
    }

    public final boolean f() {
        return swu.a(this.a, 0, true);
    }

    public final boolean g() {
        return stn.e(this.a, ((byte)2)) && stn.e(this.a, ((byte)3));
    }

    public final byte[] h() {
        return (byte[])this.h.clone();
    }

    public final byte[] i() {
        return (byte[])this.g.clone();
    }
}

