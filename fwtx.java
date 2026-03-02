public final class fwtx implements gful_cronetEngineProvider {
    public final long a;
    public final int b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;

    public fwtx(long v, int v1, long v2, boolean z, boolean z1, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = z;
        this.e = z1;
        this.f = v3;
        this.g = v4;
        this.h = v5;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkoz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkoz)hftv0).b |= 2;
        ((gkoz)hftv0).d = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkoz)hftv1).b |= 8;
        ((gkoz)hftv1).f = this.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gkoz)hftv2).b |= 16;
        ((gkoz)hftv2).g = this.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gkoz)hftv3).b |= 0x20;
        ((gkoz)hftv3).h = this.f;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        long v = this.c;
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gkoz)hftv4).b |= 1;
        ((gkoz)hftv4).c = this.b;
        if(v >= 0L) {
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkoz gkoz0 = (gkoz)hftp0.b_message;
            gkoz0.b |= 4;
            gkoz0.e = v;
        }
        int v1 = this.g;
        if(v1 >= 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkoz gkoz1 = (gkoz)hftp0.b_message;
            gkoz1.b |= 0x40;
            gkoz1.i = v1;
        }
        int v2 = this.h;
        if(v2 >= 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkoz gkoz2 = (gkoz)hftp0.b_message;
            gkoz2.b |= 0x80;
            gkoz2.j = v2;
        }
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
        ProtoLiteMessage hftv5 = hftp2.b_message;
        ((gkoq)hftv5).c = 2;
        ((gkoq)hftv5).b |= 1;
        if(!hftv5.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp2.b_message;
        gkoz gkoz3 = (gkoz)hftp0.N_build();
        gkoz3.getClass();
        gkoq0.d = gkoz3;
        gkoq0.b |= 4;
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

