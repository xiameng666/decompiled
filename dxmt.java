import android.accounts.Account;

public final class dxmt implements icih {
    final dxna a;

    public dxmt(dxna dxna0) {
        this.a = dxna0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ftem ftem0 = null;
        ibuq.f(((frxf)object0), "event");
        dxna dxna0 = this.a;
        if((((frxf)object0) instanceof frxg)) {
            ((frxg)(((frxf)object0))).a(dxna0);
            if(!hwue.g()) {
                dxna0.at(-1, ((frxg)(((frxf)object0))).a);
                dxna0.ar();
                return ibom.a;
            }
        }
        else if((((frxf)object0) instanceof dxor)) {
            dxna0.as.b(((dxor)(((frxf)object0))).a);
            ftem ftem1 = dxna0.ar;
            if(ftem1 == null) {
                ibuq.j("config");
                ftem1 = null;
            }
            if((ftem1.b & 0x1000000) != 0) {
                fhwb fhwb0 = dxna0.ak;
                if(fhwb0 == null) {
                    ibuq.j("semanticLogger");
                    fhwb0 = null;
                }
                fhvz fhvz0 = fhwa.a(253330);
                Account account0 = dxna0.b;
                if(account0 == null) {
                    ibuq.j("account");
                    account0 = null;
                }
                fhvz0.c(fhwp.b(account0.name));
                ftem ftem2 = dxna0.ar;
                if(ftem2 == null) {
                    ibuq.j("config");
                }
                else {
                    ftem0 = ftem2;
                }
                dyna dyna0 = dzdt.f(ftem0.c);
                ibuq.e(dyna0, "getSeServiceProviderFromBillableService(...)");
                String s = dxna0.E().a();
                ibuq.e(s, "get(...)");
                fhvz0.b(dxsy.b(dyna0, s));
                fhwb0.a(fhvz0.a());
                return ibom.a;
            }
        }
        else {
            if((((frxf)object0) instanceof dxpz)) {
                if(!hwue.i()) {
                    ((ggtj)dxna.a.j()).x("PromptUserAuthenticationUiEvent is not handled when flag is off.");
                    return ibom.a;
                }
                frzk frzk0 = dxna0.R();
                String s1 = dxna0.getString(0x7F151BF1);  // string:pay_auth_prompt_title "Verify it\'s you"
                ibuq.e(s1, "getString(...)");
                String s2 = dxna0.getString(0x7F1520D2);  // string:pay_screen_confirm_cdcvm_subtitle "to access Google Wallet"
                ibuq.e(s2, "getString(...)");
                frzk.g(frzk0, s1, s2, true, null, false, jys.d(), 0, 0, 0xD8);
                dmgi dmgi0 = dxna0.y();
                hagt hagt0 = hagt.bc;
                ftem ftem3 = dxna0.ar;
                if(ftem3 == null) {
                    ibuq.j("config");
                    ftem3 = null;
                }
                gtlq gtlq0 = gtlq.b(ftem3.B) == null ? gtlq.a : gtlq.b(ftem3.B);
                ibuq.e(gtlq0, "getImplementationType(...)");
                ftem ftem4 = dxna0.ar;
                if(ftem4 == null) {
                    ibuq.j("config");
                }
                else {
                    ftem0 = ftem4;
                }
                dmgi0.b(dxsy.n(hagt0, gtlq0, (ftem0.r == null ? hkug.a : ftem0.r).d));
                return ibom.a;
            }
            if((((frxf)object0) instanceof dxne)) {
                dxna0.at(-1, ((dxne)(((frxf)object0))).a);
                dxna0.ar();
                return ibom.a;
            }
            if((((frxf)object0) instanceof dxnf)) {
                ftem ftem5 = dxna0.ar;
                if(ftem5 == null) {
                    ibuq.j("config");
                }
                else {
                    ftem0 = ftem5;
                }
                if((ftem0.b & 0x1000000) != 0) {
                    String s3 = ((dxnf)(((frxf)object0))).a;
                    String s4 = s3 == null ? dxna0.getString(0x7F151DDD) : dxna0.getString(0x7F1520E9, new Object[]{s3});  // string:pay_error_dialog_body "Please try again later"
                    ibuq.c(s4);
                    String s5 = dxna0.getString(0x7F1521A5);  // string:pay_se_pass_renewal_error_dialog_title "Pass was not renewed"
                    ibuq.e(s5, "getString(...)");
                    dxna.U(dxna0, s5, s4, null, null, null, false, null, null, 0xFC);
                    return ibom.a;
                }
                dxna.U(dxna0, null, null, null, null, null, false, null, null, 0xFF);
                return ibom.a;
            }
            ((frxf)object0).a(dxna0);
        }
        return ibom.a;
    }
}

