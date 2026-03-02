import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;

public final class fchs implements View.OnClickListener {
    public final BackupSettingsChimeraActivity a;
    public final View b;
    public final fcjs c;

    public fchs(BackupSettingsChimeraActivity backupSettingsChimeraActivity0, View view0, fcjs fcjs0) {
        this.a = backupSettingsChimeraActivity0;
        this.b = view0;
        this.c = fcjs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BackupSettingsChimeraActivity.j.j("Trying to backup now.", new Object[0]);
        this.b.setEnabled(false);
        evql evql0 = this.c.e();
        fcia fcia0 = new fcia();
        evql0.x(this.a, fcia0);
        fcil fcil0 = new fcil(this.a);
        evql0.u(this.a, fcil0);
        fcip fcip0 = new fcip(this.b);
        evql0.r(this.a, fcip0);
    }
}

