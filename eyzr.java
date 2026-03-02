import java.util.List;

public final class eyzr extends lsb {
    public final eyec a;
    private final exyg b;
    private final exki c;

    public eyzr(exyg exyg0, exki exki0, eyec eyec0) {
        ibuq.f(exki0, "rangingCapabilityRepository");
        super();
        this.b = exyg0;
        this.c = exki0;
        this.a = eyec0;
    }

    public final Object a(ibrl ibrl0) {
        exwv exwv1;
        eyzp eyzp0;
        if((ibrl0 instanceof eyzp)) {
            eyzp0 = (eyzp)ibrl0;
            int v = eyzp0.c;
            if((v & 0x80000000) == 0) {
                eyzp0 = new eyzp(this, ibrl0);
            }
            else {
                eyzp0.c = v - 0x80000000;
            }
        }
        else {
            eyzp0 = new eyzp(this, ibrl0);
        }
        Object object0 = eyzp0.a;
        Object object1 = ibrx.a;
        switch(eyzp0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.b.p();
                eyzp0.c = 1;
                object0 = icll.a(icig0, eyzp0);
                if(object0 != object1) {
                    goto label_20;
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                exwv exwv0 = (exwv)ibpo.R(((List)object0));
                eyzp0.d = exwv0;
                eyzp0.c = 2;
                Object object2 = this.b(exwv0, eyzp0);
                if(object2 != object1) {
                    exwv1 = exwv0;
                    object0 = object2;
                    break;
                }
                return object1;
            }
            case 2: {
                exwv1 = eyzp0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Boolean)object0).booleanValue()) {
            exjx exjx0 = exjx.f;
            if(exwv1.k.get(exjx0) == exjy.b) {
                ibuq.f(exjx0, "rangingMethod");
                return this.c.b(exjx0) == exoh.b ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(false);
    }

    public final Object b(exwv exwv0, ibrl ibrl0) {
        eyzq eyzq0;
        if((ibrl0 instanceof eyzq)) {
            eyzq0 = (eyzq)ibrl0;
            int v = eyzq0.c;
            if((v & 0x80000000) == 0) {
                eyzq0 = new eyzq(this, ibrl0);
            }
            else {
                eyzq0.c = v - 0x80000000;
            }
        }
        else {
            eyzq0 = new eyzq(this, ibrl0);
        }
        Object object0 = eyzq0.a;
        Object object1 = ibrx.a;
        switch(eyzq0.c) {
            case 0: {
                ibnx.b(object0);
                iccs iccs0 = this.b.o(exwv0);
                eyzq0.c = 1;
                object0 = iccs0.n(eyzq0);
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
        Boolean boolean0 = (Boolean)((exxc)object0).b.get(exmq.b);
        return boolean0 == null ? Boolean.valueOf(false) : Boolean.valueOf(boolean0.booleanValue());
    }
}

