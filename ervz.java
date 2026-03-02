public final class ervz implements icih {
    final icih a;
    final erwq b;
    final String c;
    final Boolean d;

    public ervz(icih icih0, erwq erwq0, String s, Boolean boolean0) {
        this.a = icih0;
        this.b = erwq0;
        this.c = s;
        this.d = boolean0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ervy ervy0;
        if((ibrl0 instanceof ervy)) {
            ervy0 = (ervy)ibrl0;
            int v = ervy0.b;
            if((v & 0x80000000) == 0) {
                ervy0 = new ervy(this, ibrl0);
            }
            else {
                ervy0.b = v - 0x80000000;
            }
        }
        else {
            ervy0 = new ervy(this, ibrl0);
        }
        Object object1 = ervy0.a;
        Object object2 = ibrx.a;
        switch(ervy0.b) {
            case 0: {
                ibnx.b(object1);
                erws erws0 = this.b.c(((ertz)object0), this.c);
                Boolean boolean0 = Boolean.valueOf(true);
                erws erws1 = erws.a(erws0, false, null, this.b.b(this.d), ibuq.m(erws0.b, boolean0), null, null, ibuq.m(this.d, boolean0), 103);
                ervy0.b = 1;
                return this.a.a(erws1, ervy0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

