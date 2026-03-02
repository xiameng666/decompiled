public final class bicq implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        ibuq.f(((vwj)object0), "$this$createInternal");
        ibuq.f(((vur)object1), "event");
        ibuq.f(((vur)object1), "value");
        ProtoLiteBuilder hftp0 = ((vwj)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        vvc vvc0 = (vvc)hftp0.b_message;
        ((vur)object1).getClass();
        vvc0.p = (vur)object1;
        vvc0.b |= 0x4000;
        return ibom.a;
    }
}

