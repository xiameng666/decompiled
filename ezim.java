import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesCollapsingToolbarChimeraSettings;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ezim implements Consumer {
    public final TrustedDevicesCollapsingToolbarChimeraSettings a;

    public ezim(TrustedDevicesCollapsingToolbarChimeraSettings trustedDevicesCollapsingToolbarChimeraSettings0) {
        this.a = trustedDevicesCollapsingToolbarChimeraSettings0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.k.a(((TrustableDevice)object0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

