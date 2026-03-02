public final class bpjl {
    public ByteString a;
    public ByteString b;
    public gfsx c;
    public gfsx d;
    public gfsx e;
    public haea f;
    private fqus g;

    public bpjl() {
        throw null;
    }

    public bpjl(byte[] arr_b) {
        this.c = gfqx.a;
        this.d = gfqx.a;
        this.e = gfqx.a;
    }

    public final bpjm a() {
        ByteString hfsf0 = this.a;
        if(hfsf0 != null) {
            ByteString hfsf1 = this.b;
            if(hfsf1 != null) {
                fqus fqus0 = this.g;
                if(fqus0 != null) {
                    haea haea0 = this.f;
                    if(haea0 != null) {
                        return new bpjm(hfsf0, hfsf1, this.c, fqus0, this.d, this.e, haea0);
                    }
                }
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" eid");
        }
        if(this.b == null) {
            stringBuilder0.append(" advertisement");
        }
        if(this.g == null) {
            stringBuilder0.append(" componentSetOrComponentless");
        }
        if(this.f == null) {
            stringBuilder0.append(" source");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(fqus fqus0) {
        if(fqus0 == null) {
            throw new NullPointerException("Null componentSetOrComponentless");
        }
        this.g = fqus0;
    }
}

