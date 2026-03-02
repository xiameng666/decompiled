import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.util.concurrent.Callable;

public final class dvji implements Callable {
    public final dvjm a;
    public final Valuable b;

    public dvji(dvjm dvjm0, Valuable valuable0) {
        this.a = dvjm0;
        this.b = valuable0;
    }

    @Override
    public final Object call() {
        this.a.i.a(this.b);
        return null;
    }
}

