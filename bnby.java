import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import j..util.Objects;

public final class bnby extends wby implements bnbz {
    final evqp a;

    public bnby() {
        super("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
    }

    public bnby(bnce bnce0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(bnce0);
        super("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
    }

    @Override  // bnbz
    public final void a(TargetDirectTransferResult targetDirectTransferResult0, ApiMetadata apiMetadata0) {
        azzf.b(targetDirectTransferResult0.a, targetDirectTransferResult0, this.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            TargetDirectTransferResult targetDirectTransferResult0 = (TargetDirectTransferResult)wbz.a(parcel0, TargetDirectTransferResult.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bnby.gr(parcel0);
            this.a(targetDirectTransferResult0, apiMetadata0);
            return true;
        }
        return false;
    }
}

