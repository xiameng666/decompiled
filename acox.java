import android.os.Parcel;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public class acox extends wby implements acoy {
    public acox() {
        super("com.google.android.gms.asterism.internal.IAsterismCallbacks");
    }

    @Override  // acoy
    public void a(Status status0, GetAsterismConsentResponse getAsterismConsentResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // acoy
    public void c(Status status0, SetAsterismConsentResponse setAsterismConsentResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // acoy
    public void d(Status status0, boolean z, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                GetAsterismConsentResponse getAsterismConsentResponse0 = (GetAsterismConsentResponse)wbz.a(parcel0, GetAsterismConsentResponse.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acox.gr(parcel0);
                this.a(status0, getAsterismConsentResponse0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                SetAsterismConsentResponse setAsterismConsentResponse0 = (SetAsterismConsentResponse)wbz.a(parcel0, SetAsterismConsentResponse.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acox.gr(parcel0);
                this.c(status1, setAsterismConsentResponse0, apiMetadata1);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                boolean z = wbz.i(parcel0);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acox.gr(parcel0);
                this.d(status2, z, apiMetadata2);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

