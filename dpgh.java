public final class dpgh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtiw.a).v_newBuilder();
        Iterable iterable0 = gggq.j(((fsww)object0).e, new dpgi());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtiw gtiw0 = (gtiw)hftp0.b_message;
        gtiw0.b();
        hfrj.E(iterable0, gtiw0.b);
        return (gtiw)hftp0.N_build();
    }
}

