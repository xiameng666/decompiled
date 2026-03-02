public final class czzp implements AutoCloseable {
    protected final bbfe_BaseGrpcServer a;

    static {
        hvog.ad();
    }

    public czzp(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.a = bbfe0;
    }

    @Override
    public final void close() {
        this.a.shutdownChannel();
    }
}

