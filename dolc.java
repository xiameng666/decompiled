import android.accounts.Account;
import dagger.internal.Factory;

public final class dolc implements Factory {
    private final dola a;

    public dolc(dola dola0) {
        this.a = dola0;
    }

    public final Account a() {
        return dolc.b(this.a);
    }

    public static Account b(dola dola0) {
        return new Account(dola0.a, "com.google");
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

