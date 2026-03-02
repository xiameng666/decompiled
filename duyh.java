final class duyh implements ibtw {
    final duyj a;
    final ibvd b;

    public duyh(duyj duyj0, ibvd ibvd0) {
        this.a = duyj0;
        this.b = ibvd0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        duyj duyj0 = this.a;
        duyf duyf0 = new duyf(duyj0, this.b);
        ((goz)object0).M(5004770);
        boolean z = ((goz)object0).Z(duyj0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new duyg(duyj0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        duyj0.y(null, duyf0, ((ibth)(((ibwx)object2))), ((goz)object0), 0);
        return ibom.a;
    }
}

