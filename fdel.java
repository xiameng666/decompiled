public final class fdel implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffco.a).v_newBuilder();
        boolean z = ((azui)object0).q();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffco ffco0 = (ffco)hftp0.b_message;
        ffco0.b |= 1;
        ffco0.c = z;
        return (ffco)hftp0.N_build();
    }
}

