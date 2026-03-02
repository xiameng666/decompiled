final class itc {
    public final int a;
    public float b;
    private final ibtw c;

    public itc(int v, ibtw ibtw0) {
        this.a = v;
        this.c = ibtw0;
    }

    public final int a(int v) {
        return ibwt.j(v - ibvr.c(this.b), 0, this.a);
    }

    public final Object b(float f, ibrl ibrl0) {
        itb itb0;
        if((ibrl0 instanceof itb)) {
            itb0 = (itb)ibrl0;
            int v = itb0.c;
            if((v & 0x80000000) == 0) {
                itb0 = new itb(this, ibrl0);
            }
            else {
                itb0.c = v - 0x80000000;
            }
        }
        else {
            itb0 = new itb(this, ibrl0);
        }
        Object object0 = itb0.a;
        Object object1 = ibrx.a;
        switch(itb0.c) {
            case 0: {
                ibnx.b(object0);
                itb0.c = 1;
                object0 = this.c.a(new Float(f), itb0);
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
        float f1 = ((Number)object0).floatValue();
        this.b += f1;
        return ibom.a;
    }

    public final Object c(float f, ibrl ibrl0) {
        Object object0 = this.b(f - this.b, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

