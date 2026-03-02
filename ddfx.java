final class ddfx extends ibsl implements ibtx {
    int a;
    float b;
    final gep c;

    public ddfx(gep gep0, ibrl ibrl0) {
        this.c = gep0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        icck icck0 = (icck)object0;
        float f = ((Number)object1).floatValue();
        ddfx ddfx0 = new ddfx(this.c, ((ibrl)object2));
        ddfx0.b = f;
        return ddfx0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            float f = this.b;
            ges ges0 = this.c.b();
            cib cib0 = this.c.e();
            chl chl0 = this.c.a();
            this.a = 1;
            if(ddfz.a(ges0, f, cib0, chl0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

