public final class flsf implements kar {
    public final ProtoLiteBuilder a;

    public flsf(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gmdo)hftp0.b_message).b = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmdo gmdo0 = (gmdo)hftp0.b_message;
        ((String)object0).getClass();
        gmdo0.d = (String)object0;
    }
}

