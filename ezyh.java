import android.content.Context;
import android.telephony.TelephonyManager;

final class ezyh {
    public static final baun a;
    public final TelephonyManager b;
    public final Context c;

    static {
        ezyh.a = fabk.d("SubscriptionInfoUtil");
    }

    public ezyh(Context context0) {
        this.c = context0;
        this.b = (TelephonyManager)context0.getSystemService("phone");
    }

    public final hnof a() {
        TelephonyManager telephonyManager0 = this.b;
        if(telephonyManager0 == null) {
            ezyh.a.m("TelephonyManager not available for populating subscription info.", new Object[0]);
            return hnof.a;
        }
        hnoe hnoe0 = (hnoe)((ProtoLiteMessage)hnof.a).v_newBuilder();
        hnoe0.k(gfta.b(telephonyManager0.getSimOperator()));
        hnoe0.a(((long)telephonyManager0.getSimCarrierId()));
        return (hnof)((ProtoLiteBuilder)hnoe0).N_build();
    }
}

