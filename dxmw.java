public final class dxmw implements icih {
    final dxna a;

    public dxmw(dxna dxna0) {
        this.a = dxna0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dxna dxna0 = this.a;
        dxmi dxmi0 = null;
        if((((frzu)object0) instanceof frzs)) {
            ((ggtj)dxna.a.h()).x("Successfully authenticated, continue purchase flow.");
            if(hwue.h()) {
                dmgi dmgi0 = dxna0.y();
                hagt hagt0 = hagt.bd;
                ftem ftem0 = dxna0.ar;
                if(ftem0 == null) {
                    ibuq.j("config");
                    ftem0 = null;
                }
                gtlq gtlq0 = gtlq.b(ftem0.B) == null ? gtlq.a : gtlq.b(ftem0.B);
                ibuq.e(gtlq0, "getImplementationType(...)");
                ftem ftem1 = dxna0.ar;
                if(ftem1 == null) {
                    ibuq.j("config");
                    ftem1 = null;
                }
                dmgi0.b(dxsy.n(hagt0, gtlq0, (ftem1.r == null ? hkug.a : ftem1.r).d));
            }
            dxmi dxmi1 = dxna0.aq;
            if(dxmi1 == null) {
                ibuq.j("viewModel");
            }
            else {
                dxmi0 = dxmi1;
            }
            dxmi0.e();
            return ibom.a;
        }
        if((((frzu)object0) instanceof frzo)) {
            Integer integer0 = (Integer)((frzo)(((frzu)object0))).b.g();
            if(integer0 != null && ((int)integer0) == 10) {
                ((ggtj)dxna.a.h()).x("Authentication canceled.");
                if(hwue.h()) {
                    dxmi dxmi2 = dxna0.aq;
                    if(dxmi2 == null) {
                        ibuq.j("viewModel");
                        dxmi2 = null;
                    }
                    dxmi2.h(hagt.bh, hagu.g);
                }
                if(!hwue.a.b().h()) {
                    return ibom.a;
                }
                dxmi dxmi3 = dxna0.aq;
                if(dxmi3 == null) {
                    ibuq.j("viewModel");
                    dxmi3 = null;
                }
                dxmi3.i = null;
                dxmi dxmi4 = dxna0.aq;
                if(dxmi4 == null) {
                    ibuq.j("viewModel");
                }
                else {
                    dxmi0 = dxmi4;
                }
                dxmi0.f();
                return ibom.a;
            }
            ((ggtj)dxna.a.j()).B("Unrecoverable authentication error %s.", ((frzu)object0));
            dxna.U(dxna0, null, null, null, null, hagu.f, false, null, null, 0xEF);
            return ibom.a;
        }
        if((((frzu)object0) instanceof frzp)) {
            ((ggtj)dxna.a.h()).x("Authentication with biometrics failed. Retry.");
            if(!hwue.h()) {
                return ibom.a;
            }
            dxmi dxmi5 = dxna0.aq;
            if(dxmi5 == null) {
                ibuq.j("viewModel");
            }
            else {
                dxmi0 = dxmi5;
            }
            dxmi0.h(hagt.bh, hagu.h);
            return ibom.a;
        }
        if((((frzu)object0) instanceof frzr)) {
            ((ggtj)dxna.a.j()).x("User does not have a screen lock set up.");
            if(hwue.a.b().m()) {
                String s = dxna0.getString(0x7F152087);  // string:pay_purchase_screen_lock_missing_dialog_title "Add a screen lock to complete 
                                                         // purchase"
                ibuq.e(s, "getString(...)");
                String s1 = dxna0.getString(0x7F152086);  // string:pay_purchase_screen_lock_missing_dialog_message "To add money to your card 
                                                          // or buy a pass, you need to verify it\'s you"
                ibuq.e(s1, "getString(...)");
                String s2 = dxna0.getString(0x7F151FF8);  // string:pay_open_settings_label "Open settings"
                ibuq.e(s2, "getString(...)");
                String s3 = dxna0.getString(0x7F1508A3);  // string:common_no_thanks "No thanks"
                dxmn dxmn0 = new dxmn(dxna0);
                dxmo dxmo0 = new dxmo(dxna0);
                dxna.U(dxna0, s, s1, s2, s3, hagu.i, false, dxmn0, dxmo0, 0x20);
                return ibom.a;
            }
            dxna.U(dxna0, null, null, null, null, hagu.i, false, null, null, 0xEF);
            return ibom.a;
        }
        if(!(((frzu)object0) instanceof frzq)) {
            throw new ibnq();
        }
        ((ggtj)dxna.a.j()).x("Unexpected error, device is ineligible to use this auth method");
        dxna.U(dxna0, null, null, null, null, hagu.j, false, null, null, 0xEF);
        return ibom.a;
    }
}

