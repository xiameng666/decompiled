public final class jbf {
    public final jat a;
    public final jat b;
    public final jat c;
    public final jat d;

    public jbf() {
        this(null, 15);
    }

    public jbf(jat jat0, int v) {
        if(1 == (v & 1)) {
            jat0 = null;
        }
        this(jat0, null, null, null);
    }

    public jbf(jat jat0, jat jat1, jat jat2, jat jat3) {
        this.a = jat0;
        this.b = jat1;
        this.c = jat2;
        this.d = jat3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && (object0 instanceof jbf)) {
            if(!ibuq.m(this.a, ((jbf)object0).a)) {
                return false;
            }
            if(!ibuq.m(this.b, ((jbf)object0).b)) {
                return false;
            }
            return ibuq.m(this.c, ((jbf)object0).c) ? ibuq.m(this.d, ((jbf)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        jat jat0 = this.d;
        if(jat0 != null) {
            v = jat0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }
}

