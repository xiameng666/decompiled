final class dunj implements ibtx {
    final duob a;
    final duoa b;

    public dunj(duob duob0, duoa duoa0) {
        this.a = duob0;
        this.b = duoa0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        fryh fryh0;
        hkaq hkaq2;
        hkaq hkaq1;
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPaddings");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.c(dls.v(hey0), ((dld)object0));
        duob duob0 = this.a;
        duoa duoa0 = this.b;
        dhn dhn0 = dho.c;
        hej hej0 = hei.m;
        iau iau0 = dii.a(dhn0, hej0, ((goz)object1), 0);
        int v1 = duni.a(gol.c(((goz)object1)));
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
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw3);
        dim dim0 = dim.a;
        hfc hfc2 = dla.e(hey0, 24.0f, 16.0f);
        iau iau1 = dii.a(dhn0, hej0, ((goz)object1), 0);
        int v2 = duni.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc3 = hew.c(((goz)object1), hfc2);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc3, ibtw3);
        dlv.a(dls.e(hey0, 16.0f), ((goz)object1));
        fryu fryu0 = null;
        fuce.a(null, new fucf(new frxv(new fryn(fuqq.a, 0, 6)), new fryr(0x7F152070), false, null, 26), ((goz)object1), 0x40, 1);  // string:pay_preview_added_to_wallet_title "Added to Wallet"
        dlv.a(dls.e(hey0, 32.0f), ((goz)object1));
        hjzq hjzq0 = duob0.b;
        ((goz)object1).M(0x1F47927E);
        if(hjzq0 != null) {
            hfc hfc4 = dls.w(hey0);
            hkar hkar0 = hjzq0.c == null ? hkar.a : hjzq0.c;
            hkao hkao0 = hkar0.c == null ? hkao.a : hkar0.c;
            ibuq.e(hkao0, "getCardArt(...)");
            hkaq hkaq0 = hkao0.c == null ? hkaq.a : hkao0.c;
            ibuq.e(hkaq0, "getImageAsset(...)");
            hkap hkap0 = hkap.a(hkaq0.c);
            ibuq.f(hkao0, "<this>");
            if((hkao0.b & 2) == 0) {
                hkaq1 = null;
            }
            else {
                hkaq1 = hkao0.d;
                if(hkaq1 == null) {
                    hkaq1 = hkaq.a;
                }
            }
            if(hkap0 == (hkaq1 == null ? null : hkap.a(hkaq1.c))) {
                hkaq2 = hkao0.d;
                if(hkaq2 == null) {
                    hkaq2 = hkaq.a;
                }
            }
            else {
                hkaq2 = null;
            }
            String s = "";
            if(hkap.a(hkaq0.c).ordinal() == 2) {
                String s1 = hkaq0.c == 4 ? ((String)hkaq0.d) : "";
                ibuq.e(s1, "getStaticUrl(...)");
                if(hkaq2 == null) {
                    s = null;
                }
                else if(hkaq2.c == 4) {
                    s = (String)hkaq2.d;
                }
                fryh0 = new fryj(s1, s, null, null, 12);
            }
            else {
                ((ggtj)duoa.a.i()).B("Unsupported mobile document image asset case: %s", hkap.a(hkaq0.c));
                fryh0 = new fryh(0);
            }
            String s2 = hkao0.e;
            ibuq.e(s2, "getImageDescription(...)");
            if(s2.length() > 0) {
                String s3 = hkao0.e;
                ibuq.e(s3, "getImageDescription(...)");
                fryu0 = new fryu(s3);
            }
            fujj.b(hfc4, new fujl(fryh0, null, fryu0, null, false, null, false, 0xFA), ((goz)object1), 70, 0);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        ((goz)object1).M(585225083);
        if(!duob0.c) {
            dlv.a(dil.a(dim0, hey0), ((goz)object1));
            duoa0.A(hjzq0, ((goz)object1), 0);
        }
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

