public final class cjlj implements evpo {
    public final cjlv a;
    public final String b;
    public final int c;
    public final gjdg d;

    public cjlj(cjlv cjlv0, String s, int v, gjdg gjdg0) {
        this.a = cjlv0;
        this.b = s;
        this.c = v;
        this.d = gjdg0;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        return !evql0.n() || !((Boolean)evql0.j()).booleanValue() ? this.a.d(this.b, this.c, hakh.c, this.d).e(new cjlt()) : this.a.b(this.b, this.c, this.d).e(new cjls());
    }
}

