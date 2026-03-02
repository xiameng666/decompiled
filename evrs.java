import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

public final class evrs {
    static {
        bboh.b("PhoneNumberFormatter", bbcu.cc);
    }

    public static String a(TelephonyManager telephonyManager0, String s, Context context0) {
        if(telephonyManager0 != null && context0 != null) {
            gqig.a(context0);
            gqiv gqiv0 = gqiv.e();
            String s1 = telephonyManager0.getSimCountryIso();
            if(TextUtils.isEmpty(s1)) {
                s1 = Locale.getDefault().getCountry();
            }
            gqju gqju0 = null;
            String s2 = TextUtils.isEmpty(s1) ? null : s1.toUpperCase(Locale.ENGLISH);
            try {
                gqju gqju1 = gqiv0.f(s, gqgf.a(s2));
                if(gqju1 != null) {
                    gqju0 = gqju1;
                }
            }
            catch(gqim | IllegalArgumentException | NullPointerException unused_ex) {
            }
            if(gqju0 != null) {
                return gqiv0.k(gqju0) ? gqiv0.q(gqju0, 1) : s;
            }
        }
        return s;
    }
}

