import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eqsd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return new BootstrapAccount(((StartSessionResponse)object0).h, "com.google");
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

