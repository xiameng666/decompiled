import android.accounts.Account;

public final class aizy implements evpo {
    final Account a;
    final azts b;

    public aizy(azts azts0, Account account0) {
        this.b = azts0;
        this.a = account0;
        super();
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        int v = (int)(((Integer)evql0.j()));
        if(v != 5 && v != 6) {
            return evrg.d(null);
        }
        ((ggtj)aizz.a.h()).z("folsom sync status is: %d. Try setting consent to true.", v);
        return this.b.jC(this.a.name, true);
    }
}

