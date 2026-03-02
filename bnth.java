public final class bnth implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = gggq.a(((fqzo)object0).b, new bnta());
        if(v >= 0) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzo)object0))).jf(5, null);
            hftp0.X(((ProtoLiteMessage)(((fqzo)object0))));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fqzo fqzo0 = (fqzo)hftp0.b_message;
            fqzo0.b();
            fqzo0.b.remove(v);
            return (fqzo)hftp0.N_build();
        }
        return (fqzo)object0;
    }
}

