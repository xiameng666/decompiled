public final class cbua implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvhd gvhd0 = gvhc.a(((ProtoLiteMessage)gvhk.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = gvhd0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvhk gvhk0 = (gvhk)hftp0.b_message;
        gvhk0.b |= 2;
        gvhk0.d = true;
        ((gvhy)object0).b(gvhd0.a());
        return ibom.a;
    }
}

