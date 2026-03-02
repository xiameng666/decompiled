public final class dcwp {
    public static final Object a(evql evql0, ibrl ibrl0) {
        Object object2;
        dcwm dcwm0;
        if((ibrl0 instanceof dcwm)) {
            dcwm0 = (dcwm)ibrl0;
            int v = dcwm0.b;
            if((v & 0x80000000) == 0) {
                dcwm0 = new dcwm(ibrl0);
            }
            else {
                dcwm0.b = v - 0x80000000;
            }
        }
        else {
            dcwm0 = new dcwm(ibrl0);
        }
        Object object0 = dcwm0.a;
        Object object1 = ibrx.a;
        switch(dcwm0.b) {
            case 0: {
                ibnx.b(object0);
                if(hvrc.i()) {
                    dcwm0.c = (evqu)evql0;
                    dcwm0.b = 1;
                    object2 = dcwp.c(evql0, dcwm0);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_28;
                }
                try {
                    dcwm0.b = 2;
                    Object object3 = ictn.b(evql0, dcwm0);
                    return object3 == object1 ? object1 : object3;
                }
                catch(aztb aztb0) {
                    goto label_37;
                }
                return object1;
            }
            case 1: {
                evql0 = dcwm0.c;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_28:
                Throwable throwable0 = ibnw.a(object2);
                if(throwable0 != null) {
                    if(dcwk.a(throwable0) == 35500) {
                        return null;
                    }
                    dcvz.a.e().f(throwable0).h("unexpected error awaiting task %s", evql0);
                }
                return (object2 instanceof ibnv) ? null : object2;
            }
            case 2: {
                try {
                    ibnx.b(object0);
                    return object0;
                }
                catch(aztb aztb0) {
                label_37:
                    if(aztb0.b() == 35500) {
                        return null;
                    }
                    dcvz.a.e().f(aztb0).p("unexpected error awaiting task", new Object[0]);
                    return null;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object b(evql evql0, Object object0, ibrl ibrl0) {
        Object object3;
        dcwn dcwn0;
        if((ibrl0 instanceof dcwn)) {
            dcwn0 = (dcwn)ibrl0;
            int v = dcwn0.d;
            if((v & 0x80000000) == 0) {
                dcwn0 = new dcwn(ibrl0);
            }
            else {
                dcwn0.d = v - 0x80000000;
            }
        }
        else {
            dcwn0 = new dcwn(ibrl0);
        }
        Object object1 = dcwn0.c;
        Object object2 = ibrx.a;
        switch(dcwn0.d) {
            case 0: {
                ibnx.b(object1);
                if(hvrc.i()) {
                    dcwn0.a = evql0;
                    dcwn0.b = object0;
                    dcwn0.d = 1;
                    object3 = dcwp.c(evql0, dcwn0);
                    if(object3 == object2) {
                        return object2;
                    }
                    goto label_31;
                }
                try {
                    dcwn0.a = object0;
                    dcwn0.d = 2;
                    Object object4 = ictn.b(evql0, dcwn0);
                    return object4 == object2 ? object2 : object4;
                }
                catch(aztb aztb0) {
                    dcvz.a.e().f(aztb0).p("unexpected error awaiting task", new Object[0]);
                    return object0;
                }
                return object2;
            }
            case 1: {
                object0 = dcwn0.b;
                evql0 = (evql)dcwn0.a;
                ibnx.b(object1);
                object3 = ((ibnw)object1).a;
            label_31:
                Throwable throwable0 = ibnw.a(object3);
                if(throwable0 != null) {
                    if(dcwk.a(throwable0) != 35500) {
                        dcvz.a.e().f(throwable0).h("unexpected error awaiting task %s", evql0);
                        return (object3 instanceof ibnv) ? object0 : object3;
                    }
                    return object0;
                }
                return (object3 instanceof ibnv) ? object0 : object3;
            }
            case 2: {
                try {
                    object0 = dcwn0.a;
                    ibnx.b(object1);
                    return object1;
                }
                catch(aztb aztb0) {
                    dcvz.a.e().f(aztb0).p("unexpected error awaiting task", new Object[0]);
                    return object0;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static final Object c(evql evql0, ibrl ibrl0) {
        dcwo dcwo0;
        if((ibrl0 instanceof dcwo)) {
            dcwo0 = (dcwo)ibrl0;
            int v = dcwo0.b;
            if((v & 0x80000000) == 0) {
                dcwo0 = new dcwo(ibrl0);
            }
            else {
                dcwo0.b = v - 0x80000000;
            }
        }
        else {
            dcwo0 = new dcwo(ibrl0);
        }
        Object object0 = dcwo0.a;
        Object object1 = ibrx.a;
        switch(dcwo0.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    dcwo0.b = 1;
                    Object object2 = ictn.b(evql0, dcwo0);
                    return object2 == object1 ? object1 : object2;
                label_19:
                    ibnx.b(object0);
                    return object0;
                }
                catch(Throwable throwable0) {
                    return ibnx.a(throwable0);
                }
            }
            case 1: {
                goto label_19;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

