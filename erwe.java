final class erwe extends ibsl implements ibtw {
    int a;
    final erwq b;
    final String c;
    private Object d;

    public erwe(erwq erwq0, String s, ibrl ibrl0) {
        this.b = erwq0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((erwe)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new erwe(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Boolean boolean0;
        icih icih0;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih0 = (icih)this.d;
                erwq erwq0 = this.b;
                if(erwq0.q.a()) {
                    String s1 = this.c;
                    if(s1 == null) {
                        erws erws0 = new erws(erwq0.a(), null, false, 0xF7);
                        this.a = 4;
                        if(icih0.a(erws0, this) == object1) {
                            return object1;
                        }
                    }
                    else {
                        erwd erwd0 = new erwd(erwq0.a.a(s1), erwq0, s1);
                        this.a = 5;
                        if(icir.c(icih0, erwd0, this) == object1) {
                            return object1;
                        }
                    }
                }
                else {
                    String s = this.c;
                    if(s == null) {
                        boolean0 = null;
                        goto label_35;
                    }
                    else {
                        eruv eruv0 = (eruv)erwq0.b.get();
                        this.d = icih0;
                        this.a = 1;
                        object2 = eruv0.a(s, this);
                        if(object2 == object1) {
                            return object1;
                        }
                        goto label_31;
                    }
                }
                break;
            }
            case 1: {
                icih0 = (icih)this.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_31:
                Boolean boolean1 = Boolean.valueOf(false);
                if((object2 instanceof ibnv)) {
                    object2 = boolean1;
                }
                boolean0 = (Boolean)object2;
            label_35:
                if(hykh.a.b().d()) {
                    String s2 = this.c;
                    if(s2 == null) {
                        goto label_43;
                    }
                    else {
                        erwa erwa0 = new erwa(this.b.a.a(s2), this.b, s2, boolean0);
                        this.d = null;
                        this.a = 2;
                        if(icir.c(icih0, erwa0, this) == object1) {
                            return object1;
                        }
                    }
                }
                else {
                label_43:
                    ervi ervi0 = this.b.b(boolean0);
                    this.d = null;
                    this.a = 3;
                    if(icih0.a(new erws(ervi0, null, ibuq.m(boolean0, Boolean.valueOf(true)), 103), this) == object1) {
                        return object1;
                    }
                }
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

