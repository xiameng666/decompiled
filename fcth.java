import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;

public final class fcth implements View.OnClickListener {
    public final WearBackupOptInChimeraActivity a;
    public final long b;

    public fcth(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0, long v) {
        this.a = wearBackupOptInChimeraActivity0;
        this.b = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Intent intent0 = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.WearBackupLearnMoreActivity").putExtra("total_quota_bytes", this.b);
        this.a.startActivity(intent0);
    }
}

