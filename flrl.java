public final class flrl implements kar {
    public final ProtoLiteBuilder a;

    public flrl(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp0.b_message;
        ((String)object0).getClass();
        gmdi0.h = (String)object0;
    }
}

