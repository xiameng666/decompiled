import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class bvqx extends wby implements IInterface {
    final evqp a;

    public bvqx() {
        super("com.google.android.gms.growth.internal.IUpgradeInviteEligibilityCallbacks");
    }

    public bvqx(bvrd bvrd0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(bvrd0);
        super("com.google.android.gms.growth.internal.IUpgradeInviteEligibilityCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            boolean z = wbz.i(parcel0);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bvqx.gr(parcel0);
            azzf.b(status0, Boolean.valueOf(z), this.a);
            return true;
        }
        return false;
    }
}

