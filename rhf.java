import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.net.URL;

public final class rhf {
    private final Context a;
    private final URL b;
    private final String c;
    private rha d;

    public rhf(Context context0, URL uRL0, String s) {
        gftb.check(context0);
        this.a = context0;
        this.b = uRL0;
        if(s != null) {
            this.c = s;
            return;
        }
        this.c = "2.0";
    }

    public final rhe a(int v, String s, String s1, String s2, String s3) {
        long v3;
        rhu rhu0;
        int v2;
        String s4;
        gftb.check(s);
        int v1 = s.hashCode();
        if(v1 != -1412968074) {
            switch(v1) {
                case -1412968080: {
                    if(s.equals("ap2003")) {
                        goto label_30;
                    }
                    break;
                }
                case 0xABC7D171: {
                    if(s.equals("ap2004")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968078: {
                    if(s.equals("ap2005")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968077: {
                    if(s.equals("ap2006")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968052: {
                    if(s.equals("ap2010")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968051: {
                    if(s.equals("ap2011")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968050: {
                    if(s.equals("ap2012")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968049: {
                    if(s.equals("ap2013")) {
                        goto label_30;
                    }
                    break;
                }
                case 0xABC7D190: {
                    if(s.equals("ap2014")) {
                        goto label_30;
                    }
                    break;
                }
                case 0xABC7D191: {
                    if(s.equals("ap2015")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968046: {
                    if(s.equals("ap2016")) {
                        goto label_30;
                    }
                    break;
                }
                case -1412968045: {
                    if(s.equals("ap2017")) {
                        goto label_30;
                    }
                }
            }
        }
        else if(s.equals("ap2009")) {
        label_30:
            Context context0 = this.a;
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
            if(telephonyManager0 == null) {
                s4 = null;
            }
            else {
                if(v < 0 || v >= telephonyManager0.getActiveModemCount()) {
                    throw new IllegalArgumentException("getAuthToken: invalid slot index " + v);
                }
                s4 = telephonyManager0.getImei(v);
            }
            rhc rhc0 = rhd.a();
            rhc0.h(this.c);
            rhc0.m(gfta.b(s4));
            rhc0.c(gfta.b(s1));
            rhc0.d(gfta.b(s2));
            if(s3 != null) {
                rhc0.b(s3);
            }
            rhd rhd0 = rhc0.a();
            rgv rgv0 = rgw.a();
            rgv0.d(this.b.toString());
            rgw rgw0 = rgv0.a();
            if(this.d == null) {
                if(Build.VERSION.SDK_INT < 34) {
                    int[] arr_v = ((SubscriptionManager)context0.getSystemService(SubscriptionManager.class)).getSubscriptionIds(v);
                    v2 = 0x7FFFFFFF;
                    if(arr_v != null && arr_v.length > 0) {
                        v2 = arr_v[0];
                    }
                }
                else {
                    v2 = SubscriptionManager.getSubscriptionId(v);
                }
                this.d = new rha(context0, rgw0, v2);
            }
            try {
                rhu0 = this.d.a(gged_interceptors.l(s), rhd0);
            }
            catch(rhb rhb0) {
                Log.w("Ts43Auth", "Failed to get authentication token. e=" + rhb0.toString());
                throw rhb0;
            }
            gged_interceptors gged0 = rhu0.e;
            rid rid0 = new rid(rhu0.b);
            String s5 = rid0.a(gged_interceptors.l("TOKEN"), "token");
            if(!TextUtils.isEmpty(s5)) {
                String s6 = gfta.b(rid0.a(gged_interceptors.l("TOKEN"), "validity"));
                try {
                    v3 = -1L;
                    v3 = Long.parseLong(s6);
                }
                catch(NumberFormatException unused_ex) {
                }
                return new rhe(s5, gged0, v3);
            }
            Log.w("Ts43Auth", "Failed to parse authentication token");
            throw new rhb(60, "Failed to parse authentication token");
        }
        throw new IllegalArgumentException("getAuthToken: invalid app id " + s);
    }
}

