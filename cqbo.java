import android.accounts.Account;

public final class cqbo implements cqhc {
    public final Account a;
    public final fkwe b;
    private final fkrk c;

    public cqbo(Account account0, fkrk fkrk0, fkwe fkwe0) {
        this.a = account0;
        this.c = fkrk0;
        this.b = fkwe0;
    }

    @Override  // cqhc
    public final gmcd a() {
        cqbm cqbm0 = new cqbm(this);
        gmcd gmcd0 = glzd.f(this.c.b(cqbm0, gmap.a), new cqbn(), gmap.a);
        cqbl cqbl0 = new cqbl();
        return glyi.g(gmcd0, Exception.class, cqbl0, gmap.a);
    }
}

