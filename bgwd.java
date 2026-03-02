public final class bgwd implements gfsi {
    public final gxoe a;
    public final boolean b;

    public bgwd(gxoe gxoe0, boolean z) {
        this.a = gxoe0;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfug hfug0 = gxof.a;
        hfuh hfuh0 = new hfuh(((gxof)object0).d, hfug0);
        gxoe gxoe0 = this.a;
        boolean z = hfuh0.contains(gxoe0);
        boolean z1 = this.b;
        if(z1 == z) {
            return (gxof)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gxof)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gxof)object0))));
        if(z1) {
            ((gxoc)hftp0).a(gxoe0);
            return (gxof)((ProtoLiteBuilder)(((gxoc)hftp0))).N_build();
        }
        hfuh hfuh1 = new hfuh(((gxof)((gxoc)hftp0).b_message).d, hfug0);
        if(!((gxoc)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gxoc)hftp0))).ensureMutable();
        }
        ((gxof)((gxoc)hftp0).b_message).d = hfty.a;
        for(Object object1: hfuh1) {
            gxoe gxoe1 = (gxoe)object1;
            if(!gxoe1.equals(gxoe0)) {
                ((gxoc)hftp0).a(gxoe1);
            }
        }
        return (gxof)((ProtoLiteBuilder)(((gxoc)hftp0))).N_build();
    }
}

