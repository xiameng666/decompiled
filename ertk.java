public final class ertk {
    private final eruv a;
    private final erth b;

    public ertk(eruv eruv0, erth erth0) {
        ibuq.f(eruv0, "spatulaSettingsSupervisionStateProvider");
        ibuq.f(erth0, "safetyCoreAvailabilityProvider");
        super();
        this.a = eruv0;
        this.b = erth0;
    }

    public final Object a(String s, ibrl ibrl0) {
        Object object3;
        Object object2;
        ertj ertj0;
        if((ibrl0 instanceof ertj)) {
            ertj0 = (ertj)ibrl0;
            int v = ertj0.c;
            if((v & 0x80000000) == 0) {
                ertj0 = new ertj(this, ibrl0);
            }
            else {
                ertj0.c = v - 0x80000000;
            }
        }
        else {
            ertj0 = new ertj(this, ibrl0);
        }
        Object object0 = ertj0.a;
        Object object1 = ibrx.a;
        switch(ertj0.c) {
            case 0: {
                ibnx.b(object0);
                if(hykh.a.b().h()) {
                    ertj0.c = 1;
                    object2 = this.a.a(s, ertj0);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_25;
                }
                ertj0.c = 2;
                object3 = this.a.a(s, ertj0);
                if(object3 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_25:
                Throwable throwable0 = ibnw.a(object2);
                if(throwable0 == null) {
                    return ((Boolean)object2).booleanValue() ? Boolean.valueOf(false) : Boolean.valueOf(this.b.a());
                }
                return ibnx.a(throwable0);
            }
            case 2: {
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibnw.b(object3) ? Boolean.valueOf(((boolean)(((Boolean)object3).booleanValue() ^ 1))) : object3;
    }
}

