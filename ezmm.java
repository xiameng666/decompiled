import android.accounts.Account;

public final class ezmm implements azst {
    private final Account a;

    public ezmm(Account account0) {
        batl.t(account0, "Must provide a valid account!");
        this.a = account0;
    }

    @Override  // azst
    public final Account a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ezmm) && this.a.equals(((ezmm)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

