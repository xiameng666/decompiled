import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;

public final class aqzc {
    public static final int a;
    private static final baun b;

    static {
        aqzc.b = aqql.a("IntentUtil");
    }

    public static Intent a(Context context0, giah giah0) {
        Intent intent0 = aqzc.g();
        fpxr.c(intent0, giah0);
        return fpxs.a(context0, intent0, hqil.a.j().E());
    }

    public static Intent b(Context context0, boolean z) {
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.backup.base.BackupAccountNotifierIntentOperation", "com.google.android.gms.backup.BACKUP_ACCOUNT_NEEDED_NOTIFICATION");
        intent0.putExtra("notify", z);
        return intent0;
    }

    public static Intent c() {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.backup.ACTION_BBG1_BACKUP_OPT_IN");
        intent0.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
        intent0.putExtra("showPhotosOptIn", true);
        return intent0;
    }

    public static Intent d() {
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.gms", "com.google.android.gms.backup.extension.download.ui.CustomBackupDownloadActivity");
        return intent0;
    }

    public static Intent e(Context context0) {
        return aqzc.b(context0, true);
    }

    public static Intent f(PackageManager packageManager0, boolean z) {
        Intent intent0 = new Intent();
        intent0.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.EnhancedBackupOptInActivity");
        hqlb hqlb0 = hqlb.a;
        if(!hqlb0.e().l()) {
            aqzc.b.d("Revamped opt-in screen flag off.", new Object[0]);
            return intent0;
        }
        if(z) {
            aqzc.b.d("Missing dolly (or other) consent.", new Object[0]);
            return intent0;
        }
        if(!fpwo.g(packageManager0, ((gful_cronetEngineProvider)new aqza())).f()) {
            aqzc.b.d("Restore doesAppHaveTheRequiredVersion = false.", new Object[0]);
            return intent0;
        }
        fpwn fpwn0 = new fpwn(packageManager0, ((gful_cronetEngineProvider)new aqsj()));
        int v = 1;
        int v1 = fpwn0.f() || fpwn0.c() == fpwl.b || fpwn0.c() == fpwl.c ? 1 : 0;
        if(hqlb0.e().y()) {
            if(fpwn0.c() != fpwl.f) {
                v = 0;
            }
            v1 |= v;
        }
        baun baun0 = aqzc.b;
        baun0.d("photosApkOkForNewOptIn: %s", new Object[]{Boolean.valueOf(((boolean)v1))});
        if(v1) {
            Intent intent1 = new Intent(hqlb.f()).setPackage("com.google.android.apps.restore");
            if(intent1.resolveActivity(packageManager0) != null) {
                return intent1;
            }
            baun0.d("Revamped opt-in screen intent doesn\'t resolve.", new Object[0]);
        }
        return intent0;
    }

    public static Intent g() {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.backup.ACTION_BACKUP_SETTINGS");
        intent0.putExtra("hide_reset", true);
        intent0.setClassName("com.google.android.gms", (hqlh.c() ? "com.google.android.gms.backup.component.BackupSettingsCollapsingActivity" : "com.google.android.gms.backup.component.BackupSettingsActivity"));
        return intent0;
    }

    public static Intent h(String s) {
        Intent intent0 = aqzc.g();
        if(s != null) {
            intent0.putExtra("scrollPreferenceKey", s);
        }
        fpxr.c(intent0, giah.f);
        return intent0;
    }

    public static Intent i(giah giah0) {
        Intent intent0 = aqzc.g();
        fpxr.c(intent0, giah0);
        return intent0;
    }
}

