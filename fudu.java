public final class fudu {
    public final fryv a;
    public final fryv b;
    public final fudo c;
    private final ibth d;

    public fudu() {
        this(null, null, null, 15);
    }

    public fudu(fryv fryv0, fryv fryv1, fudo fudo0, int v) {
        if((v & 4) != 0) {
            fudo0 = new fudn(0.0f);
        }
        if((v & 2) != 0) {
            fryv1 = null;
        }
        if(1 == (v & 1)) {
            fryv0 = null;
        }
        ibuq.f(fudo0, "progressIndicator");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = fudo0;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fudu)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fudu)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fudu)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((fudu)object0).c) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        fryv fryv0 = this.b;
        if(fryv0 != null) {
            v = fryv0.hashCode();
        }
        return ((v1 * 0x1F + v) * 0x1F + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TileProgressState(title=" + this.a + ", subtitle=" + this.b + ", progressIndicator=" + this.c + ", onClick=null)";
    }
}

