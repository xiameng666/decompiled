import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.SystemProperties;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import com.android.onboarding.contracts.annotations.InternalOnboardingApi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public final class sel {
    private final Context a;
    private final Map b;

    public sel(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0.getApplicationContext();
        this.b = new LinkedHashMap();
    }

    public final boolean a(String s, long v) {
        String s5;
        ibuq.f(s, "component");
        String s1 = sel.c(s);
        sen sen0 = (sen)ses.a.get(Long.valueOf(v));
        if(sen0 == null) {
            throw new IllegalStateException(a.D(v, "Invalid change ID ", " - this should have been blocked by the conformance checker"));
        }
        if(sen0.c() == seo.a && !ibuq.m(s1, "com.google.android.gms")) {
            throw new IllegalArgumentException("You cannot query changes which are SINGLE_COMPONENT across process boundaries.");
        }
        Context context0 = this.a;
        ibuq.e(context0, "context");
        Boolean boolean0 = sel.d(context0, s1 + "." + sen0.a());
        if(boolean0 == null) {
            String[] arr_s = sen0.i();
            ArrayList arrayList0 = new ArrayList(arr_s.length);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s2 = arr_s[v1];
                ibuq.e(context0, "context");
                arrayList0.add(sel.d(context0, s1 + "." + s2));
            }
            boolean0 = Boolean.valueOf(true);
            if(!arrayList0.contains(boolean0)) {
                boolean0 = Boolean.valueOf(false);
                if(!arrayList0.contains(boolean0)) {
                    boolean0 = null;
                }
            }
        }
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        if(ibuq.m(sen0.g(), "NOT_RELEASED")) {
            ibuq.f(s1, "component");
            String s3 = sel.c(s1);
            ibuq.e(context0, "context");
            String s4 = Settings.Global.getString(context0.getContentResolver(), s3 + ".complianceDate");
            if(s4 == null) {
                s4 = SystemProperties.get((s3 + ".complianceDate"));
                ibuq.c(s4);
            }
            sek sek0 = s4.length() == 0 ? null : new sek(s4);
            if(sek0 == null) {
                try {
                    ApplicationInfo applicationInfo0 = context0.getPackageManager().getPackageInfo(s3, 0x80).applicationInfo;
                    if(applicationInfo0 == null) {
                        s5 = sek.a;
                    }
                    else {
                        Bundle bundle0 = applicationInfo0.metaData;
                        if(bundle0 == null) {
                            s5 = sek.a;
                        }
                        else {
                            s5 = bundle0.getString("onboarding-compliance-date");
                            if(s5 == null) {
                                s5 = sek.a;
                            }
                        }
                    }
                    sek sek1 = new sek(s5);
                    this.b.put(s3, sek1);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    sct.f("DefaultOnboardingChanges", "Could not find package info for " + s3, packageManager$NameNotFoundException0);
                    this.b.put(s3, null);
                }
            }
            else {
                this.b.put(s3, sek0);
            }
            sek sek2 = (sek)this.b.get(s1);
            if(sek2 != null) {
                return ibuq.m(sen0.e(), "NOT_AVAILABLE") ? false : new sek(sen0.e()).b.isAfter(sek2.b) ^ 1;
            }
            return false;
        }
        return true;
    }

    public final boolean b(long v) {
        return this.a("com.google.android.gms", v);
    }

    @InternalOnboardingApi
    public static final String c(String s) {
        ibuq.f(s, "component");
        return (String)ibzk.T(s, new String[]{"/"}, 2, 2).get(0);
    }

    private static final Boolean d(Context context0, String s) {
        Boolean boolean0 = null;
        try {
            boolean0 = Boolean.valueOf(Settings.Global.getInt(context0.getContentResolver(), s) == 1);
        }
        catch(Settings.SettingNotFoundException unused_ex) {
        }
        if(boolean0 != null) {
            return boolean0;
        }
        String s1 = SystemProperties.get(s);
        ibuq.c(s1);
        return s1.length() == 0 ? null : Boolean.valueOf(ibuq.m(s1, "1"));
    }
}

