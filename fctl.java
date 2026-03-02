import androidx.activity.result.ActivityResult;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;

public final class fctl implements acn {
    public final WearBackupOptInChimeraActivity a;

    public fctl(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0) {
        this.a = wearBackupOptInChimeraActivity0;
    }

    @Override  // acn
    public final void jN(Object object0) {
        ActivityResult activityResult0 = (ActivityResult)object0;
        WearBackupOptInChimeraActivity.j.j("User finished add account activity", new Object[0]);
        this.a.s = true;
        this.a.b(null);
    }
}

