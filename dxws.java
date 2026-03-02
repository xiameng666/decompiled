final class dxws implements ibtw {
    final dxxk a;

    public dxws(dxxk dxxk0) {
        this.a = dxxk0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(5004770);
        dxxk dxxk0 = this.a;
        boolean z = ((goz)object0).Z(dxxk0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dxwr(dxxk0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        abt.a(false, ((ibth)object2), ((goz)object0), 0, 1);
        return ibom.a;
    }
}

