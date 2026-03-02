import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.common.api.ApiMetadata;

public abstract class acou extends wby implements acov {
    public acou() {
        super("com.google.android.gms.asterism.internal.IAsterismApiService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        acoy acoy0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
                    acoy0 = (iInterface0 instanceof acoy) ? ((acoy)iInterface0) : new acow(iBinder0);
                }
                GetAsterismConsentRequest getAsterismConsentRequest0 = (GetAsterismConsentRequest)wbz.a(parcel0, GetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acou.gr(parcel0);
                this.a(acoy0, getAsterismConsentRequest0, apiMetadata0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
                    acoy0 = (iInterface1 instanceof acoy) ? ((acoy)iInterface1) : new acow(iBinder1);
                }
                SetAsterismConsentRequest setAsterismConsentRequest0 = (SetAsterismConsentRequest)wbz.a(parcel0, SetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acou.gr(parcel0);
                this.d(acoy0, setAsterismConsentRequest0, apiMetadata1);
                break;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismCallbacks");
                    acoy0 = (iInterface2 instanceof acoy) ? ((acoy)iInterface2) : new acow(iBinder2);
                }
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acou.gr(parcel0);
                this.c(acoy0, apiMetadata2);
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

