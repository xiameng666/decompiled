public final class flrh implements kar {
    public final ProtoLiteBuilder a;

    public flrh(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmdl.a).v_newBuilder();
        long v = (long)(((Long)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteBuilder hftp1 = this.a;
        ((gmdl)hftp0.b_message).b = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp1.b_message;
        gmdl gmdl0 = (gmdl)hftp0.N_build();
        gmdl0.getClass();
        gmdi0.q = gmdl0;
        gmdi0.b |= 16;
    }
}

