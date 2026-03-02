public final class awgx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((awhr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((awhr)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((awhr)hftp0.b_message).c = hfvv.a;
        return (awhr)hftp0.N_build();
    }
}

