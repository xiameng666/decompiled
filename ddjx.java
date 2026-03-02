import android.accounts.Account;

public final class ddjx implements icih {
    final icih a;
    final dcmf b;
    final ddki c;

    public ddjx(icih icih0, dcmf dcmf0, ddki ddki0) {
        this.a = icih0;
        this.b = dcmf0;
        this.c = ddki0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        boolean z1;
        Boolean boolean0;
        Object object7;
        Object object6;
        aztb aztb1;
        Object object5;
        Object object4;
        ddjw ddjw0;
        if((ibrl0 instanceof ddjw)) {
            ddjw0 = (ddjw)ibrl0;
            int v = ddjw0.b;
            if((v & 0x80000000) == 0) {
                ddjw0 = new ddjw(this, ibrl0);
            }
            else {
                ddjw0.b = v - 0x80000000;
            }
        }
        else {
            ddjw0 = new ddjw(this, ibrl0);
        }
        Object object1 = ddjw0.a;
        Object object2 = ibrx.a;
        boolean z = false;
        switch(ddjw0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                ibom ibom0 = (ibom)object0;
                if(hvrc.i()) {
                    evql evql0 = this.b.e();
                    ddjw0.c = icih0;
                    ddjw0.b = 1;
                    Object object3 = dcwp.a(evql0, ddjw0);
                    if(object3 == object2) {
                        return object2;
                    }
                    object1 = object3;
                    object4 = icih0;
                    goto label_41;
                }
                else {
                    try {
                        evql evql1 = this.b.e();
                        ddjw0.c = icih0;
                        ddjw0.b = 3;
                        object5 = ictn.b(evql1, ddjw0);
                    }
                    catch(aztb aztb0) {
                        aztb1 = aztb0;
                        object6 = icih0;
                        goto label_87;
                    }
                    if(object5 == object2) {
                        return object2;
                    }
                    object1 = object5;
                    object7 = icih0;
                    goto label_61;
                }
                ddjw0.c = null;
                ddjw0.b = 5;
                return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                object4 = ddjw0.c;
                ibnx.b(object1);
            label_41:
                if(((Account)object1) == null) {
                    object6 = object4;
                }
                else {
                    evql evql2 = this.c.d(((Account)object1));
                    ddjw0.c = object4;
                    ddjw0.b = 2;
                    object1 = dcwp.b(evql2, Boolean.valueOf(false), ddjw0);
                    if(object1 == object2) {
                        return object2;
                    }
                    object6 = object4;
                    goto label_53;
                }
                boolean0 = Boolean.valueOf(z);
                ddjw0.c = null;
                ddjw0.b = 5;
                return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
            }
            case 2: {
                object6 = ddjw0.c;
                ibnx.b(object1);
            label_53:
                if(((Boolean)object1) == null) {
                    object6 = object6;
                }
                else {
                    z = ((Boolean)object1).booleanValue();
                }
                boolean0 = Boolean.valueOf(z);
                ddjw0.c = null;
                ddjw0.b = 5;
                return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
            }
            case 3: {
                try {
                    object7 = ddjw0.c;
                    ibnx.b(object1);
                label_61:
                    if(((Account)object1) == null) {
                        goto label_74;
                    }
                    else {
                        evql evql3 = this.c.d(((Account)object1));
                        ddjw0.c = object7;
                        ddjw0.b = 4;
                        object1 = ictn.b(evql3, ddjw0);
                        goto label_71;
                    }
                    boolean0 = Boolean.valueOf(z1);
                    ddjw0.c = null;
                    ddjw0.b = 5;
                    return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
                }
                catch(aztb aztb2) {
                    aztb1 = aztb2;
                    object6 = object7;
                    goto label_87;
                }
            label_71:
                if(object1 == object2) {
                    return object2;
                }
                object6 = object7;
                goto label_79;
                try {
                label_74:
                    object6 = object7;
                    z1 = false;
                    boolean0 = Boolean.valueOf(z1);
                    ddjw0.c = null;
                    ddjw0.b = 5;
                    return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
                label_77:
                    object6 = ddjw0.c;
                    ibnx.b(object1);
                label_79:
                    if(((Boolean)object1) == null) {
                        object6 = object6;
                        z1 = false;
                    }
                    else {
                        z1 = ((Boolean)object1).booleanValue();
                    }
                    boolean0 = Boolean.valueOf(z1);
                    ddjw0.c = null;
                    ddjw0.b = 5;
                    return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
                }
                catch(aztb aztb1) {
                }
                goto label_87;
            }
            case 4: {
                goto label_77;
            label_87:
                dcvz.a.b().f(aztb1).p("could not obtain consent information", new Object[0]);
                boolean0 = Boolean.valueOf(false);
                ddjw0.c = null;
                ddjw0.b = 5;
                return ((icih)object6).a(boolean0, ddjw0) == object2 ? object2 : ibom.a;
            }
            case 5: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

