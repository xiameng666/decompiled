public final class cbil implements ibts {
    public final gvgx a;

    public cbil(gvgx gvgx0) {
        this.a = gvgx0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvlf gvlf0 = gvle.a(((ProtoLiteMessage)gvhw.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvlb.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        gvgx gvgx0 = this.a;
        ibuq.f(gvgx0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvlb)hftp0.b_message).c = gvgx0.A;
        ((gvlb)hftp0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvlb)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvlf0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvhw gvhw0 = (gvhw)hftp1.b_message;
        ((gvlb)hftv0).getClass();
        gvhw0.f = (gvlb)hftv0;
        gvhw0.e = 5;
        ((gvhy)object0).f(gvlf0.a());
        return ibom.a;
    }
}

