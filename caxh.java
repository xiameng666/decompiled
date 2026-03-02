public final class caxh implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((laf)object0), "it");
        caxm caxm0 = caxl.a(((ProtoLiteMessage)caxk.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = caxm0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        caxk caxk0 = (caxk)hftp0.b_message;
        caxk0.b |= 0x80;
        caxk0.j = true;
        return caxm0.a();
    }
}

