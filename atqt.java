import android.os.Parcel;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.carrierauth.EapInfoResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public class atqt extends wby implements atqu {
    public atqt() {
        super("com.google.android.gms.carrierauth.internal.ICarrierAuthCallbacks");
    }

    @Override  // atqu
    public void a(Status status0, EAPAKAResponse eAPAKAResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // atqu
    public final void b(Status status0, EapInfoResponse eapInfoResponse0, ApiMetadata apiMetadata0) {
        throw new UnsupportedOperationException();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                EAPAKAResponse eAPAKAResponse0 = (EAPAKAResponse)wbz.a(parcel0, EAPAKAResponse.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                atqt.gr(parcel0);
                this.a(status0, eAPAKAResponse0, apiMetadata0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                EapInfoResponse eapInfoResponse0 = (EapInfoResponse)wbz.a(parcel0, EapInfoResponse.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                atqt.gr(parcel0);
                this.b(status1, eapInfoResponse0, apiMetadata1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

