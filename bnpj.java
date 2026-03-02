public final class bnpj implements gfsi {
    public final gsyz a;
    public final long b;

    public bnpj(gsyz gsyz0, long v) {
        this.a = gsyz0;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0 = this.a;
        if(((fqyf)object0).d(gsyz0.b)) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
            ((fqyd)hftp0).m(gsyz0.b, hfyn.h(this.b));
            return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
        }
        return (fqyf)object0;
    }
}

