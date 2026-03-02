import android.content.Intent;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;

public final class fctm implements acn {
    public final WearBackupOptInChimeraActivity a;

    public fctm(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0) {
        this.a = wearBackupOptInChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            WearBackupOptInChimeraActivity.j.j("User chose to add account, launching add account activity", new Object[0]);
            acp acp0 = wearBackupOptInChimeraActivity0.o;
            gftb.check(acp0);
            acp0.b(new Intent("com.google.android.clockwork.home.accounts.ADD_ACCOUNTS").setClassName("com.google.android.wearable.app", "com.google.android.clockwork.home.accounts.AddAccountActivity"));
            return;
        }
        WearBackupOptInChimeraActivity.j.j("User chose not to add account, finishing backup opt-in for no account", new Object[0]);
        wearBackupOptInChimeraActivity0.finish();
    }
}

