import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import com.google.android.gms.wearable.backup.phone.BackupSettingsChimeraActivity;
import j..util.Optional;

public final class fchp implements Runnable {
    public final BackupSettingsChimeraActivity a;
    public final fext b;

    public fchp(BackupSettingsChimeraActivity backupSettingsChimeraActivity0, fext fext0) {
        this.a = backupSettingsChimeraActivity0;
        this.b = fext0;
    }

    @Override
    public final void run() {
        BackupSettingsChimeraActivity backupSettingsChimeraActivity0 = this.a;
        fext fext0 = this.b;
        if(fext0.c && (fext0.b & 2) != 0) {
            ((FrameLayout)backupSettingsChimeraActivity0.findViewById(0x7F0B0C43)).setOnClickListener(new fchz(backupSettingsChimeraActivity0));  // id:back_icon_container
            LinearLayout linearLayout0 = (LinearLayout)backupSettingsChimeraActivity0.findViewById(0x7F0B1649);  // id:header
            fczo.h(linearLayout0, backupSettingsChimeraActivity0.x, new TextView[]{((TextView)linearLayout0.findViewById(0x7F0B22B8))});  // id:title
            backupSettingsChimeraActivity0.findViewById(0x7F0B2093).setVisibility(8);  // id:spinner
            backupSettingsChimeraActivity0.findViewById(0x7F0B188A).setVisibility(0);  // id:main_content
            fexr fexr0 = fext0.e == null ? fexr.a : fext0.e;
            baun baun0 = BackupSettingsChimeraActivity.j;
            baun0.j("Showing backup settings UI for account %s", new Object[]{baun.q(fexr0.c)});
            ((TextView)backupSettingsChimeraActivity0.findViewById(0x7F0B0A96)).setText(fexr0.c);  // id:account_storage_email
            ((ConstraintLayout)backupSettingsChimeraActivity0.findViewById(0x7F0B0A99)).setOnClickListener(new fcib(backupSettingsChimeraActivity0, fext0, fexr0));  // id:account_storage_picker_section
            backupSettingsChimeraActivity0.w = (ConstraintLayout)backupSettingsChimeraActivity0.findViewById(0x7F0B0CA5);  // id:bbg1_switch_section
            backupSettingsChimeraActivity0.w.setAccessibilityDelegate(new fciw(backupSettingsChimeraActivity0));
            backupSettingsChimeraActivity0.w.setOnClickListener(new fcic(backupSettingsChimeraActivity0));
            evql evql0 = backupSettingsChimeraActivity0.t.f(backupSettingsChimeraActivity0.r, fexr0.c);
            evql0.b(new fcid(backupSettingsChimeraActivity0));
            evql0.A(new fcie());
            backupSettingsChimeraActivity0.a(Optional.empty());
            evql evql1 = backupSettingsChimeraActivity0.t.e(backupSettingsChimeraActivity0.r);
            evql1.b(new fcif(backupSettingsChimeraActivity0));
            evql1.A(new fcig(backupSettingsChimeraActivity0));
            String s = hqil.l();
            if(hzyp.d() && s != null && !s.isEmpty()) {
                View view0 = backupSettingsChimeraActivity0.findViewById(0x7F0B189B);  // id:manage_storage_button
                view0.setVisibility(0);
                view0.setOnClickListener(new fcih(backupSettingsChimeraActivity0, s));
            }
            String s1 = fexr0.c;
            if(!hzyp.d()) {
                baun0.j("Exiting configureBackupNow backupSettingsRevampEnabled is disabled", new Object[0]);
                return;
            }
            View view1 = backupSettingsChimeraActivity0.findViewById(0x7F0B0C67);  // id:backup_now_button
            view1.setVisibility(0);
            fchr fchr0 = new fchr(backupSettingsChimeraActivity0, s1);
            view1.setOnClickListener(new fchs(backupSettingsChimeraActivity0, view1, ((fcjs)BackupSettingsChimeraActivity.q.orElseGet(fchr0))));
            return;
        }
        BackupSettingsChimeraActivity.j.j("Backup not enabled, opening backup opt-in screen", new Object[0]);
        backupSettingsChimeraActivity0.startActivity(BackupOptInChimeraActivity.a(backupSettingsChimeraActivity0.r, null, fext0, backupSettingsChimeraActivity0.y));
        backupSettingsChimeraActivity0.finish();
    }
}

