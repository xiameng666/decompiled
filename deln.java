final class deln implements ibtw {
    final gra a;

    public deln(gra gra0) {
        this.a = gra0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        String s;
        hpw hpw0;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        gra gra0 = this.a;
        if(demb.c(gra0)) {
            ((goz)object0).M(0xD0892445);
            hpw0 = ism.a(0x7F0805AA, ((goz)object0), 0);  // drawable:gs_keyboard_arrow_up_vd_theme_24
        }
        else {
            ((goz)object0).M(0xD08AA803);
            hpw0 = ism.a(0x7F0805A8, ((goz)object0), 0);  // drawable:gs_keyboard_arrow_down_vd_theme_24
        }
        ((goz)object0).A();
        if(demb.c(gra0)) {
            ((goz)object0).M(0xDD6FE840);
            s = isq.c(0x7F150789, ((goz)object0));  // string:collapse "Collapse"
        }
        else {
            ((goz)object0).M(0xDD6FEF1E);
            s = isq.c(0x7F151027, ((goz)object0));  // string:expand "Expand"
        }
        ((goz)object0).A();
        fiso.a(hpw0, s, dls.k(hfc.e, 20.0f), 0L, ((goz)object0), 392, 8);
        return ibom.a;
    }
}

