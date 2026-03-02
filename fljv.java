import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.concurrent.Callable;

public final class fljv implements Callable {
    public final fljw a;
    public final AccountContext b;

    public fljv(fljw fljw0, AccountContext accountContext0) {
        this.a = fljw0;
        this.b = accountContext0;
    }

    @Override
    public final Object call() {
        AccountContext accountContext0 = this.b;
        fljw fljw0 = this.a;
        synchronized(fljw0.d) {
            gfsx gfsx0 = fljw0.k.g(accountContext0);
            Long long0 = accountContext0.a();
            fljw0.f.put(long0, gfsx0);
        }
        if(fljw0.k.j(accountContext0)) {
            fljw0.n.b.d(new flij(fljw0.n, accountContext0));
            for(Object object0: fljw0.b) {
                fier fier0 = (fier)object0;
                gged_interceptors gged0 = accountContext0.c().g();
                int v1 = ((ggna)gged0).c;
                for(int v2 = 0; v2 < v1; ++v2) {
                    ContactId contactId0 = (ContactId)gged0.get(v2);
                }
            }
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }
}

