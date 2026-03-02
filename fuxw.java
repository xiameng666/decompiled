public final class fuxw implements gfsi {
    public final long a;

    public fuxw(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwkg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwkg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwkg gwkg0 = (gwkg)hftp0.b_message;
        gwkg0.b |= 1;
        gwkg0.d = this.a;
        return (gwkg)hftp0.N_build();
    }
}

