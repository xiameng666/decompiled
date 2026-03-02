import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import java.util.concurrent.Callable;

public final class dcgn implements Callable {
    public final dchp a;
    public final SetEnabledParams b;

    public dcgn(dchp dchp0, SetEnabledParams setEnabledParams0) {
        this.a = dchp0;
        this.b = setEnabledParams0;
    }

    @Override
    public final Object call() {
        return this.a.e.t(this.b.a);
    }
}

