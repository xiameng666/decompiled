import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import java.util.concurrent.Callable;

public final class dcfs implements Callable {
    public final dchp a;
    public final SetAccountParams b;

    public dcfs(dchp dchp0, SetAccountParams setAccountParams0) {
        this.a = dchp0;
        this.b = setAccountParams0;
    }

    @Override
    public final Object call() {
        return this.a.e.q(this.b.a);
    }
}

