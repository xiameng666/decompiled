import android.accounts.Account;

public final class ddkd implements Runnable {
    public final ddki a;
    public final Account b;
    public final evqp c;

    public ddkd(ddki ddki0, Account account0, evqp evqp0) {
        this.a = ddki0;
        this.b = account0;
        this.c = evqp0;
    }

    @Override
    public final void run() {
        hfga hfga0 = dhst.a(this.a.a).b(this.b);
        ddkb ddkb0 = ddkj.a(hfga0);
        evqp evqp0 = this.c;
        if(ddkb0 != null) {
            evqp0.b(ddkj.a(hfga0));
            return;
        }
        evqp0.a(new IllegalStateException("Unable to retrieve consent text."));
    }
}

