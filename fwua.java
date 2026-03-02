public final class fwua implements gful_cronetEngineProvider {
    public final String a;
    public final iaph b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final gkpz f;

    public fwua(String s, iaph iaph0, int v, boolean z, boolean z1, gkpz gkpz0) {
        this.a = s;
        this.b = iaph0;
        this.c = v;
        this.d = z;
        this.e = z1;
        this.f = gkpz0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixy.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkoq.a).v_newBuilder();
        gkpx gkpx0 = (gkpx)((ProtoLiteMessage)gkqa.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkpw.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        iaph iaph0 = this.b;
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gkpw)hftv0).b |= 1;
        ((gkpw)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        int v = this.c;
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gkpw)hftv1).b |= 2;
        ((gkpw)hftv1).d = iaph0.r;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gkpw)hftv2).b |= 4;
        ((gkpw)hftv2).e = (long)v;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gkpw)hftv3).b |= 0x80;
        ((gkpw)hftv3).i = this.d;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        ((gkpw)hftv4).b |= 0x100;
        ((gkpw)hftv4).j = this.e;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gkpw)hftp2.b_message).k = this.f.f;
        ((gkpw)hftp2.b_message).b |= 0x200;
        gkpx0.a(((gkpw)hftp2.N_build()));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp1.b_message;
        gkqa gkqa0 = (gkqa)((ProtoLiteBuilder)gkpx0).N_build();
        gkqa0.getClass();
        gkoq0.e = gkqa0;
        gkoq0.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixy gixy0 = (gixy)hftp0.b_message;
        gkoq gkoq1 = (gkoq)hftp1.N_build();
        gkoq1.getClass();
        gixy0.f = gkoq1;
        gixy0.b |= 4;
        return (gixy)hftp0.N_build();
    }
}

