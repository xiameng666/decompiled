import android.bluetooth.BluetoothDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice.DeviceReference;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezjm implements Function {
    public final ggeo a;

    public ezjm(ggeo ggeo0) {
        this.a = ggeo0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return new TrustedUiDevice.DeviceReference(s, ((BluetoothDevice)this.a.get(s)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

