public final class ftzw {
    public final fryv a;
    public final fryk b;
    public final fryv c;
    public final ibth d;
    private final int e;

    public ftzw(fryv fryv0, fryk fryk0, fryv fryv1, ibth ibth0) {
        this.a = fryv0;
        this.b = fryk0;
        this.c = fryv1;
        this.d = ibth0;
        this.e = 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ftzw)) {
            return false;
        }
        if(!ibuq.m(this.a, ((ftzw)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((ftzw)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((ftzw)object0).c) ? ibuq.m(this.d, ((ftzw)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        return this.b == null ? ((v * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F : (((v + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "RowSecondaryButton(text=" + this.a + ", leadingIcon=" + this.b + ", leadingIconContentDescription=" + this.c + ", onClick=" + this.d + ", veLogConst=0)";
    }
}

