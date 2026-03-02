final class lbu extends ibsl implements ibts {
    Object a;
    int b;
    final ibvd c;
    final lcc d;
    final ibvb e;

    public lbu(ibvd ibvd0, lcc lcc0, ibvb ibvb0, ibrl ibrl0) {
        this.c = ibvd0;
        this.d = lcc0;
        this.e = ibvb0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new lbu(this.c, this.d, this.e, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibvb ibvb0;
        ibvb ibvb1;
        ibvd ibvd0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    ibvd0 = this.c;
                    this.a = ibvd0;
                    this.b = 1;
                    object0 = this.d.h(this);
                    if(object0 != object1) {
                        goto label_14;
                    }
                    break;
                }
                catch(laf unused_ex) {
                    goto label_26;
                }
                goto label_14;
            }
            case 1: {
                ibvd0 = (ibvd)this.a;
                try {
                    ibnx.b(object0);
                label_14:
                    ibvd0.a = object0;
                    ibvb1 = this.e;
                    lct lct0 = this.d.c();
                    this.a = ibvb1;
                    this.b = 2;
                    object0 = lct0.a(this);
                    if(object0 != object1) {
                        ibvb1.a = ((Number)object0).intValue();
                        return ibom.a;
                    }
                    break;
                }
                catch(laf unused_ex) {
                    goto label_26;
                }
                ibvb1.a = ((Number)object0).intValue();
                return ibom.a;
            }
            case 2: {
                ibvb1 = (ibvb)this.a;
                try {
                    ibnx.b(object0);
                    ibvb1.a = ((Number)object0).intValue();
                    return ibom.a;
                }
                catch(laf unused_ex) {
                label_26:
                    ibvb ibvb2 = this.e;
                    Object object2 = this.c.a;
                    this.a = ibvb2;
                    this.b = 3;
                    Object object3 = this.d.k(object2, true, this);
                    if(object3 != object1) {
                        object0 = object3;
                        ibvb0 = ibvb2;
                        ibvb0.a = ((Number)object0).intValue();
                        return ibom.a;
                    }
                    break;
                }
                ibvb0.a = ((Number)object0).intValue();
                return ibom.a;
            }
            default: {
                ibvb0 = (ibvb)this.a;
                ibnx.b(object0);
                ibvb0.a = ((Number)object0).intValue();
                return ibom.a;
            }
        }
        return object1;
    }
}

