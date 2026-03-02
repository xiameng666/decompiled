import java.util.concurrent.TimeUnit;

public final class ekft implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    protected final bbfe_BaseGrpcServer b;
    protected final iakq c;
    private static gRPCMethodDescriptor d;

    public ekft(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.b = bbfe0;
        this.c = iakq.a;
    }

    public ekft(ekft ekft0, iakp iakp0, Object object0) {
        this.b = ekft0.b;
        this.c = ekft0.c.h(iakp0, object0);
    }

    public final gssp a(baqr baqr0, gsso gsso0, long v) {
        if(ekft.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsso.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gssp.a));
            ekft.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/FetchBackUpDeviceContactInfo", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gssp)this.b.callUnaryWithAuth(ekft.d, baqr0, gsso0, v, TimeUnit.MILLISECONDS, this.c);
    }

    @Override
    public final void close() {
        this.b.shutdownChannel();
    }
}

