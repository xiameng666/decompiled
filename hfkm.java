public final class hfkm {
    public final ggfp a;
    public final ggfp b;

    public hfkm() {
        throw null;
    }

    public hfkm(ggfp ggfp0, ggfp ggfp1) {
        this.a = ggfp0;
        this.b = ggfp1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof hfkm) && this.a.equals(((hfkm)object0).a) && this.b.equals(((hfkm)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "UnboxableOrExpression{basis=" + this.a + ", andExpressions=" + this.b + "}";
    }
}

