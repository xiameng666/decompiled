import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.Settings.Global;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public final class cjai {
    private static final Object a;
    private static cjai b;

    static {
        cjai.a = new Object();
    }

    public final Intent a() {
        return new Intent("android.settings.SYSTEM_COMPONENT_UPDATE_SETTINGS").setPackage("com.android.vending");
    }

    public final Intent b(Context context0) {
        return new Intent("com.google.android.gms.usagereporting.GOOGLE_SETTINGS").setPackage("com.google.android.gms").addCategory("android.intent.category.DEFAULT");
    }

    public static cjai c() {
        synchronized(cjai.a) {
            if(cjai.b == null) {
                cjai.b = new cjai();
            }
        }
        return cjai.b;
    }

    public final void d(Uri uri0, Activity activity0) {
        GoogleHelp googleHelp0 = new GoogleHelp("android_main");
        googleHelp0.b(activity0);
        ThemeSettings themeSettings0 = new ThemeSettings();
        themeSettings0.a = 3;
        googleHelp0.s = themeSettings0;
        googleHelp0.q = uri0;
        bkyf bkyf0 = new bkyf();
        Bitmap bitmap0 = azts.Z(activity0.getContainerActivity());
        if(bitmap0 != null) {
            bkyf0.a = bitmap0;
        }
        googleHelp0.d(bkyf0.a(), activity0.getCacheDir());
        Intent intent0 = googleHelp0.a();
        if(hoju.i()) {
            intent0.addFlags(0x10000000);
        }
        new bthl(activity0).a(intent0);
    }

    public final void e(Context context0) {
        context0.startActivity(new Intent().setClassName(context0, "com.google.android.gms.app.settings.licenses.LicensesActivity"));
    }

    public final boolean f(Context context0) {
        return context0.getSharedPreferences("googlesettings", 0).getBoolean("ShowDebug", false);
    }

    public final boolean g(Context context0) {
        return cchj.b(context0).q("com.google", "com.google.android.gms").length > 0;
    }

    public final boolean h(Context context0) {
        return bbmn.r(context0);
    }

    public final boolean i(GoogleSettingsItem googleSettingsItem0, Context context0) {
        return this.j(googleSettingsItem0, context0, true);
    }

    public final boolean j(GoogleSettingsItem googleSettingsItem0, Context context0, boolean z) {
        boolean z1 = this.g(context0);
        boolean z2 = bbmn.r(context0);
        if(googleSettingsItem0.e && !z1 && !googleSettingsItem0.g) {
            return false;
        }
        if(googleSettingsItem0.f && !z2 && !googleSettingsItem0.g) {
            return false;
        }
        return googleSettingsItem0.b == 2 ? !z || this.f(context0) : googleSettingsItem0.b != 3 || Settings.Global.getInt(context0.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    public final boolean k(Context context0) {
        return bbnp.i(context0) ? false : bbnp.k(context0) || bbnp.n(context0) || bbnp.e(context0);
    }

    public final boolean l(Context context0) {
        return !bbnp.e(context0);
    }

    public final boolean m(Context context0) {
        hryn hryn0 = hryn.a;
        if(!hryn0.b().d()) {
            return false;
        }
        hrxq.d();
        return hrxq.c() ? false : hryn0.b().e() || this.a().resolveActivity(context0.getPackageManager()) != null;
    }
}

