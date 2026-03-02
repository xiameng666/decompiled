import j..time.Duration;

public final class eyfb implements ibts {
    public final gzxp a;
    public final gzxn b;
    public final gzxo c;
    public final Duration d;
    public final gzyj e;

    public eyfb(gzxp gzxp0, gzxn gzxn0, gzxo gzxo0, Duration duration0, gzyj gzyj0) {
        this.a = gzxp0;
        this.b = gzxn0;
        this.c = gzxo0;
        this.d = duration0;
        this.e = gzyj0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzxq.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzxp gzxp0 = this.a;
        ibuq.f(gzxp0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxn gzxn0 = this.b;
        gzxq gzxq0 = (gzxq)hftp0.b_message;
        gzxq0.e = gzxp0.a();
        ibuq.f(gzxn0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxo gzxo0 = this.c;
        gzxq gzxq1 = (gzxq)hftp0.b_message;
        gzxq1.c = gzxn0.a();
        ibuq.f(gzxo0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxq gzxq2 = (gzxq)hftp0.b_message;
        gzxq2.d = gzxo0.a();
        hfst hfst0 = hfyo.a(this.d);
        ibuq.f(hfst0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyj gzyj0 = this.e;
        gzxq gzxq3 = (gzxq)hftp0.b_message;
        hfst0.getClass();
        gzxq3.g = hfst0;
        gzxq3.b |= 1;
        ibuq.f(gzyj0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzxq gzxq4 = (gzxq)hftp0.b_message;
        gzxq4.f = gzyj0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzxq)hftv0), "value");
        ProtoLiteBuilder hftp1 = ((gzxd)object0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp1.b_message;
        ((gzxq)hftv0).getClass();
        gzzc0.d = (gzxq)hftv0;
        gzzc0.c = 16;
        return ibom.a;
    }
}

