import android.accounts.Account;
import j..util.Objects;

final class ehbz implements gmbg {
    final Account a;
    final ehcb b;

    public ehbz(ehcb ehcb0, Account account0) {
        this.a = account0;
        Objects.requireNonNull(ehcb0);
        this.b = ehcb0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        ehcb ehcb0 = this.b;
        Account account0 = this.a;
        if(ehcb.i(account0)) {
            ehcb0.a.a(account0);
            return;
        }
        if(((Boolean)object0).booleanValue() && ehcb0.a(account0) == 0) {
            ehcb0.a.a(account0);
        }
    }
}

