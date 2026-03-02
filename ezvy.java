public final class ezvy implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    protected final bbfe_BaseGrpcServer b;
    protected final iakq c;

    public ezvy(bbfe_BaseGrpcServer bbfe0) {
        if(hvyf.a.b().a() && !hrpw.c()) {
            fhbw fhbw0 = new fhbw();
            fhbw0.a(new ezvw());
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

    public ezvy(ezvy ezvy0, iakp iakp0, Object object0) {
        this.b = ezvy0.b;
        this.c = ezvy0.c.h(iakp0, object0);
    }

    public final void a() {
        this.b.shutdownChannel();
    }

    @Override
    public final void close() {
        this.a();
    }
}

