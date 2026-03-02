import com.google.android.gms.pay.GooglePaymentMethodId;

public final class ebyh implements gftc {
    public final GooglePaymentMethodId[] a;

    public ebyh(GooglePaymentMethodId[] arr_googlePaymentMethodId) {
        this.a = arr_googlePaymentMethodId;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        hjqn hjqn0 = ((dylf)object0).c;
        if(hjqn0 == null) {
            hjqn0 = hjqn.a;
        }
        String s = hjqn0.b;
        if(gfta.c(s)) {
            return false;
        }
        GooglePaymentMethodId[] arr_googlePaymentMethodId = this.a;
        for(int v = 0; v < arr_googlePaymentMethodId.length; ++v) {
            if(s.equals(arr_googlePaymentMethodId[v].a)) {
                return true;
            }
        }
        return false;
    }
}

