public final class cbio implements ibts {
    public final gvgx a;
    public final gvgz b;
    public final long c;

    public cbio(gvgx gvgx0, gvgz gvgz0, long v) {
        this.a = gvgx0;
        this.b = gvgz0;
        this.c = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvlf gvlf0 = gvle.a(((ProtoLiteMessage)gvhw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvlc.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gvgx gvgx0 = this.a;
        ibuq.f(gvgx0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvgz gvgz0 = this.b;
        ((gvlc)hftp0.b_message).c = gvgx0.A;
        ((gvlc)hftp0.b_message).b |= 1;
        ibuq.f(gvgz0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvlc)hftv0).d = gvgz0.f;
        ((gvlc)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvlc gvlc0 = (gvlc)hftp0.b_message;
        gvlc0.b |= 4;
        gvlc0.e = this.c;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((gvlc)hftv1), "value");
        ProtoLiteBuilder hftp1 = gvlf0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhw gvhw0 = (gvhw)hftp1.b_message;
        ((gvlc)hftv1).getClass();
        gvhw0.f = (gvlc)hftv1;
        gvhw0.e = 6;
        ((gvhy)object0).f(gvlf0.a());
        return ibom.a;
    }
}

