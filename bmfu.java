import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class bmfu extends wby implements bmfv {
    public bmfu() {
        super("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        wbx wbx0;
        switch(v) {
            case 1: {
                parcel0.readInt();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmfu.gr(parcel0);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    wbx0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.fido2.api.IUserPresenceApprover");
                    wbx0 = (iInterface0 instanceof bmge) ? ((bmge)iInterface0) : new bmge(iBinder0);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                bmfu.gr(parcel0);
                wbx0.jp(1, wbx0.jo());
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

