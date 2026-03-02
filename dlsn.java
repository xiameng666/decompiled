final class dlsn implements ibtw {
    final dlte a;
    final doz b;

    public dlsn(dlte dlte0, doz doz0) {
        this.a = dlte0;
        this.b = doz0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        fryr fryr0 = new fryr(0x7F152048);  // string:pay_pix_education_get_started_button "Get started"
        ((goz)object0).M(5004770);
        dlte dlte0 = this.a;
        boolean z = ((goz)object0).Z(dlte0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dlsm(dlte0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ftuu.a(null, new ftuw(new ftts(fryr0, null, false, null, null, null, 0x2EC6A, null, null, ((ibth)object2), 446), null, this.b.g(), null, null, null, null, true, 0x7A), ((goz)object0), 0x40, 1);
        return ibom.a;
    }
}

