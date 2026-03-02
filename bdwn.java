final class bdwn implements ibtw {
    public static final bdwn a;

    static {
        bdwn.a = new bdwn();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        String s = isq.c(0x7F1526AB, ((goz)object0));  // string:pwm_delete_all_dialog_title "Delete all Google Password Manager data?"
        hey hey0 = hfc.e;
        ((goz)object0).M(0x6E3C21FE);
        Object object2 = ((goz)object0).k();
        if(object2 == gop.a) {
            object2 = new bdwm();
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        gdh.b(s, iuc.d(hey0, ((ibts)object2)), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((goz)object0), 0, 0, 0x3FFFC);
        return ibom.a;
    }
}

