import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eqrx implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = new Bundle();
        ((Bundle)object1).putString("name", ((BootstrapAccount)object0).b);
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

