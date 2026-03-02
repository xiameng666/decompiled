public final class iwz extends ixa {
    public final String a;
    public final jbf b;
    public final ixb c;

    public iwz(String s, jbf jbf0, int v) {
        if((v & 2) != 0) {
            jbf0 = null;
        }
        this(s, jbf0, null);
    }

    public iwz(String s, jbf jbf0, ixb ixb0) {
        this.a = s;
        this.b = jbf0;
        this.c = ixb0;
    }

    @Override  // ixa
    public final ixb a() {
        return this.c;
    }

    @Override  // ixa
    public final jbf b() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iwz)) {
            return false;
        }
        return !ibuq.m(this.a, ((iwz)object0).a) || !ibuq.m(this.b, ((iwz)object0).b) ? false : ibuq.m(this.c, ((iwz)object0).c);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        ixb ixb0 = this.c;
        if(ixb0 != null) {
            v1 = ixb0.hashCode();
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}

