import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;

public final class ekpv {
    public final Context a;
    private volatile Boolean b;
    private volatile Boolean c;

    public ekpv(Context context0) {
        this.b = null;
        this.c = null;
        this.a = context0;
    }

    public static void a(Context context0, String s, int v) {
        Settings.Global.putInt(context0.getContentResolver(), s, v);
    }

    public final void b(boolean z) {
        int v = -1;
        if(this.g()) {
            if(!this.n()) {
                return;
            }
            if(z) {
                v = 1;
            }
            ekpv.m(this.a, true);
            Settings.Global.putInt(this.a.getContentResolver(), "package_verifier_user_consent", v);
            return;
        }
        if(this.h()) {
            if(z) {
                v = 1;
            }
            ekpv.m(this.a, true);
            Settings.Secure.putInt(this.a.getContentResolver(), "package_verifier_user_consent", v);
            return;
        }
        ekpv.m(this.a, z);
    }

    public final boolean c() {
        return this.h() || this.g() ? this.j() : ekpv.d(this.a);
    }

    public static boolean d(Context context0) {
        return ekpv.l(context0, "package_verifier_enable", 1) == 1;
    }

    public static boolean e(Context context0) {
        return ekpv.l(context0, "upload_apk_enable", 0) == 1;
    }

    public final boolean f() {
        if(this.g()) {
            Context context0 = this.a;
            if(!this.k(context0)) {
                try {
                    return Settings.Global.getInt(context0.getContentResolver(), "package_verifier_user_consent") == 1;
                }
                catch(Settings.SettingNotFoundException unused_ex) {
                    goto label_7;
                }
            }
            return true;
        }
    label_7:
        if(this.h()) {
            return this.k(this.a) ? true : Settings.Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
        }
        return Settings.Secure.getInt(this.a.getContentResolver(), "package_verifier_user_consent", 0) == 1;
    }

    public final boolean g() {
        synchronized(this) {
            if(this.c == null) {
                PackageManager packageManager0 = this.a.getPackageManager();
                boolean z = false;
                try {
                    PackageInfo packageInfo0 = null;
                    packageInfo0 = packageManager0.getPackageInfo("com.android.vending", 0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                if(packageInfo0 == null) {
                    z = true;
                }
                else if(packageInfo0.versionCode >= 80750000) {
                    z = true;
                }
                this.c = Boolean.valueOf(z);
            }
        }
        return this.c.booleanValue();
    }

    public final boolean h() {
        synchronized(this) {
            if(this.b == null) {
                PackageManager packageManager0 = this.a.getPackageManager();
                boolean z = false;
                try {
                    PackageInfo packageInfo0 = null;
                    packageInfo0 = packageManager0.getPackageInfo("com.android.vending", 0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                if(packageInfo0 == null) {
                    z = true;
                }
                else if(packageInfo0.versionCode >= 80440000) {
                    z = true;
                }
                this.b = Boolean.valueOf(z);
            }
        }
        return this.b.booleanValue();
    }

    public final boolean i() {
        return this.k(this.a) ? false : !this.g() || this.n();
    }

    public final boolean j() {
        if(this.g()) {
            return this.f();
        }
        return this.h() ? this.f() : this.f() && ekpv.d(this.a);
    }

    public final boolean k(Context context0) {
        return this.g() ? ekpv.o(context0) : ekpv.o(context0);
    }

    private static int l(Context context0, String s, int v) {
        return Settings.Global.getInt(context0.getContentResolver(), s, v);
    }

    private static void m(Context context0, boolean z) {
        ekpv.a(context0, "package_verifier_enable", ((int)z));
    }

    private final boolean n() {
        UserManager userManager0 = (UserManager)this.a.getSystemService("user");
        if(userManager0 != null) {
            Class class0 = userManager0.getClass();
            try {
                class0.getMethod("getUsers", null);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            if(class0 != null) {
                try {
                    class0.getMethod("getSerialNumbersOfUsers", Boolean.TYPE);
                }
                catch(NoSuchMethodException unused_ex) {
                }
            }
            try {
                UserHandle.class.getMethod("isOwner", null);
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }
        return userManager0 == null ? true : userManager0.isSystemUser();
    }

    private static boolean o(Context context0) {
        UserManager userManager0 = (UserManager)context0.getSystemService("user");
        return userManager0 != null && userManager0.hasUserRestriction("ensure_verify_apps");
    }
}

