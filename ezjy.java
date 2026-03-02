import android.bluetooth.BluetoothDevice;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezjy implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Boolean.valueOf(((BluetoothDevice)object0).isConnected());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

