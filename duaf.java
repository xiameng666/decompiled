public final class duaf implements duak {
    public final int a;

    public duaf(int v) {
        this.a = v;
    }

    @Override  // duak
    public final void a(ProtoLiteBuilder hftp0) {
        gtxb gtxb0 = gtxb.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtxd gtxd0 = (gtxd)hftp0.b_message;
        gtxd0.c = gtxb0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v = this.a;
        gtxd gtxd1 = (gtxd)hftp0.b_message;
        if(v == 1) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        gtxd1.l = v - 2;
        gtxd1.b |= 0x40;
    }
}

