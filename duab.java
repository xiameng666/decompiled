public final class duab implements duak {
    public final String a;

    public duab(String s) {
        this.a = s;
    }

    @Override  // duak
    public final void a(ProtoLiteBuilder hftp0) {
        gtxb gtxb0 = gtxb.f;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxd gtxd0 = (gtxd)hftp0.b_message;
        gtxd0.c = gtxb0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxd gtxd1 = (gtxd)hftp0.b_message;
        this.a.getClass();
        gtxd1.b |= 1;
        gtxd1.d = this.a;
    }
}

