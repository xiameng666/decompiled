public final class fxmw implements gful_cronetEngineProvider {
    public final String a;
    public final long b;
    public final int c;
    public final int d;

    public fxmw(String s, long v, int v1, int v2) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.a.getClass();
        ((gwlp)hftv0).b |= 1;
        ((gwlp)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwlp)hftv1).b |= 2;
        ((gwlp)hftv1).d = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwlp)hftv2).e = this.c - 1;
        ((gwlp)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gwlp)hftp1.b_message).f = this.d - 1;
        ((gwlp)hftp1.b_message).b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlp gwlp0 = (gwlp)hftp1.N_build();
        gwlp0.getClass();
        gwik0.B = gwlp0;
        gwik0.b |= 0x1000000;
        return (gwik)hftp0.N_build();
    }
}

