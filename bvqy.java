import android.content.Intent;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class bvqy extends wby implements IInterface {
    final evqp a;
    final bvrd b;

    public bvqy() {
        super("com.google.android.gms.growth.internal.IUpgradeInviteInvocationCallbacks");
    }

    public bvqy(bvrd bvrd0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(bvrd0);
        this.b = bvrd0;
        super("com.google.android.gms.growth.internal.IUpgradeInviteInvocationCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            Intent intent0 = (Intent)wbz.a(parcel0, Intent.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bvqy.gr(parcel0);
            if(intent0 != null) {
                this.b.a.startActivity(intent0);
            }
            azzf.b(status0, null, this.a);
            return true;
        }
        return false;
    }
}

