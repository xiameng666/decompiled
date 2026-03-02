import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.gms.wearable.backup.wear.LoadableTextView;
import com.google.android.gms.wearable.backup.wear.WearBackupSettingsChimeraActivity;
import j..util.Objects;

public final class fcuv implements gmbg {
    final WearBackupSettingsChimeraActivity a;

    public fcuv(WearBackupSettingsChimeraActivity wearBackupSettingsChimeraActivity0) {
        Objects.requireNonNull(wearBackupSettingsChimeraActivity0);
        this.a = wearBackupSettingsChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        WearBackupSettingsChimeraActivity.j.n("Failed to fetch storage quota", throwable0, new Object[0]);
        this.a.findViewById(0x7F0B0C70).setVisibility(8);  // id:backup_quota_progress_bar
        ((LoadableTextView)this.a.findViewById(0x7F0B0C71)).a(0x7F1504FB);  // id:backup_quota_text
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.y = (fexu)object0;
        this.a.c();
        fexu fexu0 = this.a.y;
        gftb.check(fexu0);
        long v = fexu0.d;
        long v1 = fexu0.c;
        LoadableTextView loadableTextView0 = (LoadableTextView)this.a.findViewById(0x7F0B0C71);  // id:backup_quota_text
        Object[] arr_object = {fcgd.a(this.a, v), fcgd.b(this.a, v1)};
        loadableTextView0.b(this.a.getString(0x7F1504B5, arr_object));  // string:backup_quota_label "%1$s of %2$s used"
        ((ProgressBar)this.a.findViewById(0x7F0B0C70)).setProgress(((int)(((double)v) / ((double)v1) * 100.0)));  // id:backup_quota_progress_bar
        ((LinearLayout)this.a.findViewById(0x7F0B0C6F)).setFocusable(true);  // id:backup_quota_group
    }
}

