import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class flgk implements Runnable {
    public final flit a;
    public final AccountContext b;
    public final fmga c;

    public flgk(flit flit0, AccountContext accountContext0, fmga fmga0) {
        this.a = flit0;
        this.b = accountContext0;
        this.c = fmga0;
    }

    @Override
    public final void run() {
        this.a.h(this.b, this.c.c).g();
        this.a.u.d(this.b, this.c.b).g();
    }
}

