import android.accounts.Account;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.backup.settings.devicedata.BackupSettingsDeviceDataFragment;

public final class asjr implements acn {
    public final BackupSettingsDeviceDataFragment a;

    public asjr(BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0) {
        this.a = backupSettingsDeviceDataFragment0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        Intent intent0 = ((ActivityResult)object0).b;
        Account account0 = intent0 == null ? null : ((Account)jwh.a(intent0, "account", Account.class));
        BackupSettingsDeviceDataFragment backupSettingsDeviceDataFragment0 = this.a;
        if(account0 == null) {
            backupSettingsDeviceDataFragment0.Q().a(0x406FD, new aspq());
        }
        else {
            backupSettingsDeviceDataFragment0.Q().a(0x406FD, new asps());
        }
        askr askr0 = backupSettingsDeviceDataFragment0.N();
        askl askl0 = new askl(account0, askr0, null);
        icbb.b(askr0.f, null, null, askl0, 3);
    }
}

