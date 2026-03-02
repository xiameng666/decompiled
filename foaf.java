public final class foaf {
    public final foan a;
    public final foac b;

    public foaf() {
        throw null;
    }

    public foaf(foac foac0, foan foan0) {
        this.b = foac0;
        this.a = foan0;
    }

    public static foad a() {
        foad foad0 = new foad();
        foad0.a = foan.a().a();
        return foad0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foaf) && this.b.equals(((foaf)object0).b) && this.a.equals(((foaf)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.b.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ExpressSignInSpec{onContinueWithAccountListenerWithAsyncCallback=" + this.b + ", features=" + this.a + "}";
    }
}

