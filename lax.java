public final class lax {
    final ibuz a;
    final ibvd b;
    final lcc c;
    final icta d;

    public lax(icta icta0, ibuz ibuz0, ibvd ibvd0, lcc lcc0) {
        this.d = icta0;
        this.a = ibuz0;
        this.b = ibvd0;
        this.c = lcc0;
        super();
    }

    public final Object a(ibtw ibtw0, ibrl ibrl0) {
        Object object5;
        ibvd ibvd2;
        icta icta3;
        icta icta2;
        Object object3;
        lcc lcc0;
        ibvd ibvd0;
        ibuz ibuz0;
        icta icta0;
        law law0;
        if((ibrl0 instanceof law)) {
            law0 = (law)ibrl0;
            int v = law0.f;
            if((v & 0x80000000) == 0) {
                law0 = new law(this, ibrl0);
            }
            else {
                law0.f = v - 0x80000000;
            }
        }
        else {
            law0 = new law(this, ibrl0);
        }
        Object object0 = law0.d;
        Object object1 = ibrx.a;
        switch(law0.f) {
            case 0: {
                ibnx.b(object0);
                icta0 = this.d;
                ibuz0 = this.a;
                ibvd0 = this.b;
                lcc0 = this.c;
                law0.a = ibtw0;
                law0.b = icta0;
                law0.c = ibuz0;
                law0.g = ibvd0;
                law0.h = lcc0;
                law0.f = 1;
                if(icta0.b(law0) == object1) {
                    return object1;
                }
                goto label_35;
            }
            case 1: {
                lcc0 = law0.h;
                ibvd ibvd1 = law0.g;
                ibuz0 = (ibuz)law0.c;
                icta icta1 = (icta)law0.b;
                ibtw ibtw1 = (ibtw)law0.a;
                ibnx.b(object0);
                ibvd0 = ibvd1;
                ibtw0 = ibtw1;
                icta0 = icta1;
                try {
                label_35:
                    if(ibuz0.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object object2 = ibvd0.a;
                    law0.a = icta0;
                    law0.b = ibvd0;
                    law0.c = lcc0;
                    law0.g = null;
                    law0.h = null;
                    law0.f = 2;
                    object3 = ibtw0.a(object2, law0);
                }
                catch(Throwable throwable0) {
                    icta2 = icta0;
                    break;
                }
                if(object3 == object1) {
                    return object1;
                }
                icta3 = icta0;
                object0 = object3;
                ibvd2 = ibvd0;
                goto label_58;
            }
            case 2: {
                lcc0 = (lcc)law0.c;
                ibvd2 = (ibvd)law0.b;
                icta3 = (icta)law0.a;
                try {
                    ibnx.b(object0);
                label_58:
                    if(ibuq.m(object0, ibvd2.a)) {
                        icta2 = icta3;
                    }
                    else {
                        law0.a = icta3;
                        law0.b = ibvd2;
                        law0.c = object0;
                        law0.f = 3;
                        if(lcc0.k(object0, false, law0) != object1) {
                            icta2 = icta3;
                            ibvd2.a = object0;
                            object5 = ibvd2.a;
                            goto label_84;
                        }
                        return object1;
                    }
                    object5 = ibvd2.a;
                    goto label_84;
                }
                catch(Throwable throwable0) {
                    icta2 = icta3;
                    break;
                }
                try {
                    icta2 = icta3;
                    ibvd2.a = object0;
                    object5 = ibvd2.a;
                    goto label_84;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 3: {
                Object object4 = law0.c;
                ibvd2 = (ibvd)law0.b;
                icta2 = (icta)law0.a;
                try {
                    ibnx.b(object0);
                    ibvd2.a = object4;
                    object5 = ibvd2.a;
                    goto label_84;
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
    label_84:
        icta2.d();
        return object5;
    }
}

