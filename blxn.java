public final class blxn {
    public final boolean a;
    public final gfsx b;

    public blxn() {
        throw null;
    }

    public blxn(boolean z, gfsx gfsx0) {
        this.a = z;
        this.b = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof blxn) && this.a == ((blxn)object0).a && this.b.equals(((blxn)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() ^ 0x16638EA4 : this.b.hashCode() ^ 0x16FC2542;
    }

    @Override
    public final String toString() {
        return "UvArguments{uvRequired=" + this.a + ", pinUvAuthParams=" + this.b + "}";
    }
}

