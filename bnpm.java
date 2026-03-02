public final class bnpm implements gfsi {
    public final boolean a;
    public final gsyz b;

    public bnpm(boolean z, gsyz gsyz0) {
        this.a = z;
        this.b = gsyz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gsyz gsyz0 = this.b;
        if(!this.a) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqyf)object0))));
            ((fqyd)hftp0).n(gsyz0.b);
            return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp0))).N_build();
        }
        if(((fqyf)object0).d(gsyz0.b)) {
            return (fqyf)object0;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqyf)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((fqyf)object0))));
        ((fqyd)hftp1).m(gsyz0.b, hfyn.a);
        return (fqyf)((ProtoLiteBuilder)(((fqyd)hftp1))).N_build();
    }
}

