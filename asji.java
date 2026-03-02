import android.accounts.Account;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;
import j..util.Objects;

final class asji extends clil {
    final Account a;
    final SetBackupAccountFlowChimeraActivity b;

    public asji(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(setBackupAccountFlowChimeraActivity0);
        this.b = setBackupAccountFlowChimeraActivity0;
        super("backup");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        aqgn aqgn0;
        if(iBinder0 == null) {
            aqgn0 = null;
        }
        else {
            try {
                try {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                    aqgn0 = (iInterface0 instanceof aqgn) ? ((aqgn)iInterface0) : new aqgl(iBinder0);
                label_8:
                    aqgn0.b(this.a);
                    goto label_24;
                }
                catch(RemoteException remoteException0) {
                }
                SetBackupAccountFlowChimeraActivity.j.n("Failed to set backup account!", remoteException0, new Object[0]);
                goto label_12;
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
        }
        goto label_8;
        try {
        label_12:
            bbic.a().b(this.b, this);
        }
        catch(IllegalArgumentException | IllegalStateException exception0) {
            SetBackupAccountFlowChimeraActivity.j.n("Exception when unbinding: ", exception0, new Object[0]);
        }
        goto label_28;
        try {
        label_18:
            bbic.a().b(this.b, this);
        }
        catch(IllegalArgumentException | IllegalStateException exception1) {
            SetBackupAccountFlowChimeraActivity.j.n("Exception when unbinding: ", exception1, new Object[0]);
        }
        this.b.f(this.a.name);
        throw throwable0;
        try {
        label_24:
            bbic.a().b(this.b, this);
        }
        catch(IllegalArgumentException | IllegalStateException exception2) {
            SetBackupAccountFlowChimeraActivity.j.n("Exception when unbinding: ", exception2, new Object[0]);
        }
    label_28:
        this.b.f(this.a.name);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        SetBackupAccountFlowChimeraActivity.j.f("BackupAccountManagerService disconnected.", new Object[0]);
        this.b.finishAndRemoveTask();
    }
}

