import android.app.backup.BackupManager;
import android.provider.Settings.Secure;
import j..util.Objects;

final class epdx extends bbln {
    final boolean a;
    final epdy b;

    public epdx(epdy epdy0, boolean z) {
        this.a = z;
        Objects.requireNonNull(epdy0);
        this.b = epdy0;
        super(10);
    }

    @Override
    public final void run() {
        boolean z = hyco.a.b().a();
        epdy epdy0 = this.b;
        boolean z1 = this.a;
        if(z) {
            try {
                new BackupManager(epdy0.d).setBackupEnabled(z1);
            }
            catch(SecurityException securityException0) {
                a.e(epdy.a.j(), "Could not enable backup %s", securityException0.getMessage(), securityException0);
            }
        }
        else {
            epdy0.f(z1);
        }
        boolean z2 = this.a;
        if(z2) {
            new aqee(this.b.d).c(this.b.c);
        }
        Settings.Secure.putInt(this.b.d.getContentResolver(), "mms_backup_enabled", (z2 ? 1 : 2));
    }
}

