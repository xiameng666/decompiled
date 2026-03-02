public final class apfv implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((apdm)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((apdm)object0))));
        hfwn hfwn0 = apgj.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        apdm apdm0 = (apdm)hftp0.b_message;
        hfwn0.getClass();
        apdm0.e = hfwn0;
        apdm0.b |= 1;
        return (apdm)hftp0.N_build();
    }
}

