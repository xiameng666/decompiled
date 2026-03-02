final class ftwu {
    public final hmu a;
    public final long b;
    public final crk c;

    public ftwu(hmu hmu0, long v, crk crk0) {
        ibuq.f(hmu0, "shape");
        super();
        this.a = hmu0;
        this.b = v;
        this.c = crk0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftwu)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftwu)object0).a)) {
            return false;
        }
        return ibog.c(this.b, ((ftwu)object0).b) ? ibuq.m(this.c, ((ftwu)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.c == null ? (v + ibof.a(this.b)) * 0x1F : (v + ibof.a(this.b)) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        String s = hll.g(this.b);
        return "BackgroundAttributes(shape=" + this.a + ", color=" + s + ", borderStroke=" + this.c + ")";
    }
}

