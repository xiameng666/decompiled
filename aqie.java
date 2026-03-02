import android.accounts.Account;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.base.BackupAccountManagerChimeraService;
import j..util.Objects;

public final class aqie extends aqgm {
    final BackupAccountManagerChimeraService a;

    public aqie(BackupAccountManagerChimeraService backupAccountManagerChimeraService0) {
        Objects.requireNonNull(backupAccountManagerChimeraService0);
        this.a = backupAccountManagerChimeraService0;
        super();
    }

    @Override  // aqgn
    public final Account a() {
        aqql aqql0;
        aqgn aqgn0;
        azox azox0;
        Intent intent0;
        Account account0;
        try {
            try {
                account0 = null;
                azql.c(this.a).e(Binder.getCallingUid());
            }
            catch(SecurityException securityException0) {
                BackupAccountManagerChimeraService.b.g("Security Exception in getBackupAccount", securityException0, new Object[0]);
                return null;
            }
            intent0 = BackupAccountManagerChimeraService.a();
            if(intent0 == null) {
                BackupAccountManagerChimeraService.b.m("Could not resolve service intent!", new Object[0]);
                return null;
            }
            azox0 = new azox();
        }
        catch(Exception exception0) {
            goto label_43;
        }
        try {
            try {
                bbic.a().d(this.a, intent0, azox0, 1);
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    aqgn0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                    aqgn0 = (iInterface0 instanceof aqgn) ? ((aqgn)iInterface0) : new aqgl(iBinder0);
                }
                account0 = aqgn0.a();
                goto label_36;
            }
            catch(InterruptedException | RemoteException exception1) {
            }
            BackupAccountManagerChimeraService.b.l(exception1);
        }
        catch(Throwable throwable0) {
            goto label_31;
        }
        try {
            try {
                bbic.a().b(this.a, azox0);
                return null;
            }
            catch(IllegalArgumentException | IllegalStateException exception2) {
                aqql0 = BackupAccountManagerChimeraService.b;
                aqql0.l(exception2);
                return account0;
            }
            try {
            label_31:
                bbic.a().b(this.a, azox0);
            }
            catch(IllegalArgumentException | IllegalStateException exception3) {
                BackupAccountManagerChimeraService.b.l(exception3);
            }
            throw throwable0;
            try {
            label_36:
                bbic.a().b(this.a, azox0);
                return account0;
            }
            catch(IllegalArgumentException | IllegalStateException exception2) {
                aqql0 = BackupAccountManagerChimeraService.b;
            }
            aqql0.l(exception2);
            return account0;
        }
        catch(Exception exception0) {
        label_43:
            long v = hqhn.c();
            aqqo.a(BackupAccountManagerChimeraService.a, exception0, v);
            throw exception0;
        }
    }

    @Override  // aqgn
    public final void b(Account account0) {
        aqgn aqgn0;
        try {
            azql.c(this.a).e(Binder.getCallingUid());
        }
        catch(SecurityException securityException0) {
            BackupAccountManagerChimeraService.b.g("Security Exception in setBackupAccount", securityException0, new Object[0]);
            return;
        }
        Intent intent0 = BackupAccountManagerChimeraService.a();
        if(intent0 == null) {
            BackupAccountManagerChimeraService.b.m("Could not resolve service intent!", new Object[0]);
            return;
        }
        azox azox0 = new azox();
        try {
            try {
                bbic.a().d(this.a, intent0, azox0, 1);
                IBinder iBinder0 = azox0.a();
                if(iBinder0 == null) {
                    aqgn0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                    aqgn0 = (iInterface0 instanceof aqgn) ? ((aqgn)iInterface0) : new aqgl(iBinder0);
                }
                aqgn0.b(account0);
                goto label_35;
            }
            catch(InterruptedException | RemoteException exception0) {
            }
            BackupAccountManagerChimeraService.b.l(exception0);
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
            bbic.a().b(this.a, azox0);
        }
        catch(IllegalArgumentException | IllegalStateException exception1) {
            BackupAccountManagerChimeraService.b.l(exception1);
        }
        return;
        try {
        label_30:
            bbic.a().b(this.a, azox0);
        }
        catch(IllegalArgumentException | IllegalStateException exception2) {
            BackupAccountManagerChimeraService.b.l(exception2);
        }
        throw throwable0;
        try {
        label_35:
            bbic.a().b(this.a, azox0);
        }
        catch(IllegalArgumentException | IllegalStateException exception3) {
            BackupAccountManagerChimeraService.b.l(exception3);
        }
    }

    @Override  // aqgn
    public final boolean c() {
        aqgn aqgn0;
        boolean z = true;
        try {
            azql.c(this.a).e(Binder.getCallingUid());
        }
        catch(SecurityException securityException0) {
            BackupAccountManagerChimeraService.b.g("Security Exception in setBackupAccount", securityException0, new Object[0]);
            return true;
        }
        Intent intent0 = BackupAccountManagerChimeraService.a();
        if(intent0 == null) {
            BackupAccountManagerChimeraService.b.m("Could not resolve service intent!", new Object[0]);
            return true;
        }
        azox azox0 = new azox();
        try {
            bbic.a().d(this.a, intent0, azox0, 1);
            IBinder iBinder0 = azox0.a();
            if(iBinder0 == null) {
                aqgn0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                aqgn0 = (iInterface0 instanceof aqgn) ? ((aqgn)iInterface0) : new aqgl(iBinder0);
            }
            z = aqgn0.c();
        }
        catch(InterruptedException | RemoteException exception0) {
            BackupAccountManagerChimeraService.b.l(exception0);
        }
        finally {
            try {
                bbic.a().b(this.a, azox0);
            }
            catch(IllegalArgumentException | IllegalStateException exception1) {
                BackupAccountManagerChimeraService.b.l(exception1);
            }
        }
        return z;
    }
}

