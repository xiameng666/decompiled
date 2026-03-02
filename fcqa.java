final class fcqa implements ibtw {
    final gra a;
    final String b;

    public fcqa(gra gra0, String s) {
        this.a = gra0;
        this.b = s;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        pgi pgi0 = prg.a(((goz)object0));
        gra gra0 = this.a;
        boolean z = ((Boolean)gra0.a()).booleanValue();
        ((goz)object0).M(5004770);
        boolean z1 = ((goz)object0).X(gra0);
        Object object2 = ((goz)object0).k();
        if(z1 || object2 == gop.a) {
            object2 = new fcpy(gra0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        ((goz)object0).M(-1633490746);
        String s = this.b;
        int v = ((goz)object0).X(s) | ((goz)object0).Z(pgi0);
        Object object3 = ((goz)object0).k();
        if(v != 0 || object3 == gop.a) {
            object3 = new fcpz(s, pgi0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        pob.d(z, ((ibth)object2), ((ibts)object3), iqn.a(hfc.e, "failure_confirmation_dialog"), null, null, 0L, null, ((goz)object0), 0xC00);
        return ibom.a;
    }
}

