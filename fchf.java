import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import java.util.List;

public final class fchf implements View.OnClickListener {
    public final BackupOptInChimeraActivity a;
    public final List b;
    public final fext c;

    public fchf(BackupOptInChimeraActivity backupOptInChimeraActivity0, List list0, fext fext0) {
        this.a = backupOptInChimeraActivity0;
        this.b = list0;
        this.c = fext0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.a.getContainerActivity();
        fcfy fcfy0 = this.a.u;
        fchl fchl0 = new fchl(this.a, this.c);
        fcgp.a(activity0, this.b, fcfy0, fchl0, this.a.w);
    }
}

