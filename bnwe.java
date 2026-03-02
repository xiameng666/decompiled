public final class bnwe {
    public final gged_interceptors a;
    public final gfsx b;

    public bnwe() {
        throw null;
    }

    public bnwe(gged_interceptors gged0, gfsx gfsx0) {
        this.a = gged0;
        this.b = gfsx0;
    }

    public final boolean a() {
        return this.b.i();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bnwe) && ggia.i(this.a, ((bnwe)object0).a) && this.b.equals(((bnwe)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "Result{domainKeys=" + this.a + ", unretrievableDomainLostKnowledgeFactor=" + this.b + "}";
    }
}

