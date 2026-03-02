public final class bvvm implements ibts {
    public final bvzg a;
    public final bvvt b;

    public bvvm(bvzg bvzg0, bvvt bvvt0) {
        this.a = bvzg0;
        this.b = bvvt0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        hgnj hgnj0 = ((hglz)object0).c;
        if(hgnj0 == null) {
            hgnj0 = hgnj.a;
        }
        olf olf0 = ((bvpz)this.a.d.a.u()).a.z();
        bvpv bvpv0 = new bvpv(hgnj0);
        lqd lqd0 = olf0.e(new String[]{"ScreenEntity"}, bvpv0);
        bvvs bvvs0 = new bvvs(new bvvo(this.b, ((hglz)object0)));
        lqd0.g(this.b, bvvs0);
        return ibom.a;
    }
}

