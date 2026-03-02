final class byv extends ibsk implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    long h;
    int i;
    final byx j;
    final byw k;
    private Object l;

    public byv(byx byx0, byw byw0, ibrl ibrl0) {
        this.j = byx0;
        this.k = byw0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((byv)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new byv(this.j, this.k, ibrl0);
        ibrl1.l = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object4;
        Object object3;
        Object object2;
        int v4;
        int v3;
        long v2;
        int v1;
        int v;
        int v5;
        long[] arr_v;
        Object object6;
        Object object5;
        ibxt ibxt1;
        Object object1 = ibrx.a;
        if(this.i == 0) {
            ibnx.b(object0);
            ibxt1 = (ibxt)this.l;
            object5 = this.j;
            object6 = this.k;
            arr_v = object5.a.a;
            v5 = arr_v.length - 2;
            if(v5 < 0) {
                return ibom.a;
            }
        }
        else {
            v = this.g;
            v1 = this.f;
            v2 = this.h;
            v3 = this.e;
            v4 = this.d;
            object2 = this.c;
            object3 = this.b;
            object4 = this.a;
            ibxt0 = (ibxt)this.l;
            ibnx.b(object0);
            v2 >>= 8;
            ++v;
            goto label_34;
        }
        for(int v6 = 0; true; ++v6) {
            long v7 = arr_v[v6];
            if((~v7 << 7 & v7 & 0x8080808080808080L) != 0x8080808080808080L) {
                v4 = v5;
                v3 = v6;
                ibxt0 = ibxt1;
                v = 0;
                object3 = object5;
                object2 = arr_v;
                v1 = 8 - (~(v6 - v5) >>> 0x1F);
                object4 = object6;
                v2 = v7;
            label_34:
                while(v < v1) {
                    if((0xFFL & v2) < 0x80L) {
                        int v8 = (v3 << 3) + v;
                        ((byw)object4).a = v8;
                        Object object7 = ((byx)object3).a.b[v8];
                        this.l = ibxt0;
                        this.a = object4;
                        this.b = object3;
                        this.c = object2;
                        this.d = v4;
                        this.e = v3;
                        this.h = v2;
                        this.f = v1;
                        this.g = v;
                        this.i = 1;
                        if(ibxt0.a(object7, this) == object1) {
                            return object1;
                        }
                    }
                    v2 >>= 8;
                    ++v;
                }
                if(v1 != 8) {
                    break;
                }
                v6 = v3;
                v5 = v4;
                arr_v = object2;
                object5 = object3;
                object6 = object4;
                ibxt1 = ibxt0;
            }
            if(v6 == v5) {
                break;
            }
        }
        return ibom.a;
    }
}

