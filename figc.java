public final class figc implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cptq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cptq)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cptq cptq0 = (cptq)hftp0.b_message;
        cptq0.b &= -2;
        cptq0.c = cptq.a.c;
        return (cptq)hftp0.N_build();
    }
}

