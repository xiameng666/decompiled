public final class dybp implements gfsi {
    public final dyna a;
    public final dykr b;

    public dybp(dyna dyna0, dykr dykr0) {
        this.a = dyna0;
        this.b = dykr0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dylt)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dylt)object0))));
        String s = this.a.name();
        String s1 = this.a.name();
        dykr dykr0 = dykr.a;
        s1.getClass();
        dykr dykr1 = (dykr)((dylt)object0).b.get(s1);
        if(dykr1 != null) {
            dykr0 = dykr1;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dykr0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dykr0));
        hftp1.X(((ProtoLiteMessage)this.b));
        ((dylr)hftp0).a(s, ((dykr)hftp1.N_build()));
        return (dylt)((ProtoLiteBuilder)(((dylr)hftp0))).N_build();
    }
}

