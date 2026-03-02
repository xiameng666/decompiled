import com.google.android.gms.pay.main.PayChimeraActivity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dovg implements evqk {
    public final PayChimeraActivity a;
    public final String b;

    public dovg(PayChimeraActivity payChimeraActivity0, String s) {
        this.a = payChimeraActivity0;
        this.b = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        String s = this.b;
        if(((String)object0) == null) {
            PayChimeraActivity payChimeraActivity0 = this.a;
            if(!payChimeraActivity0.A && !payChimeraActivity0.C) {
                payChimeraActivity0.H(s);
                return evrg.c(new cjuh(5, null));
            }
            return payChimeraActivity0.o();
        }
        return evrg.d(new AccountInfo(((String)object0), s, 0));
    }
}

