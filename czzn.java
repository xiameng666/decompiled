public final class czzn implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public final bbfe_BaseGrpcServer c;
    public final iakq d;

    static {
        czzn.a = (int)hvog.ad();
    }

    public czzn(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public czzn(czzn czzn0, iakp iakp0, Object object0) {
        this.c = czzn0.c;
        this.d = czzn0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

