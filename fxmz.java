public final class fxmz implements gful_cronetEngineProvider {
    public final String a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;

    public fxmz(String s, long v, int v1, int v2, String s1) {
        this.a = s;
        this.b = v;
        this.d = v1;
        this.e = v2;
        this.c = s1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.a.getClass();
        ((gwlg)hftv0).b |= 1;
        ((gwlg)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwlg)hftv1).b |= 2;
        ((gwlg)hftv1).d = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwlg)hftv2).e = this.d - 1;
        ((gwlg)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gwlg)hftv3).f = this.e - 1;
        ((gwlg)hftv3).b |= 8;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlg gwlg0 = (gwlg)hftp1.b_message;
        this.c.getClass();
        gwlg0.b |= 16;
        gwlg0.g = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlg gwlg1 = (gwlg)hftp1.N_build();
        gwlg1.getClass();
        gwik0.x = gwlg1;
        gwik0.b |= 0x100000;
        return (gwik)hftp0.N_build();
    }
}

