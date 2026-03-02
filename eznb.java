import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import java.util.concurrent.Executor;

public abstract class eznb extends cjtm {
    protected final bkcs a;
    protected final ezsq b;
    protected final baqr c;
    protected final fktv d;
    protected final Executor e;
    protected final FacsInternalSyncCallOptions f;

    protected eznb(String s, bkcs bkcs0, ezsq ezsq0, baqr baqr0, fktv fktv0, Executor executor0, FacsInternalSyncCallOptions facsInternalSyncCallOptions0) {
        super(220, s);
        this.a = bkcs0;
        this.b = ezsq0;
        this.c = baqr0;
        this.d = fktv0;
        this.e = executor0;
        this.f = facsInternalSyncCallOptions0;
    }

    final void b() {
        if(this.c.b != null) {
            return;
        }
        throw new cjuh(5, "Provided client context doesn\'t have a resolved account!");
    }
}

