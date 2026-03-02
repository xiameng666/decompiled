import android.accounts.Account;

public final class dfsi {
    public final Account a;
    public final String b;

    public dfsi() {
        throw null;
    }

    public dfsi(Account account0, String s) {
        this.a = account0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof dfsi) && this.a.equals(((dfsi)object0).a) && this.b.equals(((dfsi)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AccountInfo{account=" + this.a + ", accountId=" + this.b + "}";
    }
}

