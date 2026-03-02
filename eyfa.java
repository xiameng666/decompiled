import j..time.Duration;

public final class eyfa implements ibts {
    public final gzyh a;
    public final double b;
    public final gzyj c;
    public final Duration d;
    public final Integer e;

    public eyfa(gzyh gzyh0, double f, gzyj gzyj0, Duration duration0, Integer integer0) {
        this.a = gzyh0;
        this.b = f;
        this.c = gzyj0;
        this.d = duration0;
        this.e = integer0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzyi.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyh gzyh0 = this.a;
        ibuq.f(gzyh0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        Duration duration0 = this.d;
        gzyi gzyi0 = (gzyi)hftp0.b_message;
        gzyi0.c = gzyh0.a();
        gzxj gzxj0 = gzxi.a(((ProtoLiteMessage)gzyg.a).v_newBuilder());
        gzxj0.c(((int)(this.b * 1000.0)));
        gzxj0.b(this.c);
        if(duration0 != null) {
            gzxj0.d(((int)duration0.toMillis()));
        }
        Integer integer0 = this.e;
        if(integer0 != null) {
            ProtoLiteBuilder hftp1 = gzxj0.a;
            int v = integer0.intValue();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gzyg)hftp1.b_message).e = v;
        }
        gzyg gzyg0 = gzxj0.a();
        ibuq.f(gzyg0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyi gzyi1 = (gzyi)hftp0.b_message;
        gzyg0.getClass();
        gzyi1.d = gzyg0;
        gzyi1.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzyi)hftv0), "value");
        ProtoLiteBuilder hftp2 = ((gzxd)object0).a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp2.b_message;
        ((gzyi)hftv0).getClass();
        gzzc0.d = (gzyi)hftv0;
        gzzc0.c = 11;
        return ibom.a;
    }
}

