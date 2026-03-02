import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

public final class ahko implements gful_cronetEngineProvider {
    public final CredentialsSettingsChimeraActivity a;
    public final Account b;

    public ahko(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0, Account account0) {
        this.a = credentialsSettingsChimeraActivity0;
        this.b = account0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        adwo adwo0 = this.a.m;
        azzc azzc0 = new azzc();
        azzc0.d = 0x5F7;
        azzc0.a = new adwd(this.b);
        return fhra.b(adwo0.iG(azzc0.a()));
    }
}

