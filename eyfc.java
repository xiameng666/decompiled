import j..time.Duration;

public final class eyfc implements ibts {
    public final gzyx a;
    public final eyfl b;
    public final Duration c;

    public eyfc(gzyx gzyx0, eyfl eyfl0, Duration duration0) {
        this.a = gzyx0;
        this.b = eyfl0;
        this.c = duration0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.e);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzyy.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyx gzyx0 = this.a;
        ibuq.f(gzyx0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyy gzyy0 = (gzyy)hftp0.b_message;
        gzyy0.c = gzyx0.a();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gzyw.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        hfst hfst0 = hfyo.a(this.c);
        ibuq.f(hfst0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzyw gzyw0 = (gzyw)hftp1.b_message;
        hfst0.getClass();
        gzyw0.c = hfst0;
        gzyw0.b |= 1;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzyw)hftv0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyy gzyy1 = (gzyy)hftp0.b_message;
        ((gzyw)hftv0).getClass();
        gzyy1.d = (gzyw)hftv0;
        gzyy1.b |= 1;
        this.b.c(bbdg.uq);
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gzyy)hftv1), "value");
        ProtoLiteBuilder hftp2 = ((gzxd)object0).a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp2.b_message;
        ((gzyy)hftv1).getClass();
        gzzc0.d = (gzyy)hftv1;
        gzzc0.c = 5;
        return ibom.a;
    }
}

