public final class fuhm extends fuho {
    public final fugv a;
    public final fryv b;
    public final fryv c;

    public fuhm(fugv fugv0, fryv fryv0, fryv fryv1) {
        ibuq.f(fryv0, "title");
        super();
        this.a = fugv0;
        this.b = fryv0;
        this.c = fryv1;
    }

    public fuhm(fugv fugv0, fryv fryv0, fryv fryv1, int v) {
        if(1 == (v & 1)) {
            fugv0 = null;
        }
        if((v & 4) != 0) {
            fryv1 = null;
        }
        this(fugv0, fryv0, fryv1);
    }

    public static fuhm a(fuhm fuhm0, fugv fugv0, fryv fryv0, int v) {
        if((v & 1) != 0) {
            fugv0 = fuhm0.a;
        }
        if((v & 2) != 0) {
            fryv0 = fuhm0.b;
        }
        ibuq.f(fryv0, "title");
        return new fuhm(fugv0, fryv0, fuhm0.c);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fuhm)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fuhm)object0).a)) {
            return false;
        }
        return ibuq.m(this.b, ((fuhm)object0).b) ? ibuq.m(this.c, ((fuhm)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (this.a == null ? 0 : this.a.hashCode()) * 0x1F + this.b.hashCode();
        fryv fryv0 = this.c;
        if(fryv0 != null) {
            v = fryv0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "Default(artwork=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}

