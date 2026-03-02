import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flib implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final fmev c;
    public final fltq d;

    public flib(flit flit0, AccountContext accountContext0, fmev fmev0, fltq fltq0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmev0;
        this.d = fltq0;
    }

    @Override
    public final void run() {
        int v = (int)iaea.d();
        flit flit0 = this.a;
        long v1 = ((long)flit0.i.nextInt(v)) + iaea.c();
        AccountContext accountContext0 = this.b;
        fmev fmev0 = flit.c(this.c, this.d, v1);
        flit0.d(accountContext0).al(fmev0);
        if(this.c.c.equals(fmev0.c) && fmev0.d.i()) {
            return;
        }
        flit0.o(accountContext0, fmev0);
    }
}

