public final class dazk implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((daru)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((daru)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        daru daru0 = (daru)hftp0.b_message;
        daru0.b |= 1;
        daru0.c = true;
        return (daru)hftp0.N_build();
    }
}

