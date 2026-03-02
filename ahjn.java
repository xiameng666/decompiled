import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialPickerChimeraActivity;

public final class ahjn implements gful_cronetEngineProvider {
    public final CredentialPickerChimeraActivity a;
    public final gfsx b;

    public ahjn(CredentialPickerChimeraActivity credentialPickerChimeraActivity0, gfsx gfsx0) {
        this.a = credentialPickerChimeraActivity0;
        this.b = gfsx0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        adwo adwo0 = this.a.r;
        Account account0 = (Account)this.b.d();
        String s = this.a.j;
        String s1 = ((HintRequest)this.a.k.d()).g;
        String s2 = ((HintRequest)this.a.k.d()).h;
        azzc azzc0 = new azzc();
        azzc0.d = 0x5F5;
        azzc0.a = new adwc(account0, s, s1, s2);
        return fhra.b(adwo0.iG(azzc0.a()));
    }
}

