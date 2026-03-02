import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import j..util.Objects;

public final class bgjb extends bggt {
    private final azxs a;
    private final CredentialManagerInvocationParams b;

    public bgjb(azxs azxs0, CredentialManagerInvocationParams credentialManagerInvocationParams0, azug azug0) {
        super("runPasswordCheckupOperation", azug0);
        this.a = azxs0;
        this.b = credentialManagerInvocationParams0;
    }

    @Override  // bggt
    protected final void b(Context context0) {
        CredentialManagerInvocationParams credentialManagerInvocationParams0 = this.b;
        Account account0 = new Account(credentialManagerInvocationParams0.a.a, "com.google");
        gfsx gfsx0 = bgkz.a(account0, context0);
        if(!gfsx0.i()) {
            throw new bebz(0xA9F3, "Checkup for local passwords needs a synced account to run.");
        }
        grck grck0 = credentialManagerInvocationParams0.b == null || !Objects.equals(credentialManagerInvocationParams0.b.c, "chrome_safety_check") ? grck.c : grck.m;
        bggq bggq0 = bgid.c(account0, ((Account)gfsx0.d()), context0, grck0);
        evql evql0 = bggq0.a().g(new bggk(bggq0));
        evql0.A(new bggl());
        evrg.n(evql0);
        this.a.a(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0);
    }
}

