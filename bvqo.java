public final class bvqo implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public final bbfe_BaseGrpcServer c;
    public final iakq d;

    static {
        bvqo.a = (int)htwl.c();
    }

    public bvqo(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public bvqo(bvqo bvqo0, iakp iakp0, Object object0) {
        this.c = bvqo0.c;
        this.d = bvqo0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

