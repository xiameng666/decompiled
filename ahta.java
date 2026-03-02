import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahta extends wby implements ahtb {
    final evqp a;

    public ahta() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback");
    }

    public ahta(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback");
    }

    @Override  // ahtb
    public final void a(Status status0, Bundle bundle0) {
        azzf.b(status0, (bundle0 == null ? null : kvk.b(bundle0)), this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            ahta.gr(parcel0);
            this.a(status0, bundle0);
            return true;
        }
        return false;
    }
}

