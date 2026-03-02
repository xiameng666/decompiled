public final class cbnx implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    protected final bbfe_BaseGrpcServer b;
    protected final iakq c;

    public cbnx(bbfe_BaseGrpcServer bbfe0) {
        if(huip.a.b().e() && !hrpw.c()) {
            fhbw fhbw0 = new fhbw();
            fhbw0.a(new cblz());
            fhad fhad0 = fhae.a();
            fhad0.b(bbfe0.context);
            bbfe0.addInterceptor(fhbu.b(fhad0.a(), fhbw0));
            bbfe0.j();
        }
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.b = bbfe0;
        this.c = iakq.a;
    }

    public cbnx(cbnx cbnx0, iakp iakp0, Object object0) {
        this.b = cbnx0.b;
        this.c = cbnx0.c.h(iakp0, object0);
    }

    @Override
    public final void close() {
        this.b.shutdownChannel();
    }
}

