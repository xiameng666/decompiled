public final class cbtg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((gvhy)object0), "$this$logEvent");
        gvhd gvhd0 = gvhc.a(((ProtoLiteMessage)gvhk.a).v_newBuilder());
        gvhb gvhb0 = gvha.a(((ProtoLiteMessage)gvhj.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = gvhb0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvhj gvhj0 = (gvhj)hftp0.b_message;
        gvhj0.b |= 4;
        gvhj0.d = true;
        gvhd0.b(gvhb0.a());
        ((gvhy)object0).b(gvhd0.a());
        return ibom.a;
    }
}

