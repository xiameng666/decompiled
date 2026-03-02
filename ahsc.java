import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AccountWithZuulKeyRetrievalIntent;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public abstract class ahsc extends wby implements ahsd {
    public ahsc() {
        super("com.google.android.gms.auth.api.identity.internal.IFetchAccountsWithZuulKeyRetrievalIntentsCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(AccountWithZuulKeyRetrievalIntent.CREATOR);
            ahsc.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

