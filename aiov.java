import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;

public class aiov extends wby implements aiow {
    public aiov() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override  // aiow
    public final void a(Status status0, byte[] arr_b) {
        throw new UnsupportedOperationException();
    }

    @Override  // aiow
    public void b(Status status0, RetrieveBytesResponse retrieveBytesResponse0) {
        throw null;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                byte[] arr_b = parcel0.createByteArray();
                aiov.gr(parcel0);
                this.a(status0, arr_b);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                RetrieveBytesResponse retrieveBytesResponse0 = (RetrieveBytesResponse)wbz.a(parcel0, RetrieveBytesResponse.CREATOR);
                aiov.gr(parcel0);
                this.b(status1, retrieveBytesResponse0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

