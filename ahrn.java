import android.os.Parcel;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class ahrn extends wby implements ahro {
    final evqp a;

    public ahrn() {
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    public ahrn(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
    }

    @Override  // ahro
    public final void a(Status status0, CompleteSignInResult completeSignInResult0) {
        azzf.b(status0, completeSignInResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            CompleteSignInResult completeSignInResult0 = (CompleteSignInResult)wbz.a(parcel0, CompleteSignInResult.CREATOR);
            ahrn.gr(parcel0);
            this.a(status0, completeSignInResult0);
            return true;
        }
        return false;
    }
}

