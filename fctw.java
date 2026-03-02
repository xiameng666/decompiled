public final class fctw implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ffck ffck0 = (ffck)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffck.a).v_newBuilder();
        hfwn hfwn0 = hfyn.h(System.currentTimeMillis());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffck ffck1 = (ffck)hftp0.b_message;
        hfwn0.getClass();
        ffck1.e = hfwn0;
        ffck1.b |= 4;
        return (ffck)hftp0.N_build();
    }
}

