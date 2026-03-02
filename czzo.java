public final class czzo implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public final bbfe_BaseGrpcServer c;
    public final iakq d;

    static {
        czzo.a = (int)hvog.ad();
    }

    public czzo(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public czzo(czzo czzo0, iakp iakp0, Object object0) {
        this.c = czzo0.c;
        this.d = czzo0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

