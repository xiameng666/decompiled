import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahrh extends wby implements ahri {
    final evqp a;

    public ahrh() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    public ahrh(ahwq ahwq0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwq0);
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override  // ahri
    public final void a(Status status0, BeginSignInResult beginSignInResult0) {
        azzf.b(status0, beginSignInResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            BeginSignInResult beginSignInResult0 = (BeginSignInResult)wbz.a(parcel0, BeginSignInResult.CREATOR);
            ahrh.gr(parcel0);
            this.a(status0, beginSignInResult0);
            return true;
        }
        return false;
    }
}

