import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.SubscriptionManager.OnSubscriptionsChangedListener;
import android.telephony.SubscriptionManager;
import java.util.concurrent.Executor;

public final class eiea {
    public static final gged_interceptors a;
    public final SubscriptionManager b;
    public final Executor c;
    public final SubscriptionManager.OnSubscriptionsChangedListener d;
    public boolean e;

    static {
        eiea.a = gged_interceptors.o(Integer.valueOf(0), Integer.valueOf(200), Integer.valueOf(500), Integer.valueOf(1000));
    }

    public eiea(Context context0) {
        this.e = false;
        this.b = (SubscriptionManager)context0.getSystemService(SubscriptionManager.class);
        this.d = new eidz(context0);
        this.c = new gmct(new bblp(0x7FFFFFFF, 10));
    }

    public static boolean a(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        return packageManager0.hasSystemFeature("android.hardware.telephony") && (!bbqa.c() || packageManager0.hasSystemFeature("android.hardware.telephony.subscription")) && (!jys.d() && hrtj.j() || hrtj.m());
    }
}

