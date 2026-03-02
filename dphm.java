public final class dphm implements evqf {
    public final dpiz a;
    public final long b;
    public final String c;

    public dphm(dpiz dpiz0, long v, String s) {
        this.a = dpiz0;
        this.b = v;
        this.c = s;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ByteString hfsf0 = (ByteString)object0;
        ((ggtj)dpiz.a.h()).x("Delete script executed successfully");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hajh.a).v_newBuilder();
        hajf hajf0 = hajf.F;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hajh hajh0 = (hajh)hftp1.b_message;
        hajh0.b = hajf0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hajh)hftv0).c = this.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hajh)hftv1).g = 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        hajh hajh1 = (hajh)hftp1.b_message;
        this.c.getClass();
        hajh1.d = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hajh hajh2 = (hajh)hftp1.N_build();
        hajh2.getClass();
        hapr0.bz = hajh2;
        hapr0.f |= 0x40000000;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.h.b(hapr1);
    }
}

