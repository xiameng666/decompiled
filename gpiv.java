import android.accounts.Account;

final class gpiv {
    public final Account a;
    public final String b;

    public gpiv() {
        throw null;
    }

    public gpiv(Account account0, String s) {
        this.a = account0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof gpiv) && this.a.equals(((gpiv)object0).a) && this.b.equals(((gpiv)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }
}

