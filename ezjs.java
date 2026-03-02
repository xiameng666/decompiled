import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice.DeviceReference;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ezjs implements Consumer {
    public final ezck a;

    public ezjs(ezck ezck0) {
        this.a = ezck0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.e(ezka.h(((TrustedUiDevice.DeviceReference)object0).a), false);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

