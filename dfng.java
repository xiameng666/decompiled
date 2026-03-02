import android.accounts.Account;

public final class dfng implements dcyy {
    public final Account a;

    public dfng(Account account0) {
        ibuq.f(account0, "account");
        super();
        this.a = account0;
    }

    @Override  // dcyy
    public final icig a(ddag ddag0) {
        ibuq.f(ddag0, "repository");
        return new icht(new dfnf(this, ddag0, null));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dfng) ? ibuq.m(this.a, ((dfng)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountSelected(account=" + this.a + ")";
    }
}

