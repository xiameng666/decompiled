import android.accounts.Account;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eqry implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return new Account(((BootstrapAccount)object0).b, "com.google");
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

