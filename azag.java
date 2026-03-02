public final class azag implements azbg {
    public final ProtoLiteBuilder a;

    public azag(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlpd)hftp0.b_message).c |= 0x10000;
        ((hlpd)hftp0.b_message).Y = v;
    }
}

