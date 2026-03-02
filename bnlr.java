import android.accounts.Account;

@ibnh
public final class bnlr {
    public final fgvt a;
    public final Object b;
    public Account c;
    public gted d;
    public long e;

    public bnlr(fgvt fgvt0) {
        this.b = new Object();
        this.c = null;
        this.d = null;
        this.a = fgvt0;
    }

    public final void a(Account account0, gted gted0) {
        synchronized(this.b) {
            this.c = account0;
            this.d = gted0;
            this.e = this.a.a();
        }
    }
}

