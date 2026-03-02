public final class fxkw {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public fxkw() {
        throw null;
    }

    public fxkw(boolean z, int v, int v1, int v2, int v3, int v4) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
    }

    final boolean a() {
        return this.b == 3 || this.c == 3 || this.f == 3;
    }

    final boolean b() {
        return this.b == 3 || this.c == 3 || this.d == 3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fxkw) && this.a == ((fxkw)object0).a && this.b == ((fxkw)object0).b && this.c == ((fxkw)object0).c && this.d == ((fxkw)object0).d && this.e == ((fxkw)object0).e && this.f == ((fxkw)object0).f;
    }

    @Override
    public final int hashCode() {
        return this.a ? this.f ^ ((((0x16638EA4 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 : this.f ^ ((((0x16FC2542 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003;
    }

    @Override
    public final String toString() {
        return this.a + ":" + this.b + "|" + this.c + "|" + this.d + "|" + this.e + "|" + this.f;
    }
}

