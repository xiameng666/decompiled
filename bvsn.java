public final class bvsn implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqa)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqa)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqa gqqa0 = (gqqa)hftp0.b_message;
        gqqa0.b &= -2;
        gqqa0.c = gqqa.a.c;
        return (gqqa)hftp0.N_build();
    }
}

