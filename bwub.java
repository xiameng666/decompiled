import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;

public final class bwub {
    public final bxax a;
    public final Context b;
    public final PackageManager c;
    public final bwmm d;

    public bwub(bxax bxax0, Context context0, PackageManager packageManager0, bwmm bwmm0) {
        this.a = bxax0;
        this.b = context0;
        this.c = packageManager0;
        this.d = bwmm0;
    }

    final kau a(String s) {
        try {
            PackageInfo packageInfo0 = this.c.getPackageInfo(s, 0x40);
            if(packageInfo0 != null) {
                String s1 = bbmq.t(packageInfo0);
                if(s1 == null) {
                    s1 = "";
                }
                return new kau(((int)packageInfo0.versionCode), s1);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return new kau(((int)0), "");
    }

    final boolean b(String s) {
        return azql.c(this.b).g(s);
    }

    final boolean c() {
        return this.b("com.google.android.googlequicksearchbox");
    }

    public static final boolean d() {
        return !hubu.a.b().l();
    }
}

