final class bdgv implements ibtw {
    final bdho a;
    final gui b;
    final gui c;
    final gui d;

    public bdgv(bdho bdho0, gui gui0, gui gui1, gui gui2) {
        this.a = bdho0;
        this.b = gui0;
        this.c = gui1;
        this.d = gui2;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        boolean z = ((Boolean)this.b.a()).booleanValue();
        ((goz)object0).M(5004770);
        bdho bdho0 = this.a;
        boolean z1 = ((goz)object0).Z(bdho0);
        Object object2 = ((goz)object0).k();
        if(z1 || object2 == gop.a) {
            object2 = new bdgs(bdho0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        bdxx.a(((ibth)object2), null, z, ((goz)object0), 0);
        bdxy bdxy0 = (bdxy)this.c.a();
        if(((Boolean)this.d.a()).booleanValue() && bdxy0 != null) {
            ((goz)object0).M(5004770);
            boolean z2 = ((goz)object0).Z(bdho0);
            Object object3 = ((goz)object0).k();
            if(z2 || object3 == gop.a) {
                object3 = new bdgt(bdho0);
                ((goz)object0).R(object3);
            }
            ((goz)object0).A();
            ((goz)object0).M(5004770);
            boolean z3 = ((goz)object0).Z(bdho0);
            Object object4 = ((goz)object0).k();
            if(z3 || object4 == gop.a) {
                object4 = new bdgu(bdho0);
                ((goz)object0).R(object4);
            }
            ((goz)object0).A();
            bdxg.c(((ibth)object3), ((ibth)object4), bdxy0, null, ((goz)object0), 0);
        }
        return ibom.a;
    }
}

