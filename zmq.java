final class zmq extends ibsl implements ibtw {
    final zms a;
    final String b;
    final grym c;

    public zmq(zms zms0, String s, grym grym0, ibrl ibrl0) {
        this.a = zms0;
        this.b = s;
        this.c = grym0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((zmq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new zmq(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        zms zms0 = this.a;
        if(ibuq.m(((zmo)zms0.l.b()).a, this.b)) {
            zms0.j.l(zmx.a);
            zms0.i.l(this.c);
        }
        return ibom.a;
    }
}

