public final class ayzz implements azbg {
    public final ProtoLiteBuilder a;

    public ayzz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlpa hlpa0 = (hlpa)hftp0.b_message;
        hlpa0.b |= 8;
        hlpa0.f = v;
    }
}

