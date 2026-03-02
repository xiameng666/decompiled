public final class dxzd implements gfsi {
    public final String a;

    public dxzd(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dmpz dmpz0 = (dmpz)object0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dmpz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dmpz0));
        dmpv dmpv0 = (dmpv)hftp0;
        dmpv0.a(this.a, dmpx.a);
        return (dmpz)((ProtoLiteBuilder)dmpv0).N_build();
    }
}

