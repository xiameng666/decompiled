import android.accounts.Account;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.backup.settings.component.AutoValue_PhotosEnablementSnackbarInfo;
import j..util.Objects;

final class asir implements aqzl {
    final asit a;

    public asir(asit asit0) {
        Objects.requireNonNull(asit0);
        this.a = asit0;
        super();
    }

    @Override  // aqzl
    public final Object a() {
        asit asit0 = this.a;
        Account account0 = asit0.d;
        boolean z = false;
        asit0.a.j("Calling photosBackupDataFlavorHandler.enableBackup for " + account0.toString(), new Object[0]);
        asit0.c.h(6);
        aqnk aqnk0 = asit0.e;
        try {
            z = aqnk0.b.getApplicationInfo("com.google.android.apps.photos", 0).enabled;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        gftb.q(z);
        return Boolean.valueOf(aqnk0.a.e(account0.name, asit0.b));
    }

    @Override  // aqzl
    public final void b(Object object0) {
        asit asit0 = this.a;
        asit0.k = true;
        if(!((Boolean)object0).booleanValue()) {
            asit0.a.j("Enabling backup failed in PhotosEnablementController#enableBackupAndMaybeAskForPermissions", new Object[0]);
            asit0.e(new AutoValue_PhotosEnablementSnackbarInfo(false, null, null, null));
        }
    }
}

