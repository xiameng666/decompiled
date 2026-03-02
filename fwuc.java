public final class fwuc implements gful_cronetEngineProvider {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public fwuc(int v, int v1, boolean z, int v2, boolean z1, int v3, long v4, int v5, int v6, int v7, int v8) {
        this.k = v;
        this.a = v1;
        this.b = z;
        this.c = v2;
        this.d = z1;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = v6;
        this.i = v7;
        this.j = v8;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkpq.a).v_newBuilder();
        gkpe gkpe0 = this.k == 1 ? gkpe.b : gkpe.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkpq)hftv0).c = gkpe0.d;
        ((gkpq)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gkpq)hftv1).b |= 4;
        ((gkpq)hftv1).e = this.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gkpq)hftv2).b |= 0x20;
        ((gkpq)hftv2).h = this.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gkpq)hftv3).b |= 0x200;
        ((gkpq)hftv3).l = this.c;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = this.e;
        gkpq gkpq0 = (gkpq)hftp0.b_message;
        gkpq0.b |= 0x400;
        gkpq0.m = this.d;
        if(huvk.k()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpq gkpq1 = (gkpq)hftp0.b_message;
            gkpq1.b |= 0x40000;
            gkpq1.u = (long)v;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpq gkpq2 = (gkpq)hftp0.b_message;
            gkpq2.b |= 8;
            gkpq2.f = v;
        }
        long v1 = this.f;
        if(v1 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpq gkpq3 = (gkpq)hftp0.b_message;
            gkpq3.b |= 2;
            gkpq3.d = v1;
        }
        int v2 = this.g;
        if(v2 >= 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpq gkpq4 = (gkpq)hftp0.b_message;
            gkpq4.b |= 0x40;
            gkpq4.i = v2;
        }
        int v3 = this.h;
        if(v3 > 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((gkpq)hftv4).b |= 16;
            ((gkpq)hftv4).g = v3;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            int v4 = this.j;
            ProtoLiteMessage hftv5 = hftp0.b_message;
            ((gkpq)hftv5).b |= 0x80;
            ((gkpq)hftv5).j = this.i;
            if(v4 >= 0) {
                if(!hftv5.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkpq gkpq5 = (gkpq)hftp0.b_message;
                gkpq5.b |= 0x100;
                gkpq5.k = v4;
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkoq.a).v_newBuilder();
        gkpr gkpr0 = (gkpr)((ProtoLiteMessage)gkps.a).v_newBuilder();
        gkpr0.a(((gkpq)hftp0.N_build()));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp2.b_message;
        gkps gkps0 = (gkps)((ProtoLiteBuilder)gkpr0).N_build();
        gkps0.getClass();
        gkoq0.f = gkps0;
        gkoq0.b |= 0x40;
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

