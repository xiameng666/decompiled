public final class flse implements kar {
    public final ProtoLiteBuilder a;

    public flse(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        long v = (long)(((Long)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmdj)hftp0.b_message).d = v;
    }
}

