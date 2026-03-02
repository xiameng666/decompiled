public final class flru implements kar {
    public final ProtoLiteBuilder a;

    public flru(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmdm gmdm0 = (gmdm)hftp0.b_message;
        ((String)object0).getClass();
        gmdm0.e = (String)object0;
    }
}

