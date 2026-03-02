import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerInvocationParams;
import j..util.Objects;

public final class bgiz extends bggt {
    private final bdii a;
    private final CredentialManagerInvocationParams b;

    public bgiz(bdii bdii0, CredentialManagerInvocationParams credentialManagerInvocationParams0, azug azug0) {
        super("RunLeakCheckAndGetProactiveCheckupResult", azug0);
        this.a = bdii0;
        this.b = credentialManagerInvocationParams0;
    }

    @Override  // bggt
    protected final void b(Context context0) {
        Account account0 = new Account(this.b.a.a, "com.google");
        if(this.b.a.b() || !ggch.j(bbmn.h(context0, "com.google.android.gms")).c(new bgky(account0)).i()) {
            throw new bebz(0xA9F3, "Checkup requires synced account to run");
        }
        bggq bggq0 = bgid.c(account0, account0, context0, grck.d);
        evqp evqp0 = new evqp();
        evql evql0 = bggq0.f.c.Y();
        Objects.requireNonNull(evqp0);
        evql0.b(new bggw(evqp0));
        evql0.A(new bggx(evqp0));
        bggd bggd0 = new bggd(bggq0);
        evql evql1 = evqp0.a.g(bggd0);
        evql1.A(new bggh());
        bdij bdij0 = (bdij)evrg.n(evql1);
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
        this.a.a(Status.b, bdij0.toString(), apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ApiMetadata apiMetadata0 = cckf.d(bbdp.aX);
        this.a.a(status0, "", apiMetadata0);
    }
}

