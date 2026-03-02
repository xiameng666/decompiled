public final class dxpp implements ibts {
    public final boolean a;
    public final dymg b;
    public final dxpr c;

    public dxpp(boolean z, dymg dymg0, dxpr dxpr0) {
        this.a = z;
        this.b = dymg0;
        this.c = dxpr0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dymo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dymo)object0))));
        dyms dyms0 = dymr.a(((dymj)hftp0));
        dxpr dxpr0 = this.c;
        if(this.a) {
            dymg dymg0 = this.b;
            if(dymg0 != null) {
                dyms0.d();
                String s = dxpr0.e;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dymm.a).v_newBuilder();
                ibuq.f(hftp1, "builder");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((dymm)hftp1.b_message).c = dymg0;
                ((dymm)hftp1.b_message).b |= 1;
                ProtoLiteMessage hftv0 = hftp1.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((dymm)hftv0), "value");
                dyms0.a.a(s, ((dymm)hftv0));
                return dyms0.a();
            }
        }
        dyms0.d();
        String s1 = dxpr0.e;
        dymj dymj0 = dyms0.a;
        if(!dymj0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)dymj0).ensureMutable();
        }
        ((dymo)dymj0.b_message).c().remove(s1);
        return dyms0.a();
    }
}

