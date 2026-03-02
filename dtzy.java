public final class dtzy implements duak {
    public final boolean a;

    public dtzy(boolean z) {
        this.a = z;
    }

    @Override  // duak
    public final void a(ProtoLiteBuilder hftp0) {
        gtxw gtxw0 = ((gtxd)hftp0.b_message).k;
        if(gtxw0 == null) {
            gtxw0 = gtxw.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gtxw0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gtxw0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gtxw)hftp1.b_message).b = this.a;
        gtxw gtxw1 = (gtxw)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxd gtxd0 = (gtxd)hftp0.b_message;
        gtxw1.getClass();
        gtxd0.k = gtxw1;
        gtxd0.b |= 0x20;
    }
}

