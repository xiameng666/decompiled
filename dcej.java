import com.google.android.gms.nearby.sharing.internal.SetFastInitNotificationEnabledParams;
import java.util.concurrent.Callable;

public final class dcej implements Callable {
    public final dchp a;
    public final SetFastInitNotificationEnabledParams b;

    public dcej(dchp dchp0, SetFastInitNotificationEnabledParams setFastInitNotificationEnabledParams0) {
        this.a = dchp0;
        this.b = setFastInitNotificationEnabledParams0;
    }

    @Override
    public final Object call() {
        boolean z = this.b.b;
        ((dfsk)this.a.e.d.get()).B(z);
        this.a.e.V();
        this.a.e.U();
        return (int)0;
    }
}

