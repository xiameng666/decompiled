public final class gbjp {
    public final gaym a;
    public final gbju b;
    private final icta c;

    public gbjp(gaym gaym0, gbju gbju0) {
        ibuq.f(gaym0, "eventLogger");
        super();
        this.a = gaym0;
        this.b = gbju0;
        this.c = new icta();
    }

    public final Object a(ibrl ibrl0) {
        Object object3;
        icta icta2;
        Throwable throwable1;
        Object object2;
        icta icta0;
        gbjn gbjn0;
        if((ibrl0 instanceof gbjn)) {
            gbjn0 = (gbjn)ibrl0;
            int v = gbjn0.c;
            if((v & 0x80000000) == 0) {
                gbjn0 = new gbjn(this, ibrl0);
            }
            else {
                gbjn0.c = v - 0x80000000;
            }
        }
        else {
            gbjn0 = new gbjn(this, ibrl0);
        }
        Object object0 = gbjn0.a;
        Object object1 = ibrx.a;
        switch(gbjn0.c) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.c;
                gbjn0.d = icta0;
                gbjn0.c = 1;
                if(icta0.b(gbjn0) != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                icta icta1 = gbjn0.d;
                ibnx.b(object0);
                icta0 = icta1;
                try {
                label_22:
                    icig icig0 = ickq.b(new icma(((gbjv)this.b).f), new gbjo(this, null));
                    gbjn0.d = icta0;
                    gbjn0.c = 2;
                    object2 = icll.a(icig0, gbjn0);
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    icta2 = icta0;
                    break;
                }
                if(object2 != object1) {
                    object0 = object2;
                    icta2 = icta0;
                    object3 = (gbkb)object0;
                    goto label_43;
                }
                return object1;
            }
            case 2: {
                try {
                    icta2 = gbjn0.d;
                    ibnx.b(object0);
                    object3 = (gbkb)object0;
                    goto label_43;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icta2.d();
        throw throwable1;
    label_43:
        icta2.d();
        return object3;
    }
}

