import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

public final class ahjp implements gful_cronetEngineProvider {
    public final CredentialPickerChimeraActivity a;
    public final Account b;
    public final InternalCredentialWrapper c;

    public ahjp(CredentialPickerChimeraActivity credentialPickerChimeraActivity0, Account account0, InternalCredentialWrapper internalCredentialWrapper0) {
        this.a = credentialPickerChimeraActivity0;
        this.b = account0;
        this.c = internalCredentialWrapper0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        adwo adwo0 = this.a.r;
        String s = this.a.j;
        boolean z = ((CredentialRequest)this.a.l.d()).f;
        String s1 = ((CredentialRequest)this.a.l.d()).g;
        String s2 = ((CredentialRequest)this.a.l.d()).h;
        azzc azzc0 = new azzc();
        azzc0.d = 0x5F4;
        azzc0.a = new adwb(this.b, s, this.c.a, z, s1, s2);
        return fhra.b(adwo0.iG(azzc0.a()));
    }
}

