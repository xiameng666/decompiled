import android.text.format.DateUtils;
import com.google.android.gms.wearable.backup.wear.LoadableTextView;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import j..util.Objects;
import java.util.concurrent.TimeUnit;

public final class fcuw implements gmbg {
    final WearBackupSettingsChimeraActivity a;

    public fcuw(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        Objects.requireNonNull(wearBackupSettingsChimeraActivity0);
        this.a = wearBackupSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        WearBackupSettingsChimeraActivity.j.n("Failed to fetch backup size and time stats", throwable0, new Object[0]);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0 = this.a;
        wearBackupSettingsChimeraActivity0.x = (fexq)object0;
        wearBackupSettingsChimeraActivity0.c();
        hfwn hfwn0 = ((fexq)object0).f;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        long v = hfyn.b(hfwn0);
        long v1 = wearBackupSettingsChimeraActivity0.t.a();
        boolean z = WearBackupSettingsChimeraActivity.i(((fexq)object0));
        boolean z1 = z && v1 - v > TimeUnit.SECONDS.toMillis(hzub.c());
        WearBackupSettingsChimeraActivity.j.j("Showing backup settings text for: hasBackup=%s backupTooOld=%s", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z1)});
        LoadableTextView loadableTextView0 = (LoadableTextView)wearBackupSettingsChimeraActivity0.findViewById(0x7F0B22CD);  // id:title_text
        LoadableTextView loadableTextView1 = (LoadableTextView)wearBackupSettingsChimeraActivity0.findViewById(0x7F0B212A);  // id:subtitle_last_backup_time
        if(z) {
            loadableTextView0.a(0x7F1535F5);  // string:wear_backup_settings_title_has_backup "Backed up"
            loadableTextView1.b(DateUtils.getRelativeTimeSpanString(Math.min(v, v1), v1, 60000L, 0x40000));
        }
        else {
            loadableTextView0.a(0x7F1535F6);  // string:wear_backup_settings_title_no_backup "Backup starts when watch is charging 
                                              // and Wi-Fi is available"
            loadableTextView1.setVisibility(8);
        }
        long v2 = WearBackupSettingsChimeraActivity.a(((fexq)object0));
        LoadableTextView loadableTextView2 = (LoadableTextView)wearBackupSettingsChimeraActivity0.findViewById(0x7F0B0C7E);  // id:backup_size_text
        CharSequence charSequence0 = v2 == 0L ? wearBackupSettingsChimeraActivity0.getText(0x7F1535F2) : fcgd.b(wearBackupSettingsChimeraActivity0, v2);  // string:wear_backup_settings_backup_size_unknown "Determined after first backup"
        loadableTextView2.b(charSequence0);
    }
}

