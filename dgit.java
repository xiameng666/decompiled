final class dgit extends ibsl implements ibts {
    int a;
    final dgiy b;
    final String c;

    public dgit(dgiy dgiy0, String s, ibrl ibrl0) {
        this.b = dgiy0;
        this.c = s;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new dgit(this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.b(this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Number)object0).intValue() != 0) {
            dcvz.a.e().i("Can\'t open share content %s after installing %s", this.b.c, this.c);
        }
        return ibom.a;
    }
}

