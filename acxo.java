public final class acxo implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        adsg adsg0 = (adsg)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)adsg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        adsg adsg1 = (adsg)hftp0.b_message;
        adsg1.c = adsd.a(4);
        return (adsg)hftp0.N_build();
    }
}

