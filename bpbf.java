public final class bpbf implements gfsi {
    public final bpce a;
    public final bpjl b;
    public final ByteString c;
    public final gfsx d;

    public bpbf(bpce bpce0, bpjl bpjl0, ByteString hfsf0, gfsx gfsx0) {
        this.a = bpce0;
        this.b = bpjl0;
        this.c = hfsf0;
        this.d = gfsx0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((gfsx)object0) == null) {
            throw new NullPointerException("Null cachedDevice");
        }
        this.b.c = (gfsx)object0;
        this.b.d = this.a.c.b(this.c);
        fqus fqus0 = ((fqux)this.d.d()).b;
        this.b.b(fqus0);
        return this.b.a();
    }
}

