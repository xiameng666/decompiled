public final class dtzw implements duak {
    public final ByteString a;

    public dtzw(ByteString hfsf0) {
        this.a = hfsf0;
    }

    @Override  // duak
    public final void a(ProtoLiteBuilder hftp0) {
        ByteString hfsf0 = this.a;
        if(hfsf0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gtxd gtxd0 = (gtxd)hftp0.b_message;
            gtxd0.b |= 8;
            gtxd0.h = hfsf0;
            return;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxd gtxd1 = (gtxd)hftp0.b_message;
        gtxd1.b &= -9;
        gtxd1.h = gtxd.a.h;
    }
}

