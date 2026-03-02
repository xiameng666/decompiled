import java.util.concurrent.TimeUnit;

public final class cjao implements AutoCloseable {
    protected final bbfe_BaseGrpcServer a;
    protected final iakq b;
    private static gRPCMethodDescriptor c;
    private static gRPCMethodDescriptor d;

    public cjao(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.a = bbfe0;
        this.b = iakq.a;
    }

    public cjao(cjao cjao0, iakp iakp0, Object object0) {
        this.a = cjao0.a;
        this.b = cjao0.b.h(iakp0, object0);
    }

    public final hfgo a(baqr baqr0, hfgm hfgm0) {
        if(cjao.c == null) {
            ibjh ibjh0 = new ibjh(hfgm.a);
            ibjh ibjh1 = new ibjh(hfgo.a);
            cjao.c = new gRPCMethodDescriptor(gRPCMethodType.a, "footprints.oneplatform.FootprintsService/Read", ibjh0, ibjh1, false);
        }
        return (hfgo)this.a.callUnaryWithAuth(cjao.c, baqr0, hfgm0, 10000L, TimeUnit.MILLISECONDS, this.b);
    }

    public final hfha b(baqr baqr0, hfgy hfgy0) {
        if(cjao.d == null) {
            ibjh ibjh0 = new ibjh(hfgy.a);
            ibjh ibjh1 = new ibjh(hfha.a);
            cjao.d = new gRPCMethodDescriptor(gRPCMethodType.a, "footprints.oneplatform.FootprintsService/Write", ibjh0, ibjh1, false);
        }
        return (hfha)this.a.callUnaryWithAuth(cjao.d, baqr0, hfgy0, 10000L, TimeUnit.MILLISECONDS, this.b);
    }

    @Override
    public final void close() {
        this.a.shutdownChannel();
    }
}

