import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fldx implements gfsi {
    public final fleb a;
    public final AccountContext b;

    public fldx(fleb fleb0, AccountContext accountContext0) {
        this.a = fleb0;
        this.b = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((flth)object0).a) {
            flsm.a(this.b, this.a.c, 10099, 404);
            flbj.a("LitBstrpCntrl", "start syncing block list.");
            this.a.g.g(this.b);
        }
        return (flth)object0;
    }
}

