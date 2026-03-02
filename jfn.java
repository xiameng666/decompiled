public final class jfn extends jdf {
    public final String c;
    public final jfl d;
    public final jeu e;
    public final int f;
    private final boolean g;

    public jfn(String s, jfl jfl0, jeu jeu0, int v) {
        jes jes0 = new jes(new jep[0]);
        super(2, jfq.a, jes0);
        this.c = s;
        this.d = jfl0;
        this.e = jeu0;
        this.f = v;
        this.g = true;
    }

    @Override  // jdy
    public final int b() {
        return this.f;
    }

    @Override  // jdy
    public final jeu c() {
        return this.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jfn)) {
            return false;
        }
        if(!ibuq.m(this.c, ((jfn)object0).c)) {
            return false;
        }
        return !ibuq.m(this.d, ((jfn)object0).d) || !ibuq.m(this.e, ((jfn)object0).e) ? false : jem.b(this.f, ((jfn)object0).f);
    }

    @Override
    public final int hashCode() {
        return (((this.c.hashCode() * 0x1F + this.d.hashCode()) * 0x1F + this.e.l) * 0x1F + this.f) * 0x1F + 0x4CF;
    }

    @Override
    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + jem.a(this.f) + ')';
    }
}

