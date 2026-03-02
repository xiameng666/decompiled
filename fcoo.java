public final class fcoo {
    public final fcoq a;
    public final fcoq b;

    public fcoo() {
        throw null;
    }

    public fcoo(fcoq fcoq0, fcoq fcoq1) {
        this.a = fcoq0;
        this.b = fcoq1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fcoo) && this.a.equals(((fcoo)object0).a) && this.b.equals(((fcoo)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "FluidPadding{roundScreenFractions=" + this.a + ", nonRoundScreenFractions=" + this.b + "}";
    }
}

