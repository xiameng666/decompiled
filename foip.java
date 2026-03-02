public final class foip {
    public final foih a;
    public final foih b;
    public final foih c;
    public final int d;

    public foip() {
        throw null;
    }

    public foip(foih foih0, foih foih1, foih foih2, int v) {
        this.a = foih0;
        this.b = foih1;
        this.c = foih2;
        this.d = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof foip) && this.a.equals(((foip)object0).a) && this.b.equals(((foip)object0).b) && this.c.equals(((foip)object0).c) && this.d == ((foip)object0).d;
    }

    @Override
    public final int hashCode() {
        return this.d ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ViewProviders{headerViewProvider=" + this.a + ", contentViewProvider=" + this.b + ", footerViewProvider=" + this.c + ", title=" + this.d + "}";
    }
}

