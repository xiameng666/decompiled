import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezjp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (int)((TrustedUiDevice)object0).d;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

