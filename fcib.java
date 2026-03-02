import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fcib implements View.OnClickListener {
    public final BackupSettingsChimeraActivity a;
    public final fext b;
    public final fexr c;

    public fcib(BackupSettingsChimeraActivity backupSettingsChimeraActivity0, fext fext0, fexr fexr0) {
        this.a = backupSettingsChimeraActivity0;
        this.b = fext0;
        this.c = fexr0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fcgp.a(this.a.getContainerActivity(), this.b.d, this.a.v, new fchv(this.a, this.c, this.b), this.a.x);
    }
}

