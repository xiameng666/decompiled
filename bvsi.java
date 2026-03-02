public final class bvsi implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public final bbfe_BaseGrpcServer c;
    public final iakq d;

    static {
        bvsi.a = (int)htxc.a.b().b();
    }

    public bvsi(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public bvsi(bvsi bvsi0, iakp iakp0, Object object0) {
        this.c = bvsi0.c;
        this.d = bvsi0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

