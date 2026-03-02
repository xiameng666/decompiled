final class dmvk implements ibtw {
    final dmwr a;

    public dmvk(dmwr dmwr0) {
        this.a = dmwr0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(5004770);
        dmwr dmwr0 = this.a;
        boolean z = ((goz)object0).Z(dmwr0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dmvj(dmwr0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fisl.a(((ibth)object2), null, false, null, null, dmzo.b, ((goz)object0), 0x180000, 62);
        return ibom.a;
    }
}

