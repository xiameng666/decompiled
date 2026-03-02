public final class iws {
    private final jbd a;

    public iws(jbd jbd0) {
        this.a = jbd0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iws)) {
            return false;
        }
        jbd jbd0 = ((iws)object0).a;
        return !ibuq.m(this.a.a, jbd0.a) || !this.a.b.x(jbd0.b) || !ibuq.m(this.a.c, jbd0.c) || this.a.d != jbd0.d || this.a.e != jbd0.e || this.a.f != jbd0.f || !ibuq.m(this.a.g, jbd0.g) || this.a.h != jbd0.h || this.a.j != jbd0.j ? false : jkp.h(this.a.i, jbd0.i);
    }

    @Override
    public final int hashCode() {
        jbd jbd0 = this.a;
        int v = jbd0.a.hashCode() * 0x1F;
        jat jat0 = jbd0.b.b;
        int v1 = 0;
        int v2 = ((((((((((((jlo.a(jat0.b) * 0x1F + (jat0.c == null ? 0 : jat0.c.l)) * 0x1F + (jat0.d == null ? 0 : jat0.d.a)) * 0x1F + (jat0.e == null ? 0 : jat0.e.a)) * 0x1F + (jat0.f == null ? 0 : jat0.f.hashCode())) * 0x1F + (jat0.g == null ? 0 : jat0.g.hashCode())) * 0x1F + jlo.a(jat0.h)) * 0x1F + (jat0.i == null ? 0 : Float.floatToIntBits(jat0.i.a))) * 0x1F + (jat0.j == null ? 0 : jat0.j.hashCode())) * 0x1F + (jat0.k == null ? 0 : jat0.k.hashCode())) * 0x1F + ibof.a(jat0.l)) * 0x1F + (jat0.o == null ? 0 : jat0.o.hashCode())) * 0x1F + jbd0.b.c.hashCode()) * 0x1F;
        ixt ixt0 = jbd0.b.d;
        if(ixt0 != null) {
            v1 = ixt0.hashCode();
        }
        int v3 = (((v + (v2 + v1)) * 0x1F + jbd0.c.hashCode()) * 0x1F + jbd0.d) * 0x1F;
        return jbd0.e ? (((((v3 + 0x4CF) * 0x1F + jbd0.f) * 0x1F + jbd0.g.hashCode()) * 0x1F + jbd0.h.hashCode()) * 0x1F + jbd0.j.hashCode()) * 0x1F + jkn.a(jbd0.i) : (((((v3 + 0x4D5) * 0x1F + jbd0.f) * 0x1F + jbd0.g.hashCode()) * 0x1F + jbd0.h.hashCode()) * 0x1F + jbd0.j.hashCode()) * 0x1F + jkn.a(jbd0.i);
    }
}

