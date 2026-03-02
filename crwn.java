import java.util.concurrent.TimeUnit;

public final class crwn implements AutoCloseable {
    protected final bbfe_BaseGrpcServer a;
    protected final iakq b;
    private static final int c;
    private static gRPCMethodDescriptor d;
    private static gRPCMethodDescriptor e;
    private static gRPCMethodDescriptor f;
    private static gRPCMethodDescriptor g;
    private static gRPCMethodDescriptor h;
    private static gRPCMethodDescriptor i;
    private static gRPCMethodDescriptor j;
    private static gRPCMethodDescriptor k;

    static {
        crwn.c = (int)hvjh.a.e().e();
    }

    public crwn(bbfe_BaseGrpcServer bbfe0) {
        bbfe0.setContext(bbfe0.context);
        bbfe0.k();
        this.a = bbfe0;
        this.b = iakq.a;
    }

    public crwn(crwn crwn0, iakp iakp0, Object object0) {
        this.a = crwn0.a;
        this.b = crwn0.b.h(iakp0, object0);
    }

    public final gsof a(baqr baqr0, gsoe gsoe0) {
        if(crwn.k == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsoe.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsof.a));
            crwn.k = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GcoreEsimRegister", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsof)this.a.callUnaryWithAuth(crwn.k, baqr0, gsoe0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final gsoo b(baqr baqr0, gson gson0) {
        if(crwn.g == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gson.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsoo.a));
            crwn.g = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GcoreRegister", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsoo)this.a.callUnaryWithAuth(crwn.g, baqr0, gson0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final gsos c(baqr baqr0, gsor gsor0) {
        if(crwn.i == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsor.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsos.a));
            crwn.i = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetConsentInformation", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsos)this.a.callUnaryWithAuth(crwn.i, baqr0, gsor0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    @Override
    public final void close() {
        this.a.shutdownChannel();
    }

    public final gsou d(baqr baqr0, gsot gsot0) {
        if(crwn.d == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsot.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsou.a));
            crwn.d = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetDataPlanStatus", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsou)this.a.callUnaryWithAuth(crwn.d, baqr0, gsot0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final gspd e(baqr baqr0, gspc gspc0) {
        if(crwn.f == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gspc.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gspd.a));
            crwn.f = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/ListCpidEndpoints", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gspd)this.a.callUnaryWithAuth(crwn.f, baqr0, gspc0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final gsqa f(baqr baqr0, gspz gspz0) {
        if(crwn.h == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gspz.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsqa.a));
            crwn.h = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GcoreUpdateUserDataPlan", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsqa)this.a.callUnaryWithAuth(crwn.h, baqr0, gspz0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final gsqd g(baqr baqr0, gsoz gsoz0) {
        if(crwn.e == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gsoz.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gsqd.a));
            crwn.e = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetUpsellOffer", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        return (gsqd)this.a.callUnaryWithAuth(crwn.e, baqr0, gsoz0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }

    public final void h(baqr baqr0, gspv gspv0) {
        if(crwn.j == null) {
            ibjh ibjh0 = new ibjh(((MessageLite)gspv.a));
            ibjh ibjh1 = new ibjh(((MessageLite)gspw.a));
            crwn.j = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.mobiledataplan.v1.MobileDataPlanService/SetConsentStatus", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
        }
        gspw gspw0 = (gspw)this.a.callUnaryWithAuth(crwn.j, baqr0, gspv0, ((long)crwn.c), TimeUnit.MILLISECONDS, this.b);
    }
}

