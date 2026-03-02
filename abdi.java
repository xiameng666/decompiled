import android.content.Context;
import android.telephony.TelephonyManager;
import j..util.Objects;
import java.util.Locale;

public final class abdi {
    public static final boolean a(Context context0) {
        Objects.requireNonNull(context0);
        if(context0.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
            if(telephonyManager0 == null) {
                return true;
            }
            String s = telephonyManager0.getSimCountryIso();
            return !s.isEmpty() && hotp.a.d().e().b.contains(s.toLowerCase(Locale.ENGLISH));
        }
        return true;
    }

    public static final boolean b(Context context0) {
        Objects.requireNonNull(context0);
        if(context0.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
            if(telephonyManager0 == null) {
                return false;
            }
            String s = telephonyManager0.getSimCountryIso();
            return s == null ? false : hotp.a.d().f().b.contains(s.toLowerCase(Locale.ENGLISH));
        }
        return false;
    }
}

