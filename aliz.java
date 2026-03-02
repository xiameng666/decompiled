public final class aliz implements gfsi {
    public final String a;
    public final long b;

    public aliz(String s, long v) {
        this.a = s;
        this.b = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((alus)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((alus)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        alus alus0 = (alus)hftp0.b_message;
        this.a.getClass();
        alus0.b |= 1;
        alus0.c = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((alus)hftv0).b |= 2;
        ((alus)hftv0).d = this.b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        alus alus1 = (alus)hftp0.b_message;
        hfvh hfvh0 = alus1.e;
        if(!hfvh0.b) {
            alus1.e = hfvh0.a();
        }
        alus1.e.clear();
        return (alus)hftp0.N_build();
    }
}

