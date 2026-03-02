import com.google.android.libraries.messaging.lighter.model.AccountContext;
import j..util.Objects;

public final class fldd implements gfsi {
    public final fldt a;
    public final AccountContext b;

    public fldd(fldt fldt0, AccountContext accountContext0) {
        this.a = fldt0;
        this.b = accountContext0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((flbu)object0) != null) {
            fmou fmou0 = this.a.a(this.b);
            Objects.requireNonNull(fldt.a);
            fldk fldk0 = new fldk();
            fmou0.T(ggia.h(((flbu)object0).b, fldk0));
            this.a.c.a(this.b).edit().putLong("BLOCK_LAST_SYNC_KEY", System.currentTimeMillis()).commit();
        }
        return null;
    }
}

