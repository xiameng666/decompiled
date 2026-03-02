final class dfpj implements ibtx {
    final boolean a;
    final ibth b;
    final ibth c;

    public dfpj(boolean z, ibth ibth0, ibth ibth1) {
        this.a = z;
        this.b = ibth0;
        this.c = ibth1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        iau iau0 = dii.a(dho.c, hei.n, ((goz)object1), 0x30);
        long v = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc0 = hew.c(((goz)object1), hfc.e);
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
        guo.b(((goz)object1), hfc0, iej.c);
        String s = isq.c(0x7F152DBF, ((goz)object1));  // string:sharing_visibility_option_contacts "@com.google.android.gms:string/common_people_settings_title"
        String s1 = isq.c(0x7F152DBD, ((goz)object1));  // string:sharing_visibility_contacts_description_with_contacts "Only your contacts 
                                                        // with a Google Account."
        ibth ibth1 = cmig.a(((cmhw)object0), this.b);
        dfqn.k(s, s1, this.a, ibth1, ((goz)object1));
        dfqn.h(this.c, ((goz)object1), 0);
        ((goz)object1).z();
        return ibom.a;
    }
}

