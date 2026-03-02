public final class eruv {
    private final ibnf a;
    private final ibnf b;

    public eruv(ibnf ibnf0, ibnf ibnf1) {
        ibuq.f(ibnf1, "deviceStateProvider");
        super();
        this.a = ibnf0;
        this.b = ibnf1;
    }

    public final Object a(String s, ibrl ibrl0) {
        Object object3;
        Object object2;
        eruu eruu0;
        if((ibrl0 instanceof eruu)) {
            eruu0 = (eruu)ibrl0;
            int v = eruu0.c;
            if((v & 0x80000000) == 0) {
                eruu0 = new eruu(this, ibrl0);
            }
            else {
                eruu0.c = v - 0x80000000;
            }
        }
        else {
            eruu0 = new eruu(this, ibrl0);
        }
        Object object0 = eruu0.a;
        Object object1 = ibrx.a;
        switch(eruu0.c) {
            case 0: {
                ibnx.b(object0);
                ersh ersh0 = (ersh)this.b.get();
                eruu0.d = s;
                eruu0.c = 1;
                object2 = ersh0.b();
                if(object2 == object1) {
                    return object1;
                }
                goto label_23;
            }
            case 1: {
                s = eruu0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_23:
                Throwable throwable0 = ibnw.a(object2);
                if(throwable0 != null) {
                    return ibnx.a(throwable0);
                }
                if(((Boolean)object2).booleanValue()) {
                    return Boolean.valueOf(true);
                }
                if(ibzk.D(s)) {
                    return ibnx.a(new IllegalArgumentException("Account Name cannot be null or blank."));
                }
                ersf ersf0 = ((ersg)this.a).a();
                eruu0.d = null;
                eruu0.c = 2;
                object3 = ersf0.a(s, gqka.a.a, eruu0);
                if(object3 == object1) {
                    return object1;
                }
                return ibnw.b(object3) ? Boolean.valueOf(((boolean)(((Boolean)object3).booleanValue() ^ 1))) : object3;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        object3 = ((ibnw)object0).a;
        return ibnw.b(object3) ? Boolean.valueOf(((boolean)(((Boolean)object3).booleanValue() ^ 1))) : object3;
    }
}

