public final class fwud implements gful_cronetEngineProvider {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public fwud(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkpc.a).v_newBuilder();
        int v = this.b;
        int v1 = this.d;
        if(this.a == 0) {
            if(v > 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gkpc)hftv0).b |= 1;
                ((gkpc)hftv0).d = 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gkpc)hftv1).b |= 0x100;
                ((gkpc)hftv1).l = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkpc gkpc0 = (gkpc)hftp0.b_message;
                gkpc0.b |= 0x1000;
                gkpc0.p = this.c;
            }
            if(v1 > 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp0.b_message;
                ((gkpc)hftv2).b |= 16;
                ((gkpc)hftv2).h = 1;
                if(!hftv2.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp0.b_message;
                ((gkpc)hftv3).b |= 0x400;
                ((gkpc)hftv3).n = v1;
                if(!hftv3.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkpc gkpc1 = (gkpc)hftp0.b_message;
                gkpc1.b |= 0x4000;
                gkpc1.r = this.e;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpc gkpc2 = (gkpc)hftp0.b_message;
            gkpc2.b |= 0x10000;
            gkpc2.t = 1;
        }
        else {
            if(v > 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkpc gkpc3 = (gkpc)hftp0.b_message;
                gkpc3.b |= 4;
                gkpc3.f = 1;
            }
            if(v1 > 0) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkpc gkpc4 = (gkpc)hftp0.b_message;
                gkpc4.b |= 0x40;
                gkpc4.j = 1;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkpc gkpc5 = (gkpc)hftp0.b_message;
            gkpc5.b |= 0x40000;
            gkpc5.v = 1;
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
        ((gkoq)hftp2.b_message).c = 3;
        ((gkoq)hftp2.b_message).b |= 1;
        gkpa gkpa0 = (gkpa)((ProtoLiteMessage)gkpb.a).v_newBuilder();
        gkpa0.a(((gkpc)hftp0.N_build()));
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

