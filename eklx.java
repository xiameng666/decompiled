import android.accounts.Account;

public final class eklx implements Runnable {
    public final eklz a;
    public final Account b;
    public final lqi c;

    public eklx(eklz eklz0, Account account0, lqi lqi0) {
        this.a = eklz0;
        this.b = account0;
        this.c = lqi0;
    }

    @Override
    public final void run() {
        Boolean boolean0 = ejyr.a(this.a.d.v, this.b);
        this.c.ii(boolean0);
    }
}

