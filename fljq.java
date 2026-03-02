import com.google.android.libraries.messaging.lighter.model.AccountContext;

public final class fljq implements gfsi {
    public final fljw a;
    public final AccountContext b;

    public fljq(fljw fljw0, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        AccountContext accountContext0 = this.b;
        if(((flkt)object0).d == 2) {
            gfsx gfsx0 = ((flkt)object0).b;
            if(gfsx0.i()) {
                return gfsx0.d();
            }
        }
        synchronized(this.a.e) {
            this.a.g.remove(accountContext0);
        }
        return null;
    }
}

