final class bys extends ibsk implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final byu f;
    final byt g;
    private Object h;

    public bys(byu byu0, byt byt0, ibrl ibrl0) {
        this.f = byu0;
        this.g = byt0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bys)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bys(this.f, this.g, ibrl0);
        ibrl1.h = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object4;
        Object object3;
        Object object2;
        int v;
        Object object1 = ibrx.a;
        if(this.e == 0) {
            ibnx.b(object0);
            ibxt0 = (ibxt)this.h;
            object3 = this.f;
            object4 = this.g;
            object2 = object3.a.c;
            v = object3.a.e;
        }
        else {
            v = this.d;
            object2 = this.c;
            object3 = this.b;
            object4 = this.a;
            ibxt0 = (ibxt)this.h;
            ibnx.b(object0);
        }
        while(v != 0x7FFFFFFF) {
            long v1 = ((long[])object2)[v] >> 0x1F;
            ((byt)object4).a = v;
            Object object5 = ((byu)object3).a.b[v];
            this.h = ibxt0;
            this.a = object4;
            this.b = object3;
            this.c = object2;
            v = (int)(v1 & 0x7FFFFFFFL);
            this.d = v;
            this.e = 1;
            if(ibxt0.a(object5, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

