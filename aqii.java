import android.accounts.Account;
import j..util.Objects;

final class aqii implements aqzm {
    final Account a;
    final aqij b;

    public aqii(aqij aqij0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(aqij0);
        this.b = aqij0;
        super();
    }

    @Override  // aqzm
    public final void a(Throwable throwable0) {
        aqij.a.g("Error while trying to record consent and enable backup:", throwable0, new Object[0]);
        this.b.c(this.a, 5);
        this.b.a();
        this.b.b.finish();
    }

    @Override  // aqzm
    public final void b(Object object0) {
        int v;
        java.util.Objects.toString(((Boolean)object0));
        aqij.a.j("recordConsentAndEnableBackup on account switching result = " + ((Boolean)object0), new Object[0]);
        if(((Boolean)object0) == null) {
            v = 3;
        }
        else {
            v = ((Boolean)object0).booleanValue() ? 2 : 4;
        }
        aqij aqij0 = this.b;
        aqij0.c(this.a, v);
        if(((Boolean)object0) == null || !((Boolean)object0).booleanValue()) {
            aqij0.a();
        }
        aqij0.b.finish();
    }
}

