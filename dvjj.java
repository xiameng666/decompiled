import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.util.concurrent.Callable;

public final class dvjj implements Callable {
    public final dvjm a;
    public final Valuable b;

    public dvjj(dvjm dvjm0, Valuable valuable0) {
        this.a = dvjm0;
        this.b = valuable0;
    }

    @Override
    public final Object call() {
        this.a.i.a(this.b);
        return null;
    }
}

