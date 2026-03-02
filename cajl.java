public final class cajl implements evqc {
    public final ProtoLiteBuilder a;

    public cajl(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).i = 2;
    }
}

