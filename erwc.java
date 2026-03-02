public final class erwc implements icih {
    final icih a;
    final erwq b;
    final String c;

    public erwc(icih icih0, erwq erwq0, String s) {
        this.a = icih0;
        this.b = erwq0;
        this.c = s;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object8;
        erwq erwq1;
        Object object5;
        Object object3;
        erwb erwb0;
        if((ibrl0 instanceof erwb)) {
            erwb0 = (erwb)ibrl0;
            int v = erwb0.b;
            if((v & 0x80000000) == 0) {
                erwb0 = new erwb(this, ibrl0);
            }
            else {
                erwb0.b = v - 0x80000000;
            }
        }
        else {
            erwb0 = new erwb(this, ibrl0);
        }
        Object object1 = erwb0.a;
        Object object2 = ibrx.a;
        switch(erwb0.b) {
            case 0: {
                ibnx.b(object1);
                object3 = this.a;
                erwq erwq0 = this.b;
                erws erws0 = erwq0.c(((ertz)object0), this.c);
                erwb0.c = object3;
                erwb0.e = erwq0;
                erwb0.b = 1;
                Object object4 = erwq0.g(erws0, this.c, erwb0);
                if(object4 != object2) {
                    object5 = object4;
                    erwq1 = erwq0;
                    goto label_30;
                }
                return object2;
            }
            case 1: {
                erwq1 = erwb0.e;
                Object object6 = erwb0.c;
                ibnx.b(object1);
                object5 = object1;
                object3 = object6;
            label_30:
                erwb0.c = object3;
                erwb0.e = null;
                erwb0.b = 2;
                Object object7 = erwq1.f(((erws)object5), this.c, erwb0);
                if(object7 != object2) {
                    object1 = object7;
                    object8 = object3;
                    erwb0.c = null;
                    erwb0.b = 3;
                    return ((icih)object8).a(object1, erwb0) != object2 ? ibom.a : object2;
                }
                return object2;
            }
            case 2: {
                object8 = erwb0.c;
                ibnx.b(object1);
                erwb0.c = null;
                erwb0.b = 3;
                return ((icih)object8).a(object1, erwb0) != object2 ? ibom.a : object2;
            }
            case 3: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

