import com.google.android.libraries.messaging.lighter.model..AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.Callable;

public final class fljd implements Callable {
    public final fljw a;
    public final gfsi b;
    public final String c;

    public fljd(fljw fljw0, gfsi gfsi0, String s) {
        this.a = fljw0;
        this.b = gfsi0;
        this.c = s;
    }

    @Override
    public final Object call() {
        fljw fljw0 = this.a;
        gged_interceptors gged0 = fljw0.k.h();
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            AccountContext accountContext0 = (AccountContext)gged0.get(v1);
            if(accountContext0.b() == fmav.b) {
                fljw0.f(accountContext0.c().f());
            }
            String s = ((.AutoValue_ContactId)accountContext0.c().f()).a;
            ++v1;
            if(((String)this.b.apply(s)).equals(this.c)) {
                fljw0.o.j(accountContext0);
                return gfsx.m(accountContext0);
            }
        }
        return gfqx.a;
    }
}

