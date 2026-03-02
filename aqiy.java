import android.accounts.Account;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

public final class aqiy implements Runnable {
    public final SetBackupAccountChimeraActivity a;
    public final Account b;

    public aqiy(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0, Account account0) {
        this.a = setBackupAccountChimeraActivity0;
        this.b = account0;
    }

    @Override
    public final void run() {
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0 = this.a;
        boolean z = setBackupAccountChimeraActivity0.getLifecycle().a().a(lpf.d);
        Account account0 = this.b;
        if(z) {
            setBackupAccountChimeraActivity0.h(account0);
            return;
        }
        setBackupAccountChimeraActivity0.k.set(account0);
    }
}

