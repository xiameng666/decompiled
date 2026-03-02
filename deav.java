final class deav implements ibtx {
    public static final deav a;

    static {
        deav.a = new deav();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        hfc hfc0 = dls.w(hfc.e);
        iau iau0 = dii.a(dho.c, hei.n, ((goz)object1), 0x30);
        long v = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        fiso.a(ism.a(0x7F0805F6, ((goz)object1), 0), null, null, 0L, ((goz)object1), 56, 12);  // drawable:gs_person_search_vd_theme_24
        String s = isq.c(0x7F152D29, ((goz)object1));  // string:sharing_settings_no_contacts_title "No contacts yet"
        jbn jbn0 = fpu.d(((goz)object1)).j;
        fiuk.b(s, null, 0L, 0L, jeu.k, 0L, null, 0L, 0, false, 0, 0, null, jbn0, ((goz)object1), 0x180000, 0, 0x1FFBE);
        fiuk.b(isq.c(0x7F152D28, ((goz)object1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, fpu.d(((goz)object1)).j, ((goz)object1), 0, 0, 0x1FFFE);  // string:sharing_settings_no_contacts_label "Add contacts to your device"
        ((goz)object1).z();
        return ibom.a;
    }
}

