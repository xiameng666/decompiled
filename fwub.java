public final class fwub implements gful_cronetEngineProvider {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final double i;
    public final long j;
    public final int k;

    public fwub(int v, int v1, int v2, boolean z, boolean z1, long v3, long v4, long v5, long v6, double f, long v7) {
        this.k = v;
        this.a = v1;
        this.b = v2;
        this.c = z;
        this.d = z1;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = f;
        this.j = v7;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkov.a).v_newBuilder();
        gkpe gkpe0 = this.k == 1 ? gkpe.b : gkpe.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkov)hftv0).c = gkpe0.d;
        ((gkov)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkov)hftv1).b |= 4;
        ((gkov)hftv1).e = this.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gkov)hftv2).b |= 8;
        ((gkov)hftv2).f = this.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        boolean z = this.c;
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gkov)hftv3).b |= 16;
        ((gkov)hftv3).g = z;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gkov)hftv4).b |= 0x20;
        ((gkov)hftv4).h = this.d;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        long v = this.f;
        long v1 = this.e;
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gkov)hftv5).b |= 0x80;
        ((gkov)hftv5).j = v1;
        if(v != 0L) {
            if(!hftv5.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkov gkov0 = (gkov)hftp0.b_message;
            gkov0.b |= 2;
            gkov0.d = v;
        }
        long v2 = this.g;
        if(v2 > -1L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkov gkov1 = (gkov)hftp0.b_message;
            gkov1.b |= 0x100;
            gkov1.k = v2;
        }
        if(v1 > 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv6 = hftp0.b_message;
            ((gkov)hftv6).b |= 0x2000;
            ((gkov)hftv6).p = this.h;
            if(!hftv6.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkov gkov2 = (gkov)hftp0.b_message;
            gkov2.b |= 0x4000;
            gkov2.q = this.i;
        }
        if(z) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkov gkov3 = (gkov)hftp0.b_message;
            gkov3.b |= 0x40;
            gkov3.i = this.j;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkoq.a).v_newBuilder();
        gkow gkow0 = (gkow)((ProtoLiteMessage)gkox.a).v_newBuilder();
        gkow0.a(((gkov)hftp0.N_build()));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp2.b_message;
        gkox gkox0 = (gkox)((ProtoLiteBuilder)gkow0).N_build();
        gkox0.getClass();
        gkoq0.h = gkox0;
        gkoq0.b |= 0x100;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp1.b_message;
        gkoq gkoq1 = (gkoq)hftp2.N_build();
        gkoq1.getClass();
        gixy0.f = gkoq1;
        gixy0.b |= 4;
        return (gixy)hftp1.N_build();
    }
}

