import java.util.List;

public final class ldq {
    public final icbr a;
    public List b;
    final lcc c;
    private final icta d;

    public ldq() {
        this.d = new icta();
        this.a = new icbr();
    }

    public ldq(lcc lcc0, List list0) {
        ibuq.f(list0, "initTasksList");
        this.c = lcc0;
        super();
        this.d = new icta();
        this.a = new icbr();
        this.b = ibpo.ar(list0);
    }

    public final Object a(ibrl ibrl0) {
        icta icta2;
        icta icta0;
        ldp ldp0;
        if((ibrl0 instanceof ldp)) {
            ldp0 = (ldp)ibrl0;
            int v = ldp0.c;
            if((v & 0x80000000) == 0) {
                ldp0 = new ldp(this, ibrl0);
            }
            else {
                ldp0.c = v - 0x80000000;
            }
        }
        else {
            ldp0 = new ldp(this, ibrl0);
        }
        Object object0 = ldp0.a;
        Object object1 = ibrx.a;
        switch(ldp0.c) {
            case 0: {
                ibnx.b(object0);
                if(this.a.oM()) {
                    return ibom.a;
                }
                icta0 = this.d;
                ldp0.d = icta0;
                ldp0.c = 1;
                if(icta0.b(ldp0) == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                icta icta1 = ldp0.d;
                ibnx.b(object0);
                icta0 = icta1;
                try {
                label_24:
                    if(!this.a.oM()) {
                        ldp0.d = icta0;
                        ldp0.c = 2;
                        if(this.b(ldp0) != object1) {
                            icta2 = icta0;
                            goto label_39;
                        }
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    icta2 = icta0;
                    break;
                }
                icta0.d();
                return ibom.a;
            }
            case 2: {
                try {
                    icta2 = ldp0.d;
                    ibnx.b(object0);
                label_39:
                    this.a.V(ibom.a);
                    goto label_44;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        throw throwable0;
    label_44:
        icta2.d();
        return ibom.a;
    }

    protected final Object b(ibrl ibrl0) {
        lah lah0;
        lav lav0;
        if((ibrl0 instanceof lav)) {
            lav0 = (lav)ibrl0;
            int v = lav0.b;
            if((v & 0x80000000) == 0) {
                lav0 = new lav(this, ibrl0);
            }
            else {
                lav0.b = v - 0x80000000;
            }
        }
        else {
            lav0 = new lav(this, ibrl0);
        }
        Object object0 = lav0.a;
        Object object1 = ibrx.a;
        switch(lav0.b) {
            case 0: {
                ibnx.b(object0);
                if(this.b != null && !this.b.isEmpty()) {
                    lct lct0 = this.c.c();
                    lay lay0 = new lay(this.c, this, null);
                    lav0.b = 2;
                    object0 = lct0.c(lay0, lav0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                else {
                    lav0.b = 1;
                    object0 = this.c.i(false, lav0);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                lah0 = (lah)object0;
                break;
            }
            case 1: {
                ibnx.b(object0);
                lah0 = (lah)object0;
                break;
            }
            case 2: {
                ibnx.b(object0);
                lah0 = (lah)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.c.d.b(lah0);
        return ibom.a;
    }
}

