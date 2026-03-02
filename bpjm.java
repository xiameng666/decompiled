public final class bpjm {
    public final ByteString a;
    public final ByteString b;
    public final gfsx c;
    public final fqus d;
    public final gfsx e;
    public final gfsx f;
    public final haea g;

    public bpjm() {
        throw null;
    }

    public bpjm(ByteString hfsf0, ByteString hfsf1, gfsx gfsx0, fqus fqus0, gfsx gfsx1, gfsx gfsx2, haea haea0) {
        this.a = hfsf0;
        this.b = hfsf1;
        this.c = gfsx0;
        this.d = fqus0;
        this.e = gfsx1;
        this.f = gfsx2;
        this.g = haea0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpjm) && this.a.equals(((bpjm)object0).a) && this.b.equals(((bpjm)object0).b) && this.c.equals(((bpjm)object0).c) && this.d.equals(((bpjm)object0).d) && this.e.equals(((bpjm)object0).e) && this.f.equals(((bpjm)object0).f) && this.g.equals(((bpjm)object0).g);
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "SightedEid{eid=" + this.a + ", advertisement=" + this.b + ", cachedDevice=" + this.c + ", componentSetOrComponentless=" + this.d + ", eidTimestampSeconds=" + this.e + ", rssi=" + this.f + ", source=" + this.g + "}";
    }
}

