import android.accounts.Account;

public final class dmbo implements dmba {
    public final dyra a;
    public final frli b;
    private final Account c;
    private final String d;
    private final edqy e;
    private final dxzs f;

    public dmbo(Account account0, String s, edqy edqy0, dyra dyra0, dxzs dxzs0) {
        ibuq.f(edqy0, "octopusCardEligibility");
        super();
        this.c = account0;
        this.d = s;
        this.e = edqy0;
        this.a = dyra0;
        this.f = dxzs0;
        this.b = dxzs0.a(account0, s);
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        return hjwe0.b != 54 || !this.e.c ? false : ((Boolean)icbb.c(new dmbn(this, null))).booleanValue();
    }
}

