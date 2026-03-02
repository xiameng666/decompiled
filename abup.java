import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.provider.Settings.Global;
import android.text.TextUtils;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public final class abup {
    public final GoogleSettingsItem a;
    public String b;
    public String c;
    public String d;
    boolean e;
    private static final bboh f;
    private final Context g;

    static {
        abup.f = bboh.b("IndexableItem", bbcu.dH);
    }

    public abup(Context context0, GoogleSettingsItem googleSettingsItem0) {
        this.e = true;
        this.g = context0;
        batl.s(googleSettingsItem0);
        this.a = googleSettingsItem0;
        Intent intent0 = googleSettingsItem0.a;
        if(intent0 == null) {
            ((ggtj)abup.f.j()).x("intent is null");
            this.e = false;
            return;
        }
        PackageManager packageManager0 = context0.getPackageManager();
        if(packageManager0 == null) {
            ((ggtj)abup.f.j()).x("pm is null");
            this.e = false;
            return;
        }
        ActivityInfo activityInfo0 = intent0.resolveActivityInfo(packageManager0, 0);
        if(activityInfo0 == null) {
            ((ggtj)abup.f.j()).x("info is null");
            this.e = false;
            return;
        }
        if(!activityInfo0.exported) {
            ((ggtj)abup.f.i()).R("target is not exported: %s, title:%s", intent0, googleSettingsItem0.c);
            this.e = false;
            return;
        }
        this.c = activityInfo0.packageName;
        String s = intent0.getAction();
        if(s != null) {
            this.b = s;
        }
        if(this.b == null) {
            this.b = "android.intent.action.MAIN";
        }
        ComponentName componentName0 = intent0.getComponent();
        if(componentName0 != null) {
            this.d = componentName0.getClassName();
        }
        if(this.c == null) {
            this.e = false;
            ((ggtj)abup.f.i()).B("targetPackageName is null:%s", googleSettingsItem0.a);
        }
    }

    public final String a() {
        GoogleSettingsItem googleSettingsItem0 = this.a;
        String s = googleSettingsItem0.m;
        if(!TextUtils.isEmpty(s)) {
            return s;
        }
        ((ggtj)abup.f.j()).B("indexing key is not set:%s", googleSettingsItem0.a);
        return this.b();
    }

    public final String b() {
        String s = this.a.c;
        batl.s(s);
        return s;
    }

    public final boolean c() {
        return this.e && (this.a.l && (this.a.b != 2 && (!this.a.e || bbmn.q(this.g) || this.a.g) && (!this.a.f || bbmn.r(this.g) || this.a.g) && (this.a.b != 3 || Settings.Global.getInt(this.g.getContentResolver(), "development_settings_enabled", 0) != 0)));
    }
}

