public final class fudm {
    public final fryv a;
    public final fryv b;
    public final fudg c;
    public final fule d;
    public final ibth e;

    public fudm() {
        fryu fryu0 = new fryu("");
        fryu fryu1 = new fryu("");
        fudg fudg0 = new fudg(null);
        fudl fudl0 = new fudl();
        this(fryu0, fryu1, fudg0, fule.a, fudl0);
    }

    public fudm(fryv fryv0, fryv fryv1, fudg fudg0, fule fule0, ibth ibth0) {
        ibuq.f(fule0, "position");
        super();
        this.a = fryv0;
        this.b = fryv1;
        this.c = fudg0;
        this.d = fule0;
        this.e = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof fudm)) {
            return false;
        }
        if(!ibuq.m(this.a, ((fudm)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((fudm)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((fudm)object0).c)) {
            return false;
        }
        return this.d == ((fudm)object0).d ? ibuq.m(this.e, ((fudm)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
    }

    @Override
    public final String toString() {
        return "TileMultiImageState(title=" + this.a + ", subtitle=" + this.b + ", images=" + this.c + ", position=" + this.d + ", tileClickAction=" + this.e + ")";
    }
}

