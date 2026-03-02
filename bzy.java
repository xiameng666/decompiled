final class bzy extends ibsk implements ibtw {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    int f;
    long g;
    int h;
    final bzz i;
    private Object j;

    public bzy(bzz bzz0, ibrl ibrl0) {
        this.i = bzz0;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bzy)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bzy(this.i, ibrl0);
        ibrl1.j = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibxt ibxt0;
        Object object3;
        Object object2;
        int v4;
        int v3;
        long v2;
        int v1;
        int v;
        int v5;
        long[] arr_v;
        Object[] arr_object;
        ibxt ibxt1;
        Object object1 = ibrx.a;
        if(this.h == 0) {
            ibnx.b(object0);
            ibxt1 = (ibxt)this.j;
            arr_object = this.i.a.c;
            arr_v = this.i.a.a;
            v5 = arr_v.length - 2;
            if(v5 < 0) {
                return ibom.a;
            }
            v3 = 0;
        }
        else {
            v = this.f;
            v1 = this.e;
            v2 = this.g;
            v3 = this.d;
            v4 = this.c;
            object2 = this.b;
            object3 = this.a;
            ibxt0 = (ibxt)this.j;
            ibnx.b(object0);
            v2 >>= 8;
            ++v;
            goto label_30;
        }
        while(true) {
            long v6 = arr_v[v3];
            if((~v6 << 7 & v6 & 0x8080808080808080L) != 0x8080808080808080L) {
                ibxt0 = ibxt1;
                v = 0;
                object2 = arr_v;
                v4 = v5;
                v1 = 8 - (~(v3 - v5) >>> 0x1F);
                object3 = arr_object;
                v2 = v6;
            label_30:
                while(v < v1) {
                    if((0xFFL & v2) < 0x80L) {
                        this.j = ibxt0;
                        this.a = object3;
                        this.b = object2;
                        this.c = v4;
                        this.d = v3;
                        this.g = v2;
                        this.e = v1;
                        this.f = v;
                        this.h = 1;
                        if(ibxt0.a(((Object[])object3)[(v3 << 3) + v], this) == object1) {
                            return object1;
                        }
                    }
                    v2 >>= 8;
                    ++v;
                }
                if(v1 != 8) {
                    break;
                }
                v5 = v4;
                arr_v = object2;
                arr_object = object3;
                ibxt1 = ibxt0;
            }
            if(v3 == v5) {
                break;
            }
            ++v3;
        }
        return ibom.a;
    }
}

