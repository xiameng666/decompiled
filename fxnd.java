public final class fxnd implements gful_cronetEngineProvider {
    public final String a;

    public fxnd(String s) {
        this.a = s;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwlm)hftv0).c = 1;
        ((gwlm)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlm gwlm0 = (gwlm)hftp1.b_message;
        this.a.getClass();
        gwlm0.b |= 2;
        gwlm0.d = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlm gwlm1 = (gwlm)hftp1.N_build();
        gwlm1.getClass();
        gwik0.y = gwlm1;
        gwik0.b |= 0x200000;
        return (gwik)hftp0.N_build();
    }
}

