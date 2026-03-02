public final class acrm implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    protected final bbfe_BaseGrpcServer c;
    protected final iakq d;

    static {
        acrm.a = (int)hovz.a.b().b();
    }

    public acrm(acrm acrm0, iakp iakp0, Object object0) {
        this.c = acrm0.c;
        this.d = acrm0.d.h(iakp0, object0);
    }

    public acrm(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public final void a() {
        this.c.shutdownChannel();
    }

    @Override
    public final void close() {
        this.a();
    }
}

