public final class fxnf implements gful_cronetEngineProvider {
    public final gwlt a;
    public final gwlt b;

    public fxnf(gwlt gwlt0, gwlt gwlt1) {
        this.a = gwlt0;
        this.b = gwlt1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwld.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.a.getClass();
        ((gwld)hftv0).c = this.a;
        ((gwld)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwld gwld0 = (gwld)hftp1.b_message;
        this.b.getClass();
        gwld0.d = this.b;
        gwld0.b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwld gwld1 = (gwld)hftp1.N_build();
        gwld1.getClass();
        gwik0.R = gwld1;
        gwik0.c |= 0x100;
        return (gwik)hftp0.N_build();
    }
}

