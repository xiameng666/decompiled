import java.util.concurrent.TimeUnit;

public final class fvau implements AutoCloseable {
    protected final bbfe_BaseGrpcServer a;
    protected final iakq b;
    private static gRPCMethodDescriptor c;

    public fvau(bbfe_BaseGrpcServer bbfe0) {
        if(!hrpw.c()) {
            fhbw fhbw0 = new fhbw();
            fhbw0.a(new fvat());
            fhad fhad0 = fhae.a();
            fhad0.b(bbfe0.context);
            bbfe0.addInterceptor(fhbu.b(fhad0.a(), fhbw0));
            bbfe0.j();
        }
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.a = bbfe0;
        this.b = iakq.a;
    }

    public fvau(fvau fvau0, iakp iakp0, Object object0) {
        this.a = fvau0.a;
        this.b = fvau0.b.h(iakp0, object0);
    }

    public final gxsx a(baqr baqr0, gxsw gxsw0) {
        if(fvau.c == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gxsw.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gxsx.a));
            fvau.c = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.android.location.voilatile.v1.VoilaTileService/FindTiles", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gxsx)this.a.callUnaryWithAuth(fvau.c, baqr0, gxsw0, 30000L, TimeUnit.MILLISECONDS, this.b);
    }

    public final void b() {
        this.a.shutdownChannel();
    }

    @Override
    public final void close() {
        this.b();
    }
}

