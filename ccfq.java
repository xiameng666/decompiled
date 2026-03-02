public final class ccfq implements ccgn {
    public final ccgo a;
    public final String b;

    public ccfq(ccgo ccgo0, String s) {
        this.a = ccgo0;
        this.b = s;
    }

    @Override  // ccgn
    public final gfsz a(fnap fnap0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fnap0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fnap0));
        fnan fnan0 = ccgo.e(((fnao)hftp0), this.b);
        boolean z = true;
        if(fnan0 == null) {
            return new gfsz(fnap0, Boolean.valueOf(true));
        }
        ccgo ccgo0 = this.a;
        fnap fnap1 = (fnap)((ProtoLiteBuilder)(((fnao)hftp0))).N_build();
        ccgo0.f.a(fnan0);
        if(fnan0.c == 13) {
            z = ccgo0.p(((fnah)fnan0.d));
        }
        return new gfsz(fnap1, Boolean.valueOf(z));
    }
}

