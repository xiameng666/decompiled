import android.content.Intent;
import com.google.android.gms.wearable.backup.wear.KeyRecoveryChimeraActivity;
import com.google.android.gms.wearable.backup.wear.WearBackupDialogChimeraActivity;

public final class fcpb implements Runnable {
    public final fcpc a;

    public fcpb(fcpc fcpc0) {
        this.a = fcpc0;
    }

    @Override
    public final void run() {
        KeyRecoveryChimeraActivity keyRecoveryChimeraActivity0 = this.a.b;
        if(bbqa.a()) {
            Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupComposeDialogActivity").putExtra("dialog_label", "This backup is permanently deleted");
            ibuq.e(intent0, "putExtra(...)");
            keyRecoveryChimeraActivity0.startActivity(intent0);
        }
        else {
            keyRecoveryChimeraActivity0.startActivity(WearBackupDialogChimeraActivity.a("This backup is permanently deleted"));
        }
        keyRecoveryChimeraActivity0.finish();
    }
}

