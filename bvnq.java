public final class bvnq implements ibts {
    public final hgnu a;

    public bvnq(hgnu hgnu0) {
        this.a = hgnu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hgnx)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hgnx)object0))));
        boolean z = this.a.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hgnx)hftp0.b_message).b = z;
        return (hgnx)hftp0.N_build();
    }
}

