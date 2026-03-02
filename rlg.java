final class rlg extends ibsl implements ibtx {
    int a;
    Object b;
    Object c;
    final ibtx d;

    public rlg(ibtx ibtx0, ibrl ibrl0) {
        this.d = ibtx0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        rlg rlg0 = new rlg(this.d, ((ibrl)object2));
        rlg0.b = (scz)object0;
        rlg0.c = (rkx)object1;
        return rlg0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        Object object2 = this.b;
        Object object3 = this.c;
        if(!(object3 instanceof rkt)) {
            throw new IllegalArgumentException("Orchestrated subtask did not return a result to the callback.");
        }
        this.b = null;
        this.a = 1;
        Object object4 = this.d.a(object2, ((rkt)object3).a, this);
        return object4 == object1 ? object1 : object4;
    }
}

