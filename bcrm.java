import android.telephony.SubscriptionInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.chimera.modules.constellation.AppContextProvider;

public abstract class bcrm {
    static final ggeo a;
    public final bcrd b;
    public final TelephonyManager c;
    public final SubscriptionInfo d;
    private static final baun e;

    static {
        bcrm.e = bcrh.a("telephony_info_provider");
        bcrm.a = ggeo.o(Integer.valueOf(2), hogh.d, Integer.valueOf(1), hogh.c, Integer.valueOf(3), hogh.e, Integer.valueOf(0), hogh.b);
    }

    public bcrm(bcrd bcrd0, TelephonyManager telephonyManager0, SubscriptionInfo subscriptionInfo0) {
        this.b = bcrd0;
        this.c = telephonyManager0;
        this.d = subscriptionInfo0;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract gged_interceptors g();

    public abstract hogh h();

    public abstract String i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract String q();

    public abstract boolean r();

    public static bcrm s(bcrd bcrd0, SubscriptionInfo subscriptionInfo0) {
        Object object0 = AppContextProvider.a().getSystemService("phone");
        gftb.check(object0);
        return new bcrl(bcrd0, ((TelephonyManager)object0).createForSubscriptionId(subscriptionInfo0.getSubscriptionId()), subscriptionInfo0);
    }

    public static bcrm t(bcrd bcrd0) {
        Object object0 = AppContextProvider.a().getSystemService("phone");
        gftb.check(object0);
        return new bcrl(bcrd0, ((TelephonyManager)object0));
    }

    public final boolean u() {
        if(jwe.a(AppContextProvider.a(), "android.permission.READ_PRIVILEGED_PHONE_STATE") != 0) {
            bcrm.e.j("Doesn\'t have carrier id permission.", new Object[0]);
            return false;
        }
        try {
            Class[] arr_class = {Integer.TYPE, Integer.TYPE, String.class};
            this.c.getClass().getMethod("getIccAuthentication", arr_class);
            return true;
        }
        catch(Exception unused_ex) {
            bcrm.e.d("Method %s is missing", new Object[]{"getIccAuthentication"});
            try {
                Class[] arr_class1 = {Integer.TYPE, String.class};
                this.c.getClass().getMethod("getIccSimChallengeResponse", arr_class1);
                return true;
            }
            catch(Exception unused_ex) {
                bcrm.e.d("Method %s is missing", new Object[]{"getIccSimChallengeResponse"});
                return false;
            }
        }
    }
}

