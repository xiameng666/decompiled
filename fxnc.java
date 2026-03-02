public final class fxnc implements gful_cronetEngineProvider {
    public final long a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public fxnc(int v, int v1, int v2, int v3, int v4, long v5, int v6, String s) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = v4;
        this.a = v5;
        this.b = v6;
        this.c = s;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwik.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwlb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwlb)hftv0).c = this.d - 1;
        ((gwlb)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwlb)hftv1).d = this.e - 1;
        ((gwlb)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gwlb)hftv2).e = this.f - 1;
        ((gwlb)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gwlb)hftv3).f = this.g - 1;
        ((gwlb)hftv3).b |= 8;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gwlb)hftv4).g = this.h - 1;
        ((gwlb)hftv4).b |= 16;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        ((gwlb)hftv5).b |= 0x20;
        ((gwlb)hftv5).h = this.a;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp1.b_message;
        ((gwlb)hftv6).b |= 0x40;
        ((gwlb)hftv6).i = this.b;
        if(!hftv6.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwlb gwlb0 = (gwlb)hftp1.b_message;
        this.c.getClass();
        gwlb0.b |= 0x80;
        gwlb0.j = this.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwik gwik0 = (gwik)hftp0.b_message;
        gwlb gwlb1 = (gwlb)hftp1.N_build();
        gwlb1.getClass();
        gwik0.C = gwlb1;
        gwik0.b |= 0x2000000;
        return (gwik)hftp0.N_build();
    }
}

