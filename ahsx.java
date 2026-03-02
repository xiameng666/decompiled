import android.os.Parcel;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahsx extends wby implements ahsy {
    final evqp a;

    public ahsx() {
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    public ahsx(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
    }

    @Override  // ahsy
    public final void a(Status status0, GetDefaultAccountResult getDefaultAccountResult0) {
        azzf.b(status0, getDefaultAccountResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            GetDefaultAccountResult getDefaultAccountResult0 = (GetDefaultAccountResult)wbz.a(parcel0, GetDefaultAccountResult.CREATOR);
            ahsx.gr(parcel0);
            this.a(status0, getDefaultAccountResult0);
            return true;
        }
        return false;
    }
}

