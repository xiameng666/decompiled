import java.util.NoSuchElementException;

public final class erut implements erua {
    private final eruj a;

    public erut(eruj eruj0) {
        ibuq.f(eruj0, "spatulaSettingsDao");
        super();
        this.a = eruj0;
    }

    @Override  // erua
    public final Object a(String s, ibrl ibrl0) {
        erur erur0;
        if((ibrl0 instanceof erur)) {
            erur0 = (erur)ibrl0;
            int v = erur0.c;
            if((v & 0x80000000) == 0) {
                erur0 = new erur(this, ibrl0);
            }
            else {
                erur0.c = v - 0x80000000;
            }
        }
        else {
            erur0 = new erur(this, ibrl0);
        }
        Object object0 = erur0.a;
        Object object1 = ibrx.a;
        switch(erur0.c) {
            case 0: {
                ibnx.b(object0);
                erur0.c = 1;
                eruk eruk0 = new eruk(s);
                object0 = oqj.d(((erun)this.a).a, true, false, eruk0, erur0);
                if(object0 == object1) {
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
        return ((eruo)object0) == null ? ibnx.a(new NoSuchElementException("Record does not exist")) : Boolean.valueOf(((eruo)object0).b);
    }

    @Override  // erua
    public final Object b(String s, boolean z, ibrl ibrl0) {
        erus erus0;
        if((ibrl0 instanceof erus)) {
            erus0 = (erus)ibrl0;
            int v = erus0.c;
            if((v & 0x80000000) == 0) {
                erus0 = new erus(this, ibrl0);
            }
            else {
                erus0.c = v - 0x80000000;
            }
        }
        else {
            erus0 = new erus(this, ibrl0);
        }
        Object object0 = erus0.a;
        Object object1 = ibrx.a;
        switch(erus0.c) {
            case 0: {
                ibnx.b(object0);
                eruo eruo0 = new eruo(s, z);
                erus0.c = 1;
                erul erul0 = new erul(((erun)this.a), eruo0);
                return oqj.d(((erun)this.a).a, false, true, erul0, erus0) == object1 ? object1 : ibom.a;
            }
            case 1: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

