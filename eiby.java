import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import j..time.Instant;

public final class eiby {
    public static boolean a(Context context0) {
        long v;
        Instant instant0;
        boolean z = false;
        if(!eiby.b(context0)) {
            return false;
        }
        if(!hrtj.a.e().v()) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context0.getContentResolver(), "theft_protection_default_on") == 1;
        }
        catch(Settings.SettingNotFoundException unused_ex) {
            try {
                instant0 = null;
                v = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).firstInstallTime;
                if(v > 0L) {
                    goto label_10;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            goto label_11;
        label_10:
            instant0 = Instant.ofEpochMilli(v);
        label_11:
            if(instant0 != null) {
                hrtj hrtj0 = hrtj.a;
                if(instant0.isAfter(hjit.b(hrtj0.e().f()).atStartOfDay(glxw.a).toInstant())) {
                    if(hrtj0.e().w()) {
                        z = true;
                    }
                    else {
                        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
                        if(telephonyManager0 != null && (eiby.c(telephonyManager0.getSimCountryIso()) || eiby.c(telephonyManager0.getNetworkCountryIso()))) {
                            z = true;
                        }
                        else if(hrtj0.e().x()) {
                            LocaleList localeList0 = context0.getResources().getConfiguration().getLocales();
                            for(int v1 = 0; v1 < localeList0.size(); ++v1) {
                                if(eiby.c(localeList0.get(v1).getCountry())) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            Settings.Secure.putInt(context0.getContentResolver(), "theft_protection_default_on", ((int)z));
            return z;
        }
        return true;
    }

    public static boolean b(Context context0) {
        if(hrtj.f()) {
            if(!bbnp.k(context0)) {
                return false;
            }
            return bbnp.j(context0) ? false : !hrtj.a.e().i() || !gfqz.e(Build.MANUFACTURER, "Samsung") || !gfqz.e(Build.MODEL, "SM-A235M");
        }
        return true;
    }

    private static boolean c(String s) {
        return s != null && gqgf.b(s).equals(gqgf.G);
    }
}

