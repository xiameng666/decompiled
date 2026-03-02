import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKARequest;
import com.google.android.gms.carrierauth.EapInfoRequest;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class atqw extends wby implements atqx {
    public atqw() {
        super("com.google.android.gms.carrierauth.internal.ICarrierAuthService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        atqu atqu0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
                    atqu0 = (iInterface0 instanceof atqu) ? ((atqu)iInterface0) : new atqs(iBinder0);
                }
                EAPAKARequest eAPAKARequest0 = (EAPAKARequest)wbz.a(parcel0, EAPAKARequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                atqw.gr(parcel0);
                this.b(atqu0, eAPAKARequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
                    atqu0 = (iInterface1 instanceof atqu) ? ((atqu)iInterface1) : new atqs(iBinder1);
                }
                EapInfoRequest eapInfoRequest0 = (EapInfoRequest)wbz.a(parcel0, EapInfoRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                atqw.gr(parcel0);
                this.a(atqu0, eapInfoRequest0, apiMetadata1);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

