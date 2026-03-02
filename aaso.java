import android.accounts.Account;
import com.google.android.gms.accountsettings.mg.ui.main.MainChimeraActivity;
import j..util.Objects;

public final class aaso extends bxig {
    final MainChimeraActivity a;

    public aaso(MainChimeraActivity mainChimeraActivity0, cchj cchj0) {
        Objects.requireNonNull(mainChimeraActivity0);
        this.a = mainChimeraActivity0;
        super(cchj0);
    }

    @Override  // bxig
    public final String a() {
        return this.a.k.a().b;
    }

    @Override  // bxig
    public final void b() {
        this.a.k.a.h.l(new fhru(fhry.a));
    }

    @Override  // bxig
    public final void c(Account account0) {
        this.a.k.a.m(account0.name);
    }
}

