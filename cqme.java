import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.gms.mdm.settings.AdmSettingsChimeraActivity;

public final class cqme implements ohj {
    public final cqne a;

    public cqme(cqne cqne0) {
        this.a = cqne0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        Intent intent0 = AdmSettingsChimeraActivity.g(this.a.a.a).putExtra("open_fmdn", true);
        this.a.startActivity(intent0);
        return true;
    }
}

