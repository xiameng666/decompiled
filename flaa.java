public final class flaa implements gfsi {
    public final long a;

    public flaa(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((flak)object0))));
        if(!((flah)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((flah)hftp0))).ensureMutable();
        }
        flak flak0 = (flak)((flah)hftp0).b_message;
        flak0.b |= 2;
        flak0.e = this.a;
        return (flak)((ProtoLiteBuilder)(((flah)hftp0))).N_build();
    }
}

