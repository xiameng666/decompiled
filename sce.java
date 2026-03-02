public final class sce {
    public static final Object a(sca sca0, ibrl ibrl0) {
        ibvd ibvd2;
        ibvd ibvd0;
        scb scb0;
        if((ibrl0 instanceof scb)) {
            scb0 = (scb)ibrl0;
            int v = scb0.b;
            if((v & 0x80000000) == 0) {
                scb0 = new scb(ibrl0);
            }
            else {
                scb0.b = v - 0x80000000;
            }
        }
        else {
            scb0 = new scb(ibrl0);
        }
        Object object0 = scb0.a;
        Object object1 = ibrx.a;
        switch(scb0.b) {
            case 0: {
                ibnx.b(object0);
                ibvd0 = new ibvd();
                ibvd ibvd1 = new ibvd();
                scb0.c = ibvd0;
                scb0.d = ibvd1;
                scb0.b = 1;
                icbk icbk0 = new icbk(ibsc.c(scb0), 1);
                icbk0.z();
                sca0.a(new scc(ibvd1, icbk0), new scd(ibvd0, icbk0));
                Object object2 = icbk0.k();
                if(object2 == object1) {
                    ibsi.b(scb0);
                }
                if(object2 == object1) {
                    return object1;
                }
                ibvd2 = ibvd1;
                goto label_31;
            }
            case 1: {
                ibvd2 = scb0.d;
                ibvd0 = scb0.c;
                ibnx.b(object0);
            label_31:
                Object object3 = ibvd0.a;
                if(object3 != null) {
                    scb0.c = null;
                    scb0.d = null;
                    scb0.b = 2;
                    object0 = sbh.a.d(((rzz)object3), scb0);
                    if(object0 != object1) {
                        throw (Throwable)object0;
                    }
                    return object1;
                }
                Object object4 = ibvd2.a;
                if(object4 != null) {
                    return object4;
                }
                throw new IllegalStateException("Required value was null.");
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        throw (Throwable)object0;
    }
}

