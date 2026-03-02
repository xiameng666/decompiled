public final class flxf implements kar {
    public final ProtoLiteBuilder a;

    public flxf(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq0 = (hnuq)hftp0.b_message;
        ((String)object0).getClass();
        hnuq0.d = (String)object0;
    }
}

