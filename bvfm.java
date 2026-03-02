public final class bvfm {
    public final cmhx a;
    public final buyb b;

    public bvfm(buyb buyb0, cmhx cmhx0) {
        ibuq.f(buyb0, "oneGoogleBinder");
        super();
        this.b = buyb0;
        this.a = cmhx0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvfm)) {
            return false;
        }
        return ibuq.m(this.b, ((bvfm)object0).b) ? ibuq.m(this.a, ((bvfm)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() * 0x1F + this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountSelectorUiModel(oneGoogleBinder=" + this.b + ", veConfig=" + this.a + ")";
    }
}

