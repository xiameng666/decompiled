import android.accounts.Account;
import com.google.android.gms.pay.GooglePaymentMethodId;

public final class dmvp implements ibth {
    public final dmwr a;

    public dmvp(dmwr dmwr0) {
        this.a = dmwr0;
    }

    @Override  // ibth
    public final Object a() {
        hjqn hjqn0;
        dmwr dmwr0 = this.a;
        dxev dxev0 = dmwr0.B();
        String s = null;
        if(dxev0 == null) {
            hjqn0 = null;
        }
        else {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 == null) {
                hjqn0 = null;
            }
            else {
                hjqn0 = hkhr0.e;
                if(hjqn0 == null) {
                    hjqn0 = hjqn.a;
                }
            }
        }
        dmre dmre0 = new dmre();
        Account account0 = dmwr0.b;
        if(account0 == null) {
            ibuq.j("account");
            account0 = null;
        }
        dmre0.d(account0);
        dmre0.h(2);
        GooglePaymentMethodId[] arr_googlePaymentMethodId = new GooglePaymentMethodId[1];
        GooglePaymentMethodId googlePaymentMethodId0 = new GooglePaymentMethodId();
        googlePaymentMethodId0.b = hjqn0 == null ? null : hjqn0.c;
        if(hjqn0 != null) {
            s = hjqn0.b;
        }
        googlePaymentMethodId0.a = s;
        arr_googlePaymentMethodId[0] = googlePaymentMethodId0;
        dmre0.j(arr_googlePaymentMethodId);
        dmwr0.startActivity(dmre0.c());
        return ibom.a;
    }
}

