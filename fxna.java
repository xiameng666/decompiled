public final class fxna implements gful_cronetEngineProvider {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public fxna(String s, long v, long v1, boolean z, boolean z1, boolean z2) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
        this.f = z2;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlc.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        this.a.getClass();
        ((gwlc)hftv0).b |= 1;
        ((gwlc)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwlc)hftv1).b |= 2;
        ((gwlc)hftv1).d = this.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwlc)hftv2).b |= 4;
        ((gwlc)hftv2).e = this.c;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gwlc)hftv3).b |= 8;
        ((gwlc)hftv3).f = this.d;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gwlc)hftv4).b |= 16;
        ((gwlc)hftv4).g = this.e;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlc gwlc0 = (gwlc)hftp1.b_message;
        gwlc0.b |= 0x20;
        gwlc0.h = this.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlc gwlc1 = (gwlc)hftp1.N_build();
        gwlc1.getClass();
        gwik0.A = gwlc1;
        gwik0.b |= 0x800000;
        return (gwik)hftp0.N_build();
    }
}

