import android.os.Parcel;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahsi extends wby implements ahsj {
    final evqp a;

    public ahsi() {
        super("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
    }

    public ahsi(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback");
    }

    @Override  // ahsj
    public final void a(Status status0, InternalSignInCredentialWrapper internalSignInCredentialWrapper0) {
        azzf.b(status0, internalSignInCredentialWrapper0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = (InternalSignInCredentialWrapper)wbz.a(parcel0, InternalSignInCredentialWrapper.CREATOR);
            ahsi.gr(parcel0);
            this.a(status0, internalSignInCredentialWrapper0);
            return true;
        }
        return false;
    }
}

