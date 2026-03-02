import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public abstract class ddpq extends wby implements ddpr {
    public ddpq() {
        super("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            OnTransferUpdateParams onTransferUpdateParams0 = (OnTransferUpdateParams)wbz.a(parcel0, OnTransferUpdateParams.CREATOR);
            ddpq.gr(parcel0);
            this.a(onTransferUpdateParams0);
            return true;
        }
        return false;
    }
}

