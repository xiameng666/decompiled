public final class bqpd implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlfg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlfg hlfg0 = (hlfg)hftp0.b_message;
        ((hldp)object0).getClass();
        hlfg0.c = (hldp)object0;
        hlfg0.b = 1;
        return (hlfg)hftp0.N_build();
    }
}

