public final class bvsz implements gfsi {
    public final gqpz a;

    public bvsz(gqpz gqpz0) {
        this.a = gqpz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqe)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqe)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqe gqqe0 = (gqqe)hftp0.b_message;
        this.a.getClass();
        gqqe0.c = this.a;
        gqqe0.b |= 1;
        return (gqqe)hftp0.N_build();
    }
}

