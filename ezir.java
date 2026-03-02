import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ezir implements Consumer {
    public final ezjf a;

    public ezir(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override
    public final void accept(Object object0) {
        ezji ezji0 = this.a.am;
        if(ezji0 != null) {
            ezji0.a(((TrustableDevice)object0));
        }
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

