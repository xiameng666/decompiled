public final class bovj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fqzv)hftp0.b_message).c |= 8;
        ((fqzv)hftp0.b_message).h = true;
        return (fqzv)hftp0.N_build();
    }
}

