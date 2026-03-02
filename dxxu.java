import j..util.Objects;

public final class dxxu implements gfsi {
    public final long a;
    public final gfsi b;

    public dxxu(long v, gfsi gfsi0) {
        this.a = v;
        this.b = gfsi0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        dxyc dxyc0 = new dxyc(this.a);
        hfuo hfuo0 = ((fsym)object0).b;
        fsyk fsyk0 = (fsyk)Objects.requireNonNull(((fsyk)gggq.l(hfuo0, dxyc0, dxye.f(this.a))));
        fsyl fsyl0 = (fsyl)((ProtoLiteMessage)fsym.a).v_newBuilder();
        fsyl0.k(((fsyk)this.b.apply(fsyk0)));
        fsyl0.a(gggq.d(hfuo0, new gfti(dxyc0)));
        return (fsym)((ProtoLiteBuilder)fsyl0).N_build();
    }
}

