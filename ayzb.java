public final class ayzb implements azbg {
    public final ProtoLiteBuilder a;

    public ayzb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpd hlpd0 = (hlpd)hftp0.b_message;
        hlpd0.b |= 0x100;
        hlpd0.l = v;
    }
}

