import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.BytesParams;

public abstract class czeq extends wby implements czer {
    public czeq() {
        super("com.google.android.gms.nearby.internal.connection.IBytesResultListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            BytesParams bytesParams0 = (BytesParams)wbz.a(parcel0, BytesParams.CREATOR);
            czeq.gr(parcel0);
            this.a(bytesParams0);
            return true;
        }
        return false;
    }
}

