public final class ehdc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eggj)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eggj)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eggj eggj0 = (eggj)hftp0.b_message;
        eggj0.b |= 2;
        eggj0.d = true;
        return (eggj)hftp0.N_build();
    }
}

