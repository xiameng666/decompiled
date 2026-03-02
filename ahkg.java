import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

public final class ahkg implements gful_cronetEngineProvider {
    public final CredentialsSettingsChimeraActivity a;
    public final Account b;
    public final gfsx c;

    public ahkg(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0, Account account0, gfsx gfsx0) {
        this.a = credentialsSettingsChimeraActivity0;
        this.b = account0;
        this.c = gfsx0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        adwo adwo0 = this.a.m;
        String s = (String)this.c.d();
        return fhra.b(adwo0.b(this.b, s, false));
    }
}

