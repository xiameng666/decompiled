public class aqqh {
    public final aqqh a(ibts ibts0) {
        if((this instanceof aqqe)) {
            return aqqe.a;
        }
        if((this instanceof aqqd)) {
            return new aqqd(((aqqd)this).a);
        }
        if((this instanceof aqqf)) {
            return new aqqf(ibts0.a(((aqqf)this).a));
        }
        throw new ibnq();
    }

    public final Object b() {
        return (this instanceof aqqf) ? ((aqqf)this).a : null;
    }

    public final Object c(ibtw ibtw0, ibrl ibrl0) {
        aqqg aqqg0;
        if((ibrl0 instanceof aqqg)) {
            aqqg0 = (aqqg)ibrl0;
            int v = aqqg0.c;
            if((v & 0x80000000) == 0) {
                aqqg0 = new aqqg(this, ibrl0);
            }
            else {
                aqqg0.c = v - 0x80000000;
            }
        }
        else {
            aqqg0 = new aqqg(this, ibrl0);
        }
        Object object0 = aqqg0.a;
        Object object1 = ibrx.a;
        switch(aqqg0.c) {
            case 0: {
                ibnx.b(object0);
                if((this instanceof aqqe)) {
                    return aqqe.a;
                }
                if((this instanceof aqqd)) {
                    return new aqqd(((aqqd)this).a);
                }
                if(!(this instanceof aqqf)) {
                    throw new ibnq();
                }
                aqqg0.c = 1;
                object0 = ibtw0.a(((aqqf)this).a, aqqg0);
                return object0 != object1 ? new aqqf(object0) : object1;
            }
            case 1: {
                ibnx.b(object0);
                return new aqqf(object0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

