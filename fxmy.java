public final class fxmy implements gful_cronetEngineProvider {
    public final String a;
    public final long b;
    public final String c;
    public final int d;

    public fxmy(String s, long v, int v1, String s1) {
        this.a = s;
        this.b = v;
        this.d = v1;
        this.c = s1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.a.getClass();
        ((gwlk)hftv0).b |= 1;
        ((gwlk)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwlk)hftv1).b |= 2;
        ((gwlk)hftv1).d = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwlk)hftv2).e = this.d - 1;
        ((gwlk)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlk gwlk0 = (gwlk)hftp1.b_message;
        this.c.getClass();
        gwlk0.b |= 8;
        gwlk0.f = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlk gwlk1 = (gwlk)hftp1.N_build();
        gwlk1.getClass();
        gwik0.D = gwlk1;
        gwik0.b |= 0x4000000;
        return (gwik)hftp0.N_build();
    }
}

