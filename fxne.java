public final class fxne implements gful_cronetEngineProvider {
    public final String a;
    public final int b;

    public fxne(int v, String s) {
        this.b = v;
        this.a = s;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlj.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gxom.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gxom)hftp2.b_message).b = this.b - 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlj gwlj0 = (gwlj)hftp1.b_message;
        gxom gxom0 = (gxom)hftp2.N_build();
        gxom0.getClass();
        gwlj0.c = gxom0;
        gwlj0.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlj gwlj1 = (gwlj)hftp1.b_message;
        this.a.getClass();
        gwlj1.b |= 2;
        gwlj1.d = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlj gwlj2 = (gwlj)hftp1.N_build();
        gwlj2.getClass();
        gwik0.u = gwlj2;
        gwik0.b |= 0x20000;
        return (gwik)hftp0.N_build();
    }
}

