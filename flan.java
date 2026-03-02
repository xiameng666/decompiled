import android.accounts.Account;
import android.net.Uri;

public final class flan {
    private final flam a;
    private final flap b;

    public flan() {
        throw null;
    }

    public flan(flam flam0, flap flap0) {
        this.a = flam0;
        this.b = flap0;
    }

    public final fkzl a(Account account0) {
        Uri uri0 = this.a.a(account0);
        return new fkzl(new fkzo(this.b.a(uri0)), this.b.a);
    }

    public final fkzl b() {
        Uri uri0 = this.a.b();
        return new fkzl(new fkzo(this.b.a(uri0)), this.b.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof flan) && this.a.equals(((flan)object0).a) && this.b.equals(((flan)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "PdsMobstoreSyncMetadataManagerFactory{mobstoreHelper=" + this.a + ", pdsSyncMetadataManagerFactory=" + this.b + "}";
    }
}

