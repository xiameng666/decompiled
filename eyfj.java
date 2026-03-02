import j..time.Duration;

public final class eyfj implements ibts {
    public final gzyk a;
    public final gzym b;
    public final Double c;
    public final Duration d;

    public eyfj(gzyk gzyk0, gzym gzym0, Double double0, Duration duration0) {
        this.a = gzyk0;
        this.b = gzym0;
        this.c = double0;
        this.d = duration0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ((gzxd)object0).b(gzxz.f);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzyl.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyk gzyk0 = this.a;
        ibuq.f(gzyk0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzym gzym0 = this.b;
        gzyl gzyl0 = (gzyl)hftp0.b_message;
        gzyl0.c = gzyk0.a();
        ibuq.f(gzym0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Duration duration0 = this.d;
        Double double0 = this.c;
        gzyl gzyl1 = (gzyl)hftp0.b_message;
        gzyl1.d = gzym0.a();
        if(double0 != null || duration0 != null) {
            gzxj gzxj0 = gzxi.a(((ProtoLiteMessage)gzyg.a).v_newBuilder());
            if(double0 != null) {
                gzxj0.c(((int)(double0.doubleValue() * 1000.0)));
            }
            if(duration0 != null) {
                gzxj0.d(((int)duration0.toMillis()));
            }
            gzyg gzyg0 = gzxj0.a();
            ibuq.f(gzyg0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gzyl gzyl2 = (gzyl)hftp0.b_message;
            gzyg0.getClass();
            gzyl2.e = gzyg0;
            gzyl2.b |= 1;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzyl)hftv0), "value");
        ProtoLiteBuilder hftp1 = ((gzxd)object0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp1.b_message;
        ((gzyl)hftv0).getClass();
        gzzc0.d = (gzyl)hftv0;
        gzzc0.c = 6;
        return ibom.a;
    }
}

