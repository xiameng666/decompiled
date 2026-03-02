import android.app.backup.BackupManager;
import android.app.backup.BackupManagerMonitor;
import android.app.backup.BackupObserver;
import android.app.backup.RestoreSession;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserHandle;

public final class aqjk implements fhan {
    public final BackupManager a;
    long b;
    private static final bboh c;
    private final Context d;
    private final baun e;
    private final Object f;
    private boolean g;

    static {
        aqjk.c = bboh.b("BackupManagerWrapper", bbcu.dF);
    }

    public aqjk(Context context0) {
        BackupManager backupManager0 = new BackupManager(context0);
        baun baun0 = aqql.a("BackupManagerWrapper");
        super();
        this.d = context0;
        this.a = backupManager0;
        this.e = baun0;
        this.f = new Object();
        this.g = false;
        this.b = 0L;
        fhag.a(fhao.a(), this);
    }

    public final int a(String[] arr_s, BackupObserver backupObserver0, BackupManagerMonitor backupManagerMonitor0, int v) {
        return this.g() ? this.a.requestBackup(arr_s, backupObserver0, backupManagerMonitor0, v) : -1;
    }

    public final long b(String s) {
        return this.g() ? this.a.getAvailableRestoreToken(s) : 0L;
    }

    public final RestoreSession c() {
        return this.g() ? this.a.beginRestoreSession() : null;
    }

    public final String d() {
        return this.g() ? this.a.getCurrentTransport() : null;
    }

    public final void e() {
        if(!this.g()) {
            return;
        }
        this.a.cancelBackups();
    }

    public final void f(boolean z) {
        if(!this.g()) {
            return;
        }
        this.a.setBackupEnabled(z);
    }

    public final boolean g() {
        if(jwe.a(this.d, "android.permission.BACKUP") != 0) {
            this.e.f("Google Play Services doesn\'t have permission android.permission.BACKUP", new Object[0]);
            return false;
        }
        return true;
    }

    public final boolean h(String s) {
        if(!this.g()) {
            return false;
        }
        try {
            return this.a.isAppEligibleForBackup(s);
        }
        catch(IllegalStateException illegalStateException0) {
            long v = hqhn.c();
            aqqo.b(aqjk.c, illegalStateException0, v, "Failed to check package eligibility");
            return false;
        }
    }

    public final boolean i() {
        return this.g() ? this.a.isBackupEnabled() : false;
    }

    public final boolean j(UserHandle userHandle0) {
        return this.g() ? this.a.isBackupServiceActive(userHandle0) : false;
    }

    @Override  // fhaq
    public final boolean k() {
        if(hqic.a.b().a()) {
            Object object0 = this.f;
            synchronized(object0) {
                if(this.g && System.currentTimeMillis() < this.b) {
                    return true;
                }
                this.g = this.i();
                this.b = System.currentTimeMillis() + 5000L;
            }
            return this.g;
        }
        return true;
    }

    public final void l(ComponentName componentName0, Intent intent0, String s, Intent intent1, String s1) {
        if(!this.g()) {
            return;
        }
        try {
            this.a.updateTransportAttributes(componentName0, "com.google.android.gms/.backup.BackupTransportService", intent0, s, intent1, s1);
        }
        catch(SecurityException securityException0) {
            long v = hqhn.c();
            aqqo.b(aqjk.c, securityException0, v, "SecurityException on updateTransportAttributes");
        }
    }

    @Override  // fhan
    public final int m() {
        return 26;
    }
}

