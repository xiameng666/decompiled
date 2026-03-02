import android.accounts.Account;

public final class dlqg implements lsk {
    private final Account a;
    private final dlou b;
    private final edon c;
    private final azts d;
    private final azts e;

    public dlqg(azts azts0, Account account0, dlou dlou0, edon edon0, azts azts1) {
        this.e = azts0;
        this.a = account0;
        this.b = dlou0;
        this.c = edon0;
        this.d = azts1;
    }

    @Override  // lsk
    public final lsb a(Class class0) {
        return lsi.b(class0);
    }

    @Override  // lsk
    public final lsb b(Class class0, ltx ltx0) {
        ibuq.f(class0, "modelClass");
        if(class0.isAssignableFrom(dlqf.class)) {
            return new dlqf(lrm.a(ltx0), this.e, this.a, this.b, this.c, this.d);
        }
        throw new IllegalArgumentException(class0.getCanonicalName() + " is not assignable from AddBankAccountFragmentViewModel");
    }

    @Override  // lsk
    public final lsb c(ibwv ibwv0, ltx ltx0) {
        return lsi.a(this, ibwv0, ltx0);
    }
}

