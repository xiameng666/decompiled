import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.concurrent.Callable;

public final class bllk implements Callable {
    public final blll a;
    public final RequestOptions b;

    public bllk(blll blll0, RequestOptions requestOptions0) {
        this.a = blll0;
        this.b = requestOptions0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.a.e.a(this.b, this.a.d).i());
    }
}

