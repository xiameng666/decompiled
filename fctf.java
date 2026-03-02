import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInChimeraActivity;

public final class fctf implements View.OnClickListener {
    public final WearBackupOptInChimeraActivity a;
    public final fext b;

    public fctf(WearBackupOptInChimeraActivity wearBackupOptInChimeraActivity0, fext fext0) {
        this.a = wearBackupOptInChimeraActivity0;
        this.b = fext0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        acp acp0 = this.a.p;
        gftb.check(acp0);
        acp0.b(this.b);
    }
}

