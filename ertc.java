final class ertc extends ibsl implements ibtx {
    int a;
    Object b;
    boolean c;
    final ibnf d;

    public ertc(ibnf ibnf0, ibrl ibrl0) {
        this.d = ibnf0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ertc ertc0 = new ertc(this.d, ((ibrl)object2));
        ertc0.b = (String)object0;
        ertc0.c = ((Boolean)object1).booleanValue();
        return ertc0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return new ibnw(((ibnw)object0).a);
        }
        Object object2 = this.b;
        boolean z = this.c;
        ertf ertf0 = ((ertg)this.d).a();
        this.a = 1;
        Object object3 = ertf.a(ertf0, ((String)object2), z, this);
        return object3 == object1 ? object1 : new ibnw(object3);
    }
}

