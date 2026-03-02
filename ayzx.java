public final class ayzx implements azbg {
    public final ProtoLiteBuilder a;

    public ayzx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlpd)hftp0.b_message).c |= 0x400;
        ((hlpd)hftp0.b_message).S = v;
    }
}

