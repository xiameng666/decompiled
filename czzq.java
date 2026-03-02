public final class czzq implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public final bbfe_BaseGrpcServer c;
    public final iakq d;

    static {
        czzq.a = (int)hvog.ae();
    }

    public czzq(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public czzq(czzq czzq0, iakp iakp0, Object object0) {
        this.c = czzq0.c;
        this.d = czzq0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

