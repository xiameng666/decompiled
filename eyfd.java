public final class eyfd implements ibts {
    public final gzyd a;
    public final gzyj b;
    public final gzyj c;

    public eyfd(gzyd gzyd0, gzyj gzyj0, gzyj gzyj1) {
        this.a = gzyd0;
        this.b = gzyj0;
        this.c = gzyj1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gzxd)object0), "$this$logEvent");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gzye.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gzyd gzyd0 = this.a;
        ibuq.f(gzyd0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyj gzyj0 = this.b;
        gzye gzye0 = (gzye)hftp0.b_message;
        gzye0.b = gzyd0.a();
        ibuq.f(gzyj0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzyj gzyj1 = this.c;
        gzye gzye1 = (gzye)hftp0.b_message;
        gzye1.c = gzyj0.a();
        ibuq.f(gzyj1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gzye gzye2 = (gzye)hftp0.b_message;
        gzye2.d = gzyj1.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gzye)hftv0), "value");
        ProtoLiteBuilder hftp1 = ((gzxd)object0).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gzzc gzzc0 = (gzzc)hftp1.b_message;
        ((gzye)hftv0).getClass();
        gzzc0.d = (gzye)hftv0;
        gzzc0.c = 15;
        return ibom.a;
    }
}

