import java.util.concurrent.TimeUnit;

public final class egkd implements AutoCloseable {
    public static gRPCMethodDescriptor a;
    public static gRPCMethodDescriptor b;
    public static gRPCMethodDescriptor c;
    public static gRPCMethodDescriptor d;
    public static gRPCMethodDescriptor e;
    public static gRPCMethodDescriptor f;
    public static gRPCMethodDescriptor g;
    public static gRPCMethodDescriptor h;
    public static gRPCMethodDescriptor i;
    public static gRPCMethodDescriptor j;
    public static gRPCMethodDescriptor k;
    public static gRPCMethodDescriptor l;
    public static gRPCMethodDescriptor m;
    public static gRPCMethodDescriptor n;
    public final bbfe_BaseGrpcServer o;
    public final iakq p;
    private static gRPCMethodDescriptor q;

    public egkd(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.o = bbfe0;
        this.p = iakq.a;
    }

    public egkd(egkd egkd0, iakp iakp0, Object object0) {
        this.o = egkd0.o;
        this.p = egkd0.p.h(iakp0, object0);
    }

    public final gssv a(baqr baqr0, gssr gssr0) {
        return this.b(baqr0, gssr0, 10000L);
    }

    public final gssv b(baqr baqr0, gssr gssr0, long v) {
        if(egkd.q == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gssr.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gssv.a));
            egkd.q = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/GetPeople", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gssv)this.o.callUnaryWithAuth(egkd.q, baqr0, gssr0, v, TimeUnit.MILLISECONDS, this.p);
    }

    public final void c() {
        this.o.shutdownChannel();
    }

    @Override
    public final void close() {
        this.c();
    }
}

