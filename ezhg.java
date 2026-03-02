import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezhg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)object0;
        return new TrustableDevice(((gged_interceptors)Collection.-EL.stream(gged0).map(new ezgq()).collect(ggaf.a)), Collection.-EL.stream(gged0).anyMatch(new ezgr()));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

