import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import java.util.concurrent.TimeUnit;

public final class fchd implements View.OnClickListener {
    public final BackupOptInChimeraActivity a;
    public final Button b;
    public final fexs c;

    public fchd(BackupOptInChimeraActivity backupOptInChimeraActivity0, Button button0, fexs fexs0) {
        this.a = backupOptInChimeraActivity0;
        this.b = button0;
        this.c = fexs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BackupOptInChimeraActivity.j.j("User clicked \'turn on\', enabling backup", new Object[0]);
        this.b.setEnabled(false);
        this.a.v.setClickable(false);
        gmbu.t(gmbt.h(fhra.b(this.a.s.b(this.a.q, this.c.c, BackupOptInChimeraActivity.k))).i(hzub.a.d().e(), TimeUnit.SECONDS, this.a.p), new fcho(this.a, this.c, this.b), new fche(this.a));
    }
}

