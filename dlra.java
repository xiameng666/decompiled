final class dlra implements ibtw {
    final dlrl a;

    public dlra(dlrl dlrl0) {
        this.a = dlrl0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ((goz)object0).M(5004770);
        dlrl dlrl0 = this.a;
        boolean z = ((goz)object0).Z(dlrl0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dlqz(dlrl0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        fisl.a(((ibth)object2), null, false, null, null, dlqk.b, ((goz)object0), 0x180000, 62);
        return ibom.a;
    }
}

