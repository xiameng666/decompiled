public final class cbgj {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    public cbgj(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9, int v10, int v11) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
        this.i = v8;
        this.j = v9;
        this.k = v10;
        this.l = v11;
    }

    public final String a() {
        ibqm ibqm0 = new ibqm(null);
        ibqm0.add("la1:" + cbgi.a(this.a));
        ibqm0.add("la2:" + cbgi.a(this.b));
        ibqm0.add("la3:" + cbgi.a(this.c));
        ibqm0.add("ln1:" + cbgi.a(this.d));
        ibqm0.add("ln2:" + cbgi.a(this.e));
        ibqm0.add("lbg:" + cbgi.a(this.f));
        ibqm0.add("da1:" + cbgi.a(this.g));
        ibqm0.add("da2:" + cbgi.a(this.h));
        ibqm0.add("da3:" + cbgi.a(this.i));
        ibqm0.add("dn1:" + cbgi.a(this.j));
        ibqm0.add("dn2:" + cbgi.a(this.k));
        ibqm0.add("dbg:" + cbgi.a(this.l));
        return ibpo.aK(ibpo.a(ibqm0), ",", null, null, null, 62);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cbgj)) {
            return false;
        }
        if(this.a != ((cbgj)object0).a) {
            return false;
        }
        if(this.b != ((cbgj)object0).b) {
            return false;
        }
        if(this.c != ((cbgj)object0).c) {
            return false;
        }
        if(this.d != ((cbgj)object0).d) {
            return false;
        }
        if(this.e != ((cbgj)object0).e) {
            return false;
        }
        if(this.f != ((cbgj)object0).f) {
            return false;
        }
        if(this.g != ((cbgj)object0).g) {
            return false;
        }
        if(this.h != ((cbgj)object0).h) {
            return false;
        }
        if(this.i != ((cbgj)object0).i) {
            return false;
        }
        if(this.j != ((cbgj)object0).j) {
            return false;
        }
        return this.k == ((cbgj)object0).k ? this.l == ((cbgj)object0).l : false;
    }

    @Override
    public final int hashCode() {
        return ((((((((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + this.h) * 0x1F + this.i) * 0x1F + this.j) * 0x1F + this.k) * 0x1F + this.l;
    }

    @Override
    public final String toString() {
        return "DynamicColorPalette(la1=" + this.a + ", la2=" + this.b + ", la3=" + this.c + ", ln1=" + this.d + ", ln2=" + this.e + ", lbg=" + this.f + ", da1=" + this.g + ", da2=" + this.h + ", da3=" + this.i + ", dn1=" + this.j + ", dn2=" + this.k + ", dbg=" + this.l + ")";
    }
}

