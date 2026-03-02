public final class dcvp implements icih {
    final icih a;
    final ibtw b;
    final ibtx c;

    public dcvp(icih icih0, ibtw ibtw0, ibtx ibtx0) {
        this.b = ibtw0;
        this.c = ibtx0;
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        aztb aztb2;
        Object object9;
        Throwable throwable1;
        Throwable throwable0;
        Object object7;
        icih icih4;
        icih icih3;
        Object object5;
        icih icih2;
        Object object4;
        icih icih1;
        icih icih0;
        dcvo dcvo0;
        if((ibrl0 instanceof dcvo)) {
            dcvo0 = (dcvo)ibrl0;
            int v = dcvo0.b;
            if((v & 0x80000000) == 0) {
                dcvo0 = new dcvo(this, ibrl0);
            }
            else {
                dcvo0.b = v - 0x80000000;
            }
        }
        else {
            dcvo0 = new dcvo(this, ibrl0);
        }
        Object object1 = dcvo0.a;
        Object object2 = ibrx.a;
        switch(dcvo0.b) {
            case 0: {
                ibnx.b(object1);
                icih0 = this.a;
                if(hvrc.i()) {
                    dcvo0.d = icih0;
                    dcvo0.b = 1;
                    Object object3 = this.b.a(object0, dcvo0);
                    if(object3 == object2) {
                        return object2;
                    }
                    object1 = object3;
                    icih1 = icih0;
                    goto label_37;
                }
                else {
                    try {
                        dcvo0.d = icih0;
                        dcvo0.e = icih0;
                        dcvo0.b = 5;
                        object4 = this.b.a(object0, dcvo0);
                    }
                    catch(aztb aztb0) {
                        icih2 = icih0;
                        goto label_107;
                    }
                    if(object4 == object2) {
                        return object2;
                    }
                    object5 = object4;
                    icih3 = icih0;
                    goto label_81;
                }
                break;
            }
            case 1: {
                icih1 = (icih)dcvo0.d;
                ibnx.b(object1);
            label_37:
                dcvo0.d = icih1;
                dcvo0.b = 2;
                Object object6 = dcwp.c(((evql)object1), dcvo0);
                if(object6 == object2) {
                    return object2;
                }
                icih4 = icih1;
                object7 = object6;
                goto label_49;
            }
            case 2: {
                icih1 = (icih)dcvo0.d;
                ibnx.b(object1);
                icih4 = icih1;
                object7 = ((ibnw)object1).a;
            label_49:
                if(ibnw.b(object7)) {
                    dcvo0.d = icih4;
                    dcvo0.e = object7;
                    dcvo0.b = 3;
                    if(icih4.a(object7, dcvo0) == object2) {
                        return object2;
                    }
                }
                goto label_58;
            }
            case 3: {
                object7 = dcvo0.e;
                icih4 = (icih)dcvo0.d;
                ibnx.b(object1);
            label_58:
                throwable0 = ibnw.a(object7);
                if(throwable0 != null) {
                    if(!(throwable0 instanceof Exception)) {
                        dcvz.a.e().f(throwable0).p("unexpected exception from task", new Object[0]);
                        return ibom.a;
                    }
                    dcvo0.d = object7;
                    dcvo0.e = throwable0;
                    dcvo0.b = 4;
                    Object object8 = this.c.a(icih4, throwable0, dcvo0);
                    if(object8 == object2) {
                        return object2;
                    }
                    object1 = object8;
                    throwable1 = throwable0;
                    goto label_71;
                }
                break;
            }
            case 4: {
                throwable1 = (Throwable)dcvo0.e;
                ibnx.b(object1);
            label_71:
                if(!((Boolean)object1).booleanValue()) {
                    throwable0 = throwable1;
                    dcvz.a.e().f(throwable0).p("unexpected exception from task", new Object[0]);
                    return ibom.a;
                }
                break;
            }
            case 5: {
                icih icih5 = (icih)dcvo0.e;
                icih2 = (icih)dcvo0.d;
                try {
                    ibnx.b(object1);
                    icih0 = icih5;
                    icih3 = icih2;
                    object5 = object1;
                }
                catch(aztb aztb0) {
                    goto label_107;
                }
                try {
                label_81:
                    dcvo0.d = icih3;
                    dcvo0.e = icih0;
                    dcvo0.b = 6;
                    object9 = ictn.b(((evql)object5), dcvo0);
                    if(object9 != object2) {
                        goto label_96;
                    }
                    return object2;
                }
                catch(aztb aztb1) {
                    goto label_105;
                }
                goto label_96;
            }
            case 6: {
                icih icih6 = (icih)dcvo0.e;
                icih2 = (icih)dcvo0.d;
                try {
                    ibnx.b(object1);
                    icih0 = icih6;
                    icih3 = icih2;
                    object9 = object1;
                }
                catch(aztb aztb0) {
                    goto label_107;
                }
                try {
                label_96:
                    dcvo0.d = icih3;
                    dcvo0.e = null;
                    dcvo0.b = 7;
                    if(icih0.a(object9, dcvo0) == object2) {
                        return object2;
                    }
                    break;
                }
                catch(aztb aztb1) {
                    goto label_105;
                }
                return object2;
            }
            case 7: {
                icih3 = (icih)dcvo0.d;
                try {
                    ibnx.b(object1);
                    return ibom.a;
                }
                catch(aztb aztb1) {
                label_105:
                    icih2 = icih3;
                    aztb0 = aztb1;
                }
            label_107:
                dcvo0.d = aztb0;
                dcvo0.e = null;
                dcvo0.b = 8;
                object1 = this.c.a(icih2, aztb0, dcvo0);
                if(object1 != object2) {
                    aztb2 = aztb0;
                    goto label_117;
                }
                return object2;
            }
            case 8: {
                aztb2 = (aztb)dcvo0.d;
                ibnx.b(object1);
            label_117:
                if(!((Boolean)object1).booleanValue()) {
                    dcvz.a.e().f(aztb2).p("unexpected exception from task", new Object[0]);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }
}

