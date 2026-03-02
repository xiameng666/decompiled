final class degf implements ibtw {
    public static final degf a;

    static {
        degf.a = new degf();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = cvf.c(hey0, cvf.d(0, ((goz)object0), 0, 1));
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object0), 0);
        long v = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc1 = hew.c(((goz)object0), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth0);
        }
        else {
            ((goz)object0).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc1, iej.c);
        String s = isq.d(0x7F152BBB, new Object[]{isq.c(0x7F152CA6, ((goz)object0))}, ((goz)object0));  // string:sharing_automatic_bluetooth_wifi_dialog_title "Allow %1$s to turn on Wi-Fi 
                                                                                                        // and Bluetooth?"
        jbn jbn0 = fpu.d(((goz)object0)).f;
        long v2 = fpu.a(((goz)object0)).q;
        ddxv.b(((goz)object0));
        fiuk.b(s, dla.j(hey0, 0.0f, 0.0f, 0.0f, 16.0f, 7), v2, 0L, null, 0L, new jjy(3), 0L, 0, false, 0, 0, null, jbn0, ((goz)object0), 0, 0, 130040);
        String s1 = isq.d(0x7F152BBA, new Object[]{isq.c(0x7F152CA6, ((goz)object0))}, ((goz)object0));  // string:sharing_automatic_bluetooth_wifi_dialog_subtitle "%1$s will be allowed to 
                                                                                                         // temporarily turn on Bluetooth and Wi-Fi to make you available when nearby contacts 
                                                                                                         // are sharing"
        jbn jbn1 = fpu.d(((goz)object0)).k;
        fiuk.b(s1, null, fpu.a(((goz)object0)).s, 0L, null, 0L, new jjy(5), 0L, 0, false, 0, 0, null, jbn1, ((goz)object0), 0, 0, 0x1FBFA);
        ((goz)object0).z();
        return ibom.a;
    }
}

