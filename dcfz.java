import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.concurrent.Callable;

public final class dcfz implements Callable {
    public final dchp a;
    public final ShareTarget b;

    public dcfz(dchp dchp0, ShareTarget shareTarget0) {
        this.a = dchp0;
        this.b = shareTarget0;
    }

    @Override
    public final Object call() {
        return this.a.e.p(this.b);
    }
}

