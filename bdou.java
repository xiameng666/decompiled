public final class bdou {
    public final int a;
    public final ibth b;

    public bdou(int v, ibth ibth0) {
        ibuq.f(ibth0, "onClick");
        super();
        this.a = v;
        this.b = ibth0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bdou)) {
            return false;
        }
        return this.a == ((bdou)object0).a ? ibuq.m(this.b, ((bdou)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ButtonSpec(textId=" + this.a + ", onClick=" + this.b + ")";
    }
}

