import android.accounts.Account;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;

public final class bghy implements gfsi {
    public final bgia a;

    public bghy(bgia bgia0) {
        this.a = bgia0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Account account0 = (Account)object0;
        CredentialManagerAccount credentialManagerAccount0 = CredentialManagerAccount.a(account0.name);
        becz becz0 = new becz(new becs(account0.name, cede.v()));
        azzc azzc0 = new azzc();
        azzc0.d = 26801;
        azzc0.a = new bgon(credentialManagerAccount0);
        azzd azzd0 = azzc0.a();
        return ((azts)this.a.b).iG(azzd0).e(new bghw(this.a, credentialManagerAccount0)).e(new bghx(becz0));
    }
}

