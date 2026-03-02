public final class carl {
    public final lap a;

    public carl(lap lap0) {
        ibuq.f(lap0, "onboardingInfoStore");
        super();
        this.a = lap0;
    }

    public final Object a(ibrl ibrl0) {
        carj carj0;
        if((ibrl0 instanceof carj)) {
            carj0 = (carj)ibrl0;
            int v = carj0.c;
            if((v & 0x80000000) == 0) {
                carj0 = new carj(this, ibrl0);
            }
            else {
                carj0.c = v - 0x80000000;
            }
        }
        else {
            carj0 = new carj(this, ibrl0);
        }
        Object object0 = carj0.a;
        Object object1 = ibrx.a;
        switch(carj0.c) {
            case 0: {
                ibnx.b(object0);
                icig icig0 = this.a.b();
                carj0.c = 1;
                object0 = icll.c(icig0, carj0);
                if(object0 != object1) {
                    return ((carq)object0) == null ? carr.a(((ProtoLiteMessage)carq.a).v_newBuilder()).a() : ((carq)object0);
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return ((carq)object0) == null ? carr.a(((ProtoLiteMessage)carq.a).v_newBuilder()).a() : ((carq)object0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

