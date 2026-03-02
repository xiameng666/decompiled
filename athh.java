public final class athh {
    public final int a;
    public final gged_interceptors b;
    public final ByteString c;
    public final gfsx d;

    public athh() {
        throw null;
    }

    public athh(int v, gged_interceptors gged0, ByteString hfsf0, gfsx gfsx0) {
        this.a = v;
        this.b = gged0;
        this.c = hfsf0;
        this.d = gfsx0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof athh) && this.a == ((athh)object0).a && ggia.i(this.b, ((athh)object0).b) && this.c.equals(((athh)object0).c) && this.d.equals(((athh)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "ValidatedChunksMetadata{codeLevel=" + this.a + ", chunkOrdering=" + this.b + ", plaintextDigest=" + this.c + ", compressionMethod=" + this.d + "}";
    }
}

