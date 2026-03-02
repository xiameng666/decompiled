import android.accounts.Account;

public final class dmbl implements dmba {
    public final dyra a;
    public final frli b;
    private final Account c;
    private final edqy d;

    public dmbl(Account account0, edqy edqy0, dyra dyra0, String s, dxzq dxzq0) {
        ibuq.f(edqy0, "octopusCardEligibility");
        super();
        this.c = account0;
        this.d = edqy0;
        this.a = dyra0;
        this.b = dxzq0.a(account0, s);
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        return hjwe0.b != 56 || !this.d.c ? false : ((Boolean)icbb.c(new dmbk(this, null))).booleanValue();
    }
}

