import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.Callable;

public final class fldf implements Callable {
    public final fldt a;
    public final AccountContext b;

    public fldf(fldt fldt0, AccountContext accountContext0) {
        this.a = fldt0;
        this.b = accountContext0;
    }

    @Override
    public final Object call() {
        return this.a.c.a(this.b).getLong("BLOCK_LAST_SYNC_KEY", 0L);
    }
}

