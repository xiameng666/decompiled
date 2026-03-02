import android.content.Intent;
import com.google.android.gms.wearable.backup.wear.WearBackupComposeConfirmationChimeraActivity;

public final class fcsn implements ibth {
    public final WearBackupComposeConfirmationChimeraActivity a;

    public fcsn(WearBackupComposeConfirmationChimeraActivity wearBackupComposeConfirmationChimeraActivity0) {
        this.a = wearBackupComposeConfirmationChimeraActivity0;
    }

    @Override  // ibth
    public final Object a() {
        Intent intent0 = new Intent().putExtra("confirm_pressed", true);
        ibuq.e(intent0, "putExtra(...)");
        this.a.setResult(-1, intent0);
        this.a.finish();
        return ibom.a;
    }
}

