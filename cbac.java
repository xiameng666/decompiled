public final class cbac implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((caxm)object0), "$this$updateInfo");
        ProtoLiteBuilder hftp0 = ((caxm)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        caxk caxk0 = (caxk)hftp0.b_message;
        caxk0.b |= 0x40;
        caxk0.i = true;
        return ibom.a;
    }
}

