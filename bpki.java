final class bpki {
    private final gtch a;
    private final fqus b;

    public bpki() {
        throw null;
    }

    public bpki(gtch gtch0, fqus fqus0) {
        if(gtch0 == null) {
            throw new NullPointerException("Null sightedDeviceId");
        }
        this.a = gtch0;
        if(fqus0 == null) {
            throw new NullPointerException("Null componentSetOrComponentless");
        }
        this.b = fqus0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof bpki) && ((ProtoLiteMessage)this.a).equals(((bpki)object0).a) && this.b.equals(((bpki)object0).b);
    }

    @Override
    public final int hashCode() {
        gtch gtch0 = this.a;
        if(((ProtoLiteMessage)gtch0).isImmutable()) {
            int v = ((ProtoLiteMessage)gtch0).s();
            return this.b.hashCode() ^ (v ^ 1000003) * 1000003;
        }
        int v1 = gtch0.memoizedHashCode;
        if(v1 == 0) {
            v1 = ((ProtoLiteMessage)gtch0).s();
            gtch0.memoizedHashCode = v1;
        }
        return this.b.hashCode() ^ (v1 ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "SightingKey{sightedDeviceId=" + this.a.toString() + ", componentSetOrComponentless=" + this.b.toString() + "}";
    }
}

