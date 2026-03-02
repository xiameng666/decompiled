public final class bvsu implements gfsi {
    public final String a;
    public final gqpz b;

    public bvsu(String s, gqpz gqpz0) {
        this.a = s;
        this.b = gqpz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqe)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqe)object0))));
        String s = this.a;
        s.getClass();
        gqpz gqpz0 = this.b;
        gqpz0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqqe)hftp0.b_message).b().put(s, gqpz0);
        return (gqqe)hftp0.N_build();
    }
}

