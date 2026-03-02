public final class azbd implements azbg {
    public final ProtoLiteBuilder a;

    public azbd(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // azbg
    public final void a(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlox hlox0 = (hlox)hftp0.b_message;
        hlox0.b |= 4;
        hlox0.e = v;
    }
}

