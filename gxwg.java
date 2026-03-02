import android.accounts.Account;

public final class gxwg implements Runnable {
    public final gxwp a;
    public final Account b;

    public gxwg(gxwp gxwp0, Account account0) {
        this.a = gxwp0;
        this.b = account0;
    }

    @Override
    public final void run() {
        this.a.b.g(this.b);
    }
}

