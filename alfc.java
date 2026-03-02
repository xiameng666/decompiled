import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class alfc implements gmbg {
    final FirstPartyDeviceRegistrationChimeraService a;

    public alfc(FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService0) {
        Objects.requireNonNull(firstPartyDeviceRegistrationChimeraService0);
        this.a = firstPartyDeviceRegistrationChimeraService0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        --this.a.c;
        FirstPartyDeviceRegistrationChimeraService.a.n("Registration fail", throwable0, new Object[0]);
        this.a.d();
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Status status0 = (Status)object0;
        --this.a.c;
        this.a.d();
    }
}

