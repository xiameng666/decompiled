public final class dxzz implements gfsi {
    public final gged_interceptors a;

    public dxzz(gged_interceptors gged0) {
        this.a = gged0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dxec dxec0 = (dxec)object0;
        if(dxec0 == null) {
            dxec0 = dxec.a;
        }
        gged_interceptors gged0 = this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dxec0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)dxec0));
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            String s = (String)gged0.get(v);
            s.getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((dxec)hftp0.b_message).b().remove(s);
        }
        return (dxec)hftp0.N_build();
    }
}

