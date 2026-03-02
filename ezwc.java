import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.PersistableBundle;
import android.os.PowerManager;
import android.os.StatFs;
import android.os.SystemProperties;
import android.os.storage.StorageManager;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.update.SystemUpdateStatus;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

public final class ezwc {
    public static final int a;
    private static final baun b;
    private static final Pattern c;

    static {
        ezwc.b = fabk.c("Device");
        ezwc.c = Pattern.compile("(.*)(/cache)(/.*|$)");
    }

    public static int a(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = jwe.b(context0, null, intentFilter0, 2);
        if(intent0 != null) {
            int v = intent0.getIntExtra("level", -1);
            int v1 = intent0.getIntExtra("scale", -1);
            return v < 0 || v1 <= 0 ? 100 : v * 100 / v1;
        }
        return 100;
    }

    public static long b(Context context0, String s, boolean z) {
        if(hwda.c() && !ezwc.g(s)) {
            StorageManager storageManager0 = (StorageManager)context0.getSystemService("storage");
            if(z) {
                try {
                    return storageManager0.getAllocatableBytes(storageManager0.getUuidForPath((hrnt.i() ? new File(ccsb.a.a(s)) : new File(s))), 1);
                }
                catch(SecurityException securityException0) {
                    ezwc.b.n("Failed to getAllocatableBytes using aggressive flag for %s, falling back to regular getAllocatableBytes.", securityException0, new Object[]{s});
                }
            }
            return hrnt.i() ? storageManager0.getAllocatableBytes(storageManager0.getUuidForPath(new File(ccsb.a.a(s)))) : storageManager0.getAllocatableBytes(storageManager0.getUuidForPath(new File(s)));
        }
        return new StatFs(s).getAvailableBytes();
    }

    public static long c() {
        String s = SystemProperties.get("ro.build.version.security_patch", "");
        if(gfta.c(s)) {
            ezwc.b.h("Failed to get security patch level.", new Object[0]);
            return 0L;
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        try {
            return simpleDateFormat0.parse(s).getTime();
        }
        catch(ParseException unused_ex) {
            ezwc.b.h("Unable to parse the patch level: %s.", new Object[]{s});
            return 0L;
        }
    }

    public static gged_interceptors d(Context context0) {
        if(hwbm.a.c().g()) {
            return ggna.a;
        }
        SubscriptionManager subscriptionManager0 = (SubscriptionManager)context0.getSystemService("telephony_subscription_service");
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        int[] arr_v = subscriptionManager0.getActiveSubscriptionIdList();
        ggdy ggdy0 = new ggdy();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(telephonyManager0.createForSubscriptionId(v1).isIccLockEnabled()) {
                ggdy0.i(Integer.valueOf(v1));
            }
        }
        return ggdy0.h();
    }

    public static boolean e(Context context0) {
        try {
            if(!Resources.getSystem().getBoolean(Resources.getSystem().getIdentifier(hwbg.d(), "bool", "android"))) {
                return false;
            }
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            Object[] arr_object = {hwbg.d()};
            ezwc.b.g("Could not read system resource value %s", resources$NotFoundException0, arr_object);
        }
        CarrierConfigManager carrierConfigManager0 = (CarrierConfigManager)context0.getSystemService("carrier_config");
        if(carrierConfigManager0 == null) {
            return false;
        }
        gged_interceptors gged0 = ezwc.d(context0);
        int v = ((ggna)gged0).c;
        int v1 = 0;
        while(v1 < v) {
            PersistableBundle persistableBundle0 = carrierConfigManager0.getConfigForSubId(((Integer)gged0.get(v1)).intValue());
            if(persistableBundle0 != null) {
                ++v1;
                if(!persistableBundle0.getBoolean(hwbg.a.c().b(), true)) {
                    return false;
                }
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean f() {
        return SystemProperties.get("ro.build.ab_update", "").equalsIgnoreCase("true");
    }

    public static boolean g(String s) {
        return ezwc.c.matcher(s).matches();
    }

    public static boolean h(Context context0) {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_CHANGED");
        Intent intent0 = jwe.b(context0, null, intentFilter0, 2);
        return intent0 != null && intent0.getIntExtra("plugged", 0) != 0;
    }

    public static boolean i(Context context0, SystemUpdateStatus systemUpdateStatus0, long v, long v1, long v2, long v3, long v4, long v5) {
        long v6 = v - systemUpdateStatus0.n;
        if(Long.compare(v6, v2) < 0 && !ezwc.j(context0) && (systemUpdateStatus0.p == -1L || systemUpdateStatus0.p + v3 < v1)) {
            return false;
        }
        return v6 >= v4 || ezwc.h(context0) ? Long.compare(v6, v5) >= 0 || ezwc.a(context0) >= 80 || ezwc.h(context0) : false;
    }

    public static boolean j(Context context0) {
        return ((PowerManager)context0.getSystemService("power")).isDeviceIdleMode();
    }

    public static boolean k(Context context0) {
        return ((PowerManager)context0.getSystemService("power")).isPowerSaveMode();
    }

    public static boolean l(Context context0) {
        return ((DisplayManager)context0.getSystemService("display")).getDisplay(0).getState() == 2;
    }

    public static boolean m() {
        return SystemProperties.get("ro.boot.vr", "").equals("1");
    }

    public static boolean n(Context context0) {
        KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
        return keyguardManager0 == null ? true : keyguardManager0.isDeviceSecure();
    }
}

