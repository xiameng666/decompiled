public final class cbxi implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public final bbfe_BaseGrpcServer d;
    public final iakq e;

    static {
        cbxi.a = (int)huli.a.e().l();
    }

    public cbxi(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.d = bbfe0;
        this.e = iakq.a;
    }

    public cbxi(cbxi cbxi0, iakp iakp0, Object object0) {
        this.d = cbxi0.d;
        this.e = cbxi0.e.h(iakp0, object0);
    }

    public final void a() {
        this.d.shutdownChannel();
    }

    @Override
    public final void close() {
        this.a();
    }
}

