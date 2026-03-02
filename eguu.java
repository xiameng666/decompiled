import android.accounts.Account;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import j..util.Objects;

public final class eguu extends lqh {
    Account a;
    lqd h;
    final eguv i;

    public eguu(eguv eguv0) {
        Objects.requireNonNull(eguv0);
        this.i = eguv0;
        super();
    }

    public final void b(Account account0) {
        lqd lqd0 = this.h;
        if(lqd0 != null) {
            this.p(lqd0);
        }
        this.a = account0;
        AccountWithDataSet accountWithDataSet0 = new AccountWithDataSet(account0, null, false);
        lqd lqd1 = this.i.j.a(accountWithDataSet0);
        this.h = lqd1;
        this.o(lqd1, new egut(this));
    }
}

