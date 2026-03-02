public final class fuya implements gfsi {
    public final gwkf a;

    public fuya(gwkf gwkf0) {
        this.a = gwkf0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwkg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwkg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwkg gwkg0 = (gwkg)hftp0.b_message;
        gwkg0.e = this.a.a();
        return (gwkg)hftp0.N_build();
    }
}

