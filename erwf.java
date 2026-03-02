final class erwf implements icih {
    final erwq a;

    public erwf(erwq erwq0) {
        this.a = erwq0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        erxo erxo0;
        erwq erwq0 = this.a;
        erwq0.j.b(((erws)object0).e);
        boolean z = ((erws)object0).a;
        erwq0.i.b(Boolean.valueOf(z));
        if(!z) {
            erwq0.g.b(((erws)object0).b);
        }
        erwq0.h.b(Boolean.valueOf(((erws)object0).d));
        ervi ervi0 = ((erws)object0).c;
        if(ervi0 == null) {
            icnl icnl1 = erwq0.r;
            do {
                Object object2 = icnl1.b();
            }
            while(!icnl1.h(object2, erxm.a(((erxm)object2), null, null, 103)));
        label_22:
            if(!z && ((erws)object0).f) {
                if(!erwq0.q.a()) {
                    return ibom.a;
                }
                icnl icnl2 = erwq0.r;
                do {
                    Object object3 = icnl2.b();
                }
                while(!icnl2.h(object3, erxm.a(((erxm)object3), null, new clwn(erwq0.p.b(0x7F152F31)), 0x5F)));  // string:spatula_settings_parent_warning "Only your parent can turn this off"
                return ibom.a;
            }
        }
        else {
            icnl icnl0 = erwq0.r;
            do {
                Object object1 = icnl0.b();
                if(ervi0.e) {
                    clxk clxk0 = new clxk(ervi0.c, ervi0.d);
                    erxo0 = new erxo(new erxq(ervi0.a, ervi0.b, ervi0.f, clxk0));
                }
                else {
                    clxk clxk1 = new clxk(ervi0.c, ervi0.d);
                    erxo0 = new erxn(new clyi(ervi0.a, ervi0.b, clxk1));
                }
            }
            while(!icnl0.h(object1, erxm.a(((erxm)object1), erxo0, null, 103)));
            goto label_22;
        }
        icnl icnl3 = erwq0.r;
        do {
            Object object4 = icnl3.b();
        }
        while(!icnl3.h(object4, erxm.a(((erxm)object4), null, null, 0x5F)));
        return ibom.a;
    }
}

