public final class bvsl implements gfsi {
    public final byte[] a;

    public bvsl(byte[] arr_b) {
        this.a = arr_b;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqa)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqa)object0))));
        ByteString hfsf0 = ByteString.copyFrom(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqqa gqqa0 = (gqqa)hftp0.b_message;
        gqqa0.b |= 1;
        gqqa0.c = hfsf0;
        return (gqqa)hftp0.N_build();
    }
}

