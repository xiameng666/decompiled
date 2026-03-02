public final class fcft implements gfsi {
    public final fdpl a;
    public final fesl b;

    public fcft(fdpl fdpl0, fesl fesl0) {
        this.a = fdpl0;
        this.b = fesl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fesy)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fesy)object0))));
        String s = fcfw.c(this.a);
        s.getClass();
        fesl fesl0 = this.b;
        fesl0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesy fesy0 = (fesy)hftp0.b_message;
        hfvh hfvh0 = fesy0.b;
        if(!hfvh0.b) {
            fesy0.b = hfvh0.a();
        }
        fesy0.b.put(s, fesl0);
        return (fesy)hftp0.N_build();
    }
}

