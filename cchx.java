public final class cchx {
    private final ibpf a;
    private final ictf b;

    public cchx() {
        this.a = new ibpf();
        this.b = new ictf(0x7FFFFFFF, 0x7FFFFFFF);
    }

    public final Object a(ibrl ibrl0) {
        Object object3;
        Object object2;
        cchw cchw0;
        if((ibrl0 instanceof cchw)) {
            cchw0 = (cchw)ibrl0;
            int v = cchw0.c;
            if((v & 0x80000000) == 0) {
                cchw0 = new cchw(this, ibrl0);
            }
            else {
                cchw0.c = v - 0x80000000;
            }
        }
        else {
            cchw0 = new cchw(this, ibrl0);
        }
        Object object0 = cchw0.a;
        Object object1 = ibrx.a;
        switch(cchw0.c) {
            case 0: {
                ibnx.b(object0);
                ictf ictf0 = this.b;
                cchw0.c = 1;
                if(ictf0.e() <= 0) {
                    icbk icbk0 = icbm.a(ibsc.c(cchw0));
                    try {
                        if(!ictf0.i(icbk0)) {
                            ictf0.f(icbk0);
                        }
                    }
                    catch(Throwable throwable0) {
                        icbk0.B();
                        throw throwable0;
                    }
                    object2 = icbk0.k();
                    ibrx ibrx0 = ibrx.a;
                    if(object2 == ibrx0) {
                        ibsi.b(cchw0);
                    }
                    if(object2 != ibrx0) {
                        object2 = ibom.a;
                    }
                    if(object2 != ibrx0) {
                        object2 = ibom.a;
                    }
                }
                else {
                    object2 = ibom.a;
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        synchronized(this.a) {
            object3 = this.a.removeFirst();
        }
        return object3;
    }

    public final void b(Object object0) {
        synchronized(this.a) {
            this.a.add(object0);
        }
        this.b.h();
    }
}

