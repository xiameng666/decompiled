public final class bnpo implements gfsi {
    public final bnqg a;
    public final ByteString b;

    public bnpo(bnqg bnqg0, ByteString hfsf0) {
        this.a = bnqg0;
        this.b = hfsf0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = gggq.c(((fqyf)object0).b, new bnpg(this.b));
        return this.a.a(gfsx0);
    }
}

