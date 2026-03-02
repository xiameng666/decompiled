public final class eqtp implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    protected final bbfe_BaseGrpcServer e;
    protected final iakq f;

    static {
        eqtp.a = (int)hyhp.a.g().e();
    }

    public eqtp(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.e = bbfe0;
        this.f = iakq.a;
    }

    public eqtp(eqtp eqtp0, iakp iakp0, Object object0) {
        this.e = eqtp0.e;
        this.f = eqtp0.f.h(iakp0, object0);
    }

    public final void a() {
        this.e.shutdownChannel();
    }

    @Override
    public final void close() {
        this.a();
    }
}

