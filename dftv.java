import android.accounts.Account;

public final class dftv implements Runnable {
    public final dfud a;

    public dftv(dfud dfud0) {
        this.a = dfud0;
    }

    @Override
    public final void run() {
        dfud dfud0 = this.a;
        dfsk dfsk0 = dfud0.b;
        Account account0 = dfsk0.c();
        if(account0 == null) {
            dcvz.a.e().p("Cannot upload contacts: account or account id is null.", new Object[0]);
            return;
        }
        dbxx dbxx0 = dfud0.c.b(account0);
        dcpu dcpu0 = new dcpu();
        dcpu0.a = 15;
        dcpu0.b = 1;
        dfsk0.I(account0, dfud0.f(account0, dbxx0, new dcpv(dcpu0)));
    }
}

