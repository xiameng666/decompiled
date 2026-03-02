import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public final class cqnf {
    private final Context a;

    public cqnf(Context context0) {
        this.a = context0;
    }

    public final int a() {
        Context context0 = this.a;
        if(bbmn.h(context0, "com.google.android.gms").isEmpty()) {
            return -4;
        }
        if(!cqnf.c(context0)) {
            return -1;
        }
        return cqqs.a(context0) ? 1 : -2;
    }

    public static Intent b(Context context0) {
        if(!cqnf.f(context0)) {
            return null;
        }
        Intent intent0 = new Intent("com.google.android.gms.settings.QRL_SETTINGS").setComponent(new ComponentName(context0, "com.google.android.gms.mdm.settings.QrlSettingsActivity"));
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0);
        if(resolveInfo0 == null) {
            return null;
        }
        return resolveInfo0.activityInfo == null ? null : intent0;
    }

    public static boolean c(Context context0) {
        if(hxwi.a.c().d()) {
            return bbpj.a(context0).j() ? false : cqix.h.a(context0).booleanValue();
        }
        return !hxvi.q() || !bbmn.t(context0) ? cqix.h.a(context0).booleanValue() : false;
    }

    public final boolean d() {
        return !bbnp.d(this.a) && (!hxwi.a.c().e() || !bbpj.a(this.a).j());
    }

    public static boolean e(Context context0) {
        return !cqnf.f(context0) || !cqnf.c(context0) ? false : cqix.p.b(context0);
    }

    public static boolean f(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        if(!packageManager0.hasSystemFeature("android.hardware.telephony") || bbqa.c() && hxwm.s() && !packageManager0.hasSystemFeature("android.hardware.telephony.subscription")) {
            return false;
        }
        return eibw.a(context0) ? eiby.b(context0) && hxwm.i() : false;
    }
}

