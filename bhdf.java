public final class bhdf implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((bhcl)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((bhcl)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((bhcl)hftp0.b_message).c = true;
        return (bhcl)hftp0.N_build();
    }
}

