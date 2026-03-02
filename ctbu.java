import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.multidevice.AssociatedGaiasResult;

public final class ctbu extends wby implements ctbv {
    final evqp a;

    public ctbu() {
        super("com.google.android.gms.multidevice.internal.IAssociatedGaiasCallback");
    }

    public ctbu(evqp evqp0) {
        this.a = evqp0;
        super("com.google.android.gms.multidevice.internal.IAssociatedGaiasCallback");
    }

    @Override  // ctbv
    public final void a(Status status0, AssociatedGaiasResult associatedGaiasResult0, ApiMetadata apiMetadata0) {
        ibuq.f(status0, "status");
        azzf.b(status0, associatedGaiasResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            AssociatedGaiasResult associatedGaiasResult0 = (AssociatedGaiasResult)wbz.a(parcel0, AssociatedGaiasResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ctbu.gr(parcel0);
            this.a(status0, associatedGaiasResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

