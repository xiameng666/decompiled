import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eziv implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return new TrustableDevice(((BluetoothDevice)object0), false);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

