import com.google.android.gms.pay.main.PayChimeraActivity;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.List;

public final class dovd implements evqk {
    public final PayChimeraActivity a;
    public final String b;

    public dovd(PayChimeraActivity payChimeraActivity0, String s) {
        this.a = payChimeraActivity0;
        this.b = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        String s = (String)((List)object0).get(0);
        String s1 = this.b;
        if(s == null) {
            PayChimeraActivity payChimeraActivity0 = this.a;
            if(payChimeraActivity0.A) {
                return payChimeraActivity0.o();
            }
            payChimeraActivity0.H(s1);
            return evrg.c(new cjuh(5, null));
        }
        return evrg.d(AccountInfo.a(s, s1, ((Boolean)((List)object0).get(1)).booleanValue()));
    }
}

