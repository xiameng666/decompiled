import com.google.android.gms.wallet.PaymentData;

final class dxmz implements acn, ibum {
    final dxna a;

    public dxmz(dxna dxna0) {
        this.a = dxna0;
        super();
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibuo(1, this.a, dxna.class, "paymentDataResultCallback", "paymentDataResultCallback(Lcom/google/android/gms/wallet/contract/ApiTaskResult;)V", 0);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof acn) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((fbgq)object0), "p0");
        int v = ((fbgq)object0).b.i;
        dxna dxna0 = this.a;
        dxmi dxmi0 = null;
        switch(v) {
            case 0: {
                Object object1 = ((fbgq)object0).a;
                if(object1 == null) {
                    ((ggtj)dxna.a.j()).x("Payment data is null");
                    dxna.U(dxna0, null, null, null, null, null, true, null, null, 0xDF);
                    return;
                }
                dxmi dxmi1 = dxna0.aq;
                if(dxmi1 == null) {
                    ibuq.j("viewModel");
                    dxmi1 = null;
                }
                dxmi1.i = (PaymentData)object1;
                if(hwue.i()) {
                    dxmi dxmi2 = dxna0.aq;
                    if(dxmi2 == null) {
                        ibuq.j("viewModel");
                        dxmi2 = null;
                    }
                    icck icck0 = lsc.a(dxmi2);
                    dxmf dxmf0 = new dxmf(dxmi2, null);
                    icbb.b(icck0, dxmi2.e, null, dxmf0, 2);
                    return;
                }
                if(!bbmq.P()) {
                    ftem ftem0 = dxna0.ar;
                    if(ftem0 == null) {
                        ibuq.j("config");
                        ftem0 = null;
                    }
                    if((ftem0.b & 0x1000000) == 0 && (hwgk.u() || dsjv.b(dxna0.requireContext()))) {
                        frzk frzk0 = dxna0.R();
                        String s = dxna0.getString(0x7F151BF1);  // string:pay_auth_prompt_title "Verify it\'s you"
                        ibuq.e(s, "getString(...)");
                        String s1 = dxna0.getString(0x7F1520D2);  // string:pay_screen_confirm_cdcvm_subtitle "to access Google Wallet"
                        ibuq.e(s1, "getString(...)");
                        frzk.g(frzk0, s, s1, true, null, false, jys.d(), 0, 0, 0xD8);
                        dmgi dmgi0 = dxna0.y();
                        hagt hagt0 = hagt.bc;
                        ftem ftem1 = dxna0.ar;
                        if(ftem1 == null) {
                            ibuq.j("config");
                            ftem1 = null;
                        }
                        gtlq gtlq0 = gtlq.b(ftem1.B) == null ? gtlq.a : gtlq.b(ftem1.B);
                        ibuq.e(gtlq0, "getImplementationType(...)");
                        ftem ftem2 = dxna0.ar;
                        if(ftem2 == null) {
                            ibuq.j("config");
                        }
                        else {
                            dxmi0 = ftem2;
                        }
                        dmgi0.b(dxsy.n(hagt0, gtlq0, (dxmi0.r == null ? hkug.a : dxmi0.r).d));
                        return;
                    }
                }
                dxmi dxmi3 = dxna0.aq;
                if(dxmi3 == null) {
                    ibuq.j("viewModel");
                }
                else {
                    dxmi0 = dxmi3;
                }
                dxmi0.e();
                return;
            }
            case 1: 
            case 8: {
                ((ggtj)dxna.a.j()).z("Payment unsuccessful. Status code: %d", v);
                dxna.U(dxna0, null, null, null, null, null, true, null, null, 0xDF);
                return;
            }
            case 16: {
                dxmi dxmi4 = dxna0.aq;
                if(dxmi4 == null) {
                    ibuq.j("viewModel");
                }
                else {
                    dxmi0 = dxmi4;
                }
                dxmi0.f();
                return;
            }
            default: {
                ((ggtj)dxna.a.j()).z("Unexpected status code: %d", v);
                dxna.U(dxna0, null, null, null, null, null, true, null, null, 0xDF);
            }
        }
    }
}

