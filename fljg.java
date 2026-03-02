import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.Callable;

public final class fljg implements Callable {
    public final fljw a;

    public fljg(fljw fljw0) {
        this.a = fljw0;
    }

    @Override
    public final Object call() {
        ggdy ggdy0 = new ggdy();
        fljw fljw0 = this.a;
        gged_interceptors gged0 = fljw0.k.h();
        ggdy0.k(gged0);
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            AccountContext accountContext0 = (AccountContext)gged0.get(v1);
            if(accountContext0.b() == fmav.b) {
                fljw0.f(accountContext0.c().f());
            }
        }
        return ggdy0.h();
    }
}

