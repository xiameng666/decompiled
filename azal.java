public final class azal implements azbg {
    public final ProtoLiteBuilder a;

    public azal(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlpd)hftp0.b_message).c |= 2;
        ((hlpd)hftp0.b_message).J = v;
    }
}

