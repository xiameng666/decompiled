final class dlre implements ibtw {
    final dlrl a;
    final cvq b;

    public dlre(dlrl dlrl0, cvq cvq0) {
        this.a = dlrl0;
        this.b = cvq0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        fryr fryr0 = new fryr(0x7F152216);  // string:pay_start_a_pix "Send a Pix"
        ((goz)object0).M(5004770);
        dlrl dlrl0 = this.a;
        boolean z = ((goz)object0).Z(dlrl0);
        Object object2 = ((goz)object0).k();
        if(z || object2 == gop.a) {
            object2 = new dlrc(dlrl0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ftts ftts0 = new ftts(fryr0, null, false, null, null, null, 0x2EC6A, null, null, ((ibth)object2), 446);
        fryr fryr1 = new fryr(0x7F151C6D);  // string:pay_close_label "Close"
        ftvc ftvc0 = ftvc.a;
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).Z(dlrl0);
        Object object3 = ((goz)object0).k();
        if(z1 || object3 == gop.a) {
            object3 = new dlrd(dlrl0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        ftuu.a(null, new ftuw(ftts0, new ftts(fryr1, null, false, ftvc0, null, null, 0x2F180, null, null, ((ibth)object3), 438), this.b.c() != this.b.b(), ftvd.b, null, ftvb.c, null, true, 80), ((goz)object0), 0x40, 1);
        return ibom.a;
    }
}

