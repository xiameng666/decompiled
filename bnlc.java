public final class bnlc implements gfsi {
    public final bnle a;

    public bnlc(bnle bnle0) {
        this.a = bnle0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = ((ByteString)object0).toStringUtf8();
        return (gtdj)this.a.a.q(fqdd.a, s);
    }
}

