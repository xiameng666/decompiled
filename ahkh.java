import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

public final class ahkh implements gful_cronetEngineProvider {
    public final CredentialsSettingsChimeraActivity a;
    public final boolean b;

    public ahkh(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity0, boolean z) {
        this.a = credentialsSettingsChimeraActivity0;
        this.b = z;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        Account account0 = this.a.q;
        batl.s(account0);
        adwo adwo0 = this.a.m;
        azzc azzc0 = new azzc();
        azzc0.d = 0x5F9;
        azzc0.a = new adwg(account0, this.b);
        return fhra.b(adwo0.jn(azzc0.a()));
    }
}

