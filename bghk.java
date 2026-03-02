final class bghk extends ibsl implements ibts {
    int a;
    final bghr b;
    final String c;
    final String d;

    public bghk(bghr bghr0, String s, String s1, ibrl ibrl0) {
        this.b = bghr0;
        this.c = s;
        this.d = s1;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new bghk(this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        bghj bghj0 = new bghj(this.b, this.c, this.d, null);
        this.a = 1;
        Object object2 = this.b.b(bghj0, this);
        return object2 == object1 ? object1 : object2;
    }
}

