import android.os.Parcel;
import com.google.android.gms.auth.api.identity.MatchPasswordResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahtt extends wby implements ahtu {
    final evqp a;

    public ahtt() {
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    public ahtt(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback");
    }

    @Override  // ahtu
    public final void a(Status status0, MatchPasswordResult matchPasswordResult0) {
        azzf.b(status0, matchPasswordResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            MatchPasswordResult matchPasswordResult0 = (MatchPasswordResult)wbz.a(parcel0, MatchPasswordResult.CREATOR);
            ahtt.gr(parcel0);
            this.a(status0, matchPasswordResult0);
            return true;
        }
        return false;
    }
}

