public final class comh implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cogm)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cogm)object0))));
        long v = System.currentTimeMillis();
        if(!((cogh)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((cogh)hftp0))).ensureMutable();
        }
        cogm cogm0 = (cogm)((cogh)hftp0).b_message;
        cogm0.b |= 0x20;
        cogm0.j = v;
        return (cogm)((ProtoLiteBuilder)(((cogh)hftp0))).N_build();
    }
}

