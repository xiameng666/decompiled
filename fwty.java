public final class fwty implements gful_cronetEngineProvider {
    public final int a;
    public final int b;

    public fwty(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkou.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gkou)hftv0).b |= 1;
        ((gkou)hftv0).c = this.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkou gkou0 = (gkou)hftp0.b_message;
        gkou0.b |= 4;
        gkou0.e = this.b;
        gkou gkou1 = (gkou)hftp0.N_build();
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
        ((gkoq)hftp2.b_message).c = 10;
        ((gkoq)hftp2.b_message).b |= 1;
        gkos gkos0 = (gkos)((ProtoLiteMessage)gkot.a).v_newBuilder();
        gkos0.a(gkou1);
        gkot gkot0 = (gkot)((ProtoLiteBuilder)gkos0).N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gkoq gkoq0 = (gkoq)hftp2.b_message;
        gkot0.getClass();
        gkoq0.l = gkot0;
        gkoq0.b |= 0x1000;
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

