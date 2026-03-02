public final class eiiu implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    protected final bbfe_BaseGrpcServer c;
    protected final iakq d;

    static {
        eiiu.a = (int)hojd.a.b().b();
    }

    public eiiu(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.c = bbfe0;
        this.d = iakq.a;
    }

    public eiiu(eiiu eiiu0, iakp iakp0, Object object0) {
        this.c = eiiu0.c;
        this.d = eiiu0.d.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.c.shutdownChannel();
    }
}

