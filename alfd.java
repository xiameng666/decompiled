import android.os.Binder;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import j..util.Objects;

public final class alfd extends Binder {
    final FirstPartyDeviceRegistrationChimeraService a;

    public alfd(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService0) {
        Objects.requireNonNull(firstPartyDeviceRegistrationChimeraService0);
        this.a = firstPartyDeviceRegistrationChimeraService0;
        super();
    }
}

