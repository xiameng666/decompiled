import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..lang.Iterable.-EL;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ezit implements Consumer {
    public final ezjf a;

    public ezit(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override
    public final void accept(Object object0) {
        ezjs ezjs0 = new ezjs(this.a.ah);
        Iterable.-EL.forEach(((TrustedUiDevice)object0).b, ezjs0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

