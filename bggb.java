public final class bggb {
    public final String a;
    public final grdf b;

    public bggb() {
        throw null;
    }

    public bggb(String s, grdf grdf0) {
        if(s == null) {
            throw new NullPointerException("Null canonicalizedUsername");
        }
        this.a = s;
        this.b = grdf0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bggb) && this.a.equals(((bggb)object0).a) && this.b.equals(((bggb)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "CanonicalizedCredential{canonicalizedUsername=" + this.a + ", password=*}";
    }
}

