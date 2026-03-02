import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;

public final class fchj implements View.OnClickListener {
    public final BackupOptInChimeraActivity a;

    public fchj(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.s.d(this.a.q, gico.m);
        this.a.finish();
    }
}

