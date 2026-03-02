public final class cawq implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((caxm)object0), "$this$updateInfo");
        ProtoLiteBuilder hftp0 = ((caxm)object0).a;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        long v = ((caxk)hftv0).m + 1L;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        caxk caxk0 = (caxk)hftp0.b_message;
        caxk0.b |= 0x400;
        caxk0.m = v;
        return ibom.a;
    }
}

