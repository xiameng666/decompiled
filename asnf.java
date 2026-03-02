import android.accounts.Account;

public final class asnf implements icih {
    final icih a;
    final asni b;

    public asnf(icih icih0, asni asni0) {
        this.b = asni0;
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object8;
        Object object4;
        Object object3;
        asne asne0;
        if((ibrl0 instanceof asne)) {
            asne0 = (asne)ibrl0;
            int v = asne0.b;
            if((v & 0x80000000) == 0) {
                asne0 = new asne(this, ibrl0);
            }
            else {
                asne0.b = v - 0x80000000;
            }
        }
        else {
            asne0 = new asne(this, ibrl0);
        }
        Object object1 = asne0.a;
        Object object2 = ibrx.a;
        switch(asne0.b) {
            case 0: {
                ibnx.b(object1);
                object3 = this.a;
                object4 = (Account)object0;
                asne0.d = object4;
                asne0.e = object3;
                asne0.b = 1;
                if(((icih)object3).a(aqqe.a, asne0) != object2) {
                    goto label_26;
                }
                return object2;
            }
            case 1: {
                Object object5 = asne0.e;
                Object object6 = asne0.d;
                ibnx.b(object1);
                object3 = object5;
                object4 = object6;
            label_26:
                if(object4 == null) {
                    return ibom.a;
                }
                asnh asnh0 = new asnh(this.b, null);
                asne0.d = object4;
                asne0.e = object3;
                asne0.b = 2;
                Object object7 = icbd.a(this.b.b, asnh0, asne0);
                if(object7 != object2) {
                    object1 = object7;
                    object8 = object3;
                    goto label_39;
                }
                return object2;
            }
            case 2: {
                object8 = asne0.e;
                object4 = asne0.d;
                ibnx.b(object1);
            label_39:
                if(((arzs)object1) != null) {
                    aqqf aqqf0 = new aqqf(new asli(((Account)object4).name, ((arzs)object1).d, ((arzs)object1).c));
                    asne0.d = null;
                    asne0.e = null;
                    asne0.b = 3;
                    return ((icih)object8).a(aqqf0, asne0) != object2 ? ibom.a : object2;
                }
                aqqd aqqd0 = new aqqd(new asna());
                asne0.d = null;
                asne0.e = null;
                asne0.b = 4;
                return ((icih)object8).a(aqqd0, asne0) != object2 ? ibom.a : object2;
            }
            case 3: 
            case 4: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

