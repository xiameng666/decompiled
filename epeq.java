import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class epeq {
    private static final baun a;
    private final TelephonyManager b;
    private final SubscriptionManager c;

    static {
        epeq.a = new baun("SetupServices", new String[]{"CountryHelper"});
    }

    public epeq(TelephonyManager telephonyManager0, SubscriptionManager subscriptionManager0) {
        this.b = telephonyManager0;
        this.c = subscriptionManager0;
    }

    public final String a() {
        String s = null;
        try {
            List list0 = this.c.getActiveSubscriptionInfoList();
            if(list0 == null) {
                goto label_19;
            }
            else {
                Iterator iterator0 = list0.iterator();
                while(true) {
                label_4:
                    if(!iterator0.hasNext()) {
                        goto label_19;
                    }
                    Object object0 = iterator0.next();
                    int v = ((SubscriptionInfo)object0).getSubscriptionId();
                    TelephonyManager telephonyManager0 = this.b.createForSubscriptionId(v);
                    if(telephonyManager0.getSimState() == 5) {
                        String s1 = telephonyManager0.getSimCountryIso();
                        baun baun0 = epeq.a;
                        if(baun0.b(3)) {
                            baun0.d("Returning user country using first ready SIM: " + s1, new Object[0]);
                        }
                        s = s1;
                        goto label_19;
                    }
                }
            }
            return s.toUpperCase(Locale.US);
        }
        catch(SecurityException securityException0) {
            epeq.a.m("Unable to get country from SIM: " + securityException0.getMessage(), new Object[0]);
            goto label_19;
        }
        goto label_4;
    label_19:
        if(s == null) {
            String s2 = fftn.f("device_country", "");
            if(!TextUtils.isEmpty(s2)) {
                baun baun1 = epeq.a;
                if(baun1.b(3)) {
                    baun1.d("Returning user country using Gservices device_country", new Object[0]);
                }
                return s2.toUpperCase(Locale.US);
            }
            baun baun2 = epeq.a;
            if(baun2.b(3)) {
                baun2.d("Returning user country using Locale", new Object[0]);
            }
            return Locale.getDefault().getCountry().toUpperCase(Locale.US);
        }
        return s.toUpperCase(Locale.US);
    }

    public final boolean b(String s) {
        String s1 = this.a();
        baun baun0 = epeq.a;
        if(baun0.b(3)) {
            baun0.d("User country is " + s1, new Object[0]);
        }
        return s.equalsIgnoreCase(s1);
    }
}

