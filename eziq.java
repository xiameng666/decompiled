import android.os.Bundle;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedUiDevice;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class eziq implements Consumer {
    public final ezjf a;

    public eziq(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override
    public final void accept(Object object0) {
        ezhz ezhz0 = new ezhz();
        Bundle bundle0 = new Bundle();
        bundle0.putParcelable("auth_trust_agent_pref_trusted_devices_trusted_device_key", ((TrustedUiDevice)object0));
        bundle0.putInt("auth_trust_agent_pref_trusted_devices_mode_key", (((TrustedUiDevice)object0).d == 2 ? 3 : 2));
        ezhz0.setArguments(bundle0);
        ezhz0.show(this.a.getParentFragmentManager(), "Coffee-TrustedDevicesFragment");
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

