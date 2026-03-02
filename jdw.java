public final class jdw extends jdf {
    public final String c;
    public final jeu d;
    public final int e;

    public jdw(String s, jeu jeu0, int v, jes jes0) {
        super(1, jey.a, jes0);
        this.c = s;
        this.d = jeu0;
        this.e = v;
    }

    @Override  // jdy
    public final int b() {
        return this.e;
    }

    @Override  // jdy
    public final jeu c() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof jdw)) {
            return false;
        }
        return !ibuq.m(this.c, ((jdw)object0).c) || !ibuq.m(this.d, ((jdw)object0).d) || !jem.b(this.e, ((jdw)object0).e) ? false : ibuq.m(this.b, ((jdw)object0).b);
    }

    @Override
    public final int hashCode() {
        return ((this.c.hashCode() * 0x1F + this.d.l) * 0x1F + this.e) * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Font(familyName=\"" + ("DeviceFontFamilyName(name=" + this.c + ')') + "\", weight=" + this.d + ", style=" + jem.a(this.e) + ')';
    }
}

