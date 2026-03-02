import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahrz extends wby implements ahsa {
    final evqp a;

    public ahrz() {
        super("com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback");
    }

    public ahrz(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback");
    }

    @Override  // ahsa
    public final void a(Status status0, String s) {
        azzf.b(status0, s, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            String s = parcel0.readString();
            ahrz.gr(parcel0);
            this.a(status0, s);
            return true;
        }
        return false;
    }
}

