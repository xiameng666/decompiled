import android.os.Parcel;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class ahtq extends wby implements ahtr {
    final evqp a;

    public ahtq() {
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    public ahtq(ahwl ahwl0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(ahwl0);
        super("com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback");
    }

    @Override  // ahtr
    public final void a(Status status0, List list0) {
        azzf.b(status0, list0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(InternalSignInCredentialWrapper.CREATOR);
            ahtq.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

