import java.util.concurrent.TimeUnit;

public final class bvpn implements AutoCloseable {
    public static final int a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public final bbfe_BaseGrpcServer d;
    public final iakq e;
    private static gRPCMethodDescriptor f;

    static {
        bvpn.a = (int)htwl.c();
    }

    public bvpn(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.d = bbfe0;
        this.e = iakq.a;
    }

    public bvpn(bvpn bvpn0, iakp iakp0, Object object0) {
        this.d = bvpn0.d;
        this.e = bvpn0.e.h(iakp0, object0);
    }

    public final hgnr a(baqr baqr0, hgnq hgnq0) {
        if(bvpn.f == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)hgnq.a));
            ibjh ibjh1 = new ibjh(((MessageLite)hgnr.a));
            bvpn.f = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/GetCurrentDropsCampaignStatus", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (hgnr)this.d.callUnaryWithAuth(bvpn.f, baqr0, hgnq0, ((long)bvpn.a), TimeUnit.MILLISECONDS, this.e);
    }

    @Override
    public final void close() {
        this.d.shutdownChannel();
    }
}

