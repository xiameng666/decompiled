public final class dxxw implements gfsi {
    public final fsxt a;

    public dxxw(fsxt fsxt0) {
        this.a = fsxt0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fsyk)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fsyk)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fsyk fsyk0 = (fsyk)hftp0.b_message;
        this.a.getClass();
        fsyk0.d = this.a;
        fsyk0.c = 2;
        return (fsyk)hftp0.N_build();
    }
}

