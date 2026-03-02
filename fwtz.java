public final class fwtz implements gful_cronetEngineProvider {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public fwtz(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = v7;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkpc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkpc)hftv0).b |= 0x100000;
        ((gkpc)hftv0).x = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkpc)hftv1).b |= 0x800000;
        ((gkpc)hftv1).A = this.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gkpc)hftv2).b |= 0x2000000;
        ((gkpc)hftv2).C = this.c;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gkpc)hftv3).b |= 0x8000000;
        ((gkpc)hftv3).E = this.d;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gkpc)hftv4).b |= 0x20000000;
        ((gkpc)hftv4).G = this.e;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gkpc)hftv5).b |= 0x80000000;
        ((gkpc)hftv5).I = this.f;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((gkpc)hftv6).b |= 0x200000;
        ((gkpc)hftv6).y = this.g;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkpc)hftp0.b_message).c |= 2;
        ((gkpc)hftp0.b_message).K = this.h;
        gkpc gkpc0 = (gkpc)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        gixx gixx0 = gixx.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixy)hftp1.b_message).d = gixx0.H;
        ((gixy)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkoq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gkoq)hftp2.b_message).c = 3;
        ((gkoq)hftp2.b_message).b |= 1;
        gkpa gkpa0 = (gkpa)((ProtoLiteMessage)gkpb.a).v_newBuilder();
        gkpa0.a(gkpc0);
        gkpb gkpb0 = (gkpb)((ProtoLiteBuilder)gkpa0).N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp2.b_message;
        gkpb0.getClass();
        gkoq0.g = gkpb0;
        gkoq0.b |= 0x80;
        gkoq gkoq1 = (gkoq)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp1.b_message;
        gkoq1.getClass();
        gixy0.f = gkoq1;
        gixy0.b |= 4;
        return (gixy)hftp1.N_build();
    }
}

