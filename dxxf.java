final class dxxf implements ibtw {
    final dxxk a;
    final igxm b;

    public dxxf(dxxk dxxk0, igxm igxm0) {
        this.a = dxxk0;
        this.b = igxm0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        dxvr dxvr0 = dxvr.a;
        ((goz)object0).M(5004770);
        dxxk dxxk0 = this.a;
        boolean z = ((goz)object0).Z(dxxk0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dxxc(dxxk0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ((goz)object0).M(-1633490746);
        int v = ((goz)object0).Z(dxxk0);
        igxm igxm0 = this.b;
        int v1 = v | ((goz)object0).Z(igxm0);
        Object object3 = ((goz)object0).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new dxxd(dxxk0, igxm0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        dxvr0.a(((ibth)object2), ((ibth)object3), ((goz)object0), 0x180);
        return ibom.a;
    }
}

