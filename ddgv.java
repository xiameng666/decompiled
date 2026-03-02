import android.accounts.Account;

final class ddgv implements ibtx {
    final Account a;
    final ibth b;

    public ddgv(Account account0, ibth ibth0) {
        this.a = account0;
        this.b = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        String s;
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        hey hey0 = hfc.e;
        firy.b(dla.i(dls.e(hey0, 36.0f), 10.0f, 0.0f, 2), 0.0f, 0L, ((goz)object1), 6);
        Account account0 = this.a;
        if(account0 == null) {
            ((goz)object1).M(0x150D1A42);
            s = isq.c(0x7F152D0C, ((goz)object1));  // string:sharing_settings_button_account_name_not_found_description "Tap to choose 
                                                    // an account"
        }
        else {
            ((goz)object1).M(353070827);
            s = isq.d(0x7F152B8B, new Object[]{account0.name}, ((goz)object1));  // string:sharing_account_content_description "Signed in as %1$s"
        }
        ((goz)object1).A();
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).X(s);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new ddgu(s);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc0 = cru.d(iuc.d(hey0, ((ibts)object3)), false, null, null, null, cmig.a(((cmhw)object0), this.b), 15);
        iau iau0 = dhw.a(hei.a, false);
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
        ddbf.d(account0, 48.0f, ((goz)object1), 0x30);
        ((goz)object1).z();
        return ibom.a;
    }
}

