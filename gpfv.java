import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.firebase.pnv.internal.ExchangeCredentialResponseForPhoneNumberRequest;
import com.google.firebase.pnv.internal.GetDigitalCredentialPayloadRequest;
import com.google.firebase.pnv.internal.GetVerificationSupportInfoRequest;

public abstract class gpfv extends wby implements gpfw {
    public gpfv() {
        super("com.google.firebase.pnv.internal.IFpnvService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gpfu gpfu0 = null;
        switch(v) {
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvCallbacks");
                    gpfu0 = (iInterface0 instanceof gpfu) ? ((gpfu)iInterface0) : new gpfu(iBinder0);
                }
                GetVerificationSupportInfoRequest getVerificationSupportInfoRequest0 = (GetVerificationSupportInfoRequest)wbz.a(parcel0, GetVerificationSupportInfoRequest.CREATOR);
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                gpfv.gr(parcel0);
                this.d(gpfu0, getVerificationSupportInfoRequest0, apiMetadata0);
                break;
            }
            case 4: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvCallbacks");
                    gpfu0 = (iInterface1 instanceof gpfu) ? ((gpfu)iInterface1) : new gpfu(iBinder1);
                }
                GetDigitalCredentialPayloadRequest getDigitalCredentialPayloadRequest0 = (GetDigitalCredentialPayloadRequest)wbz.a(parcel0, GetDigitalCredentialPayloadRequest.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                gpfv.gr(parcel0);
                this.c(gpfu0, getDigitalCredentialPayloadRequest0, apiMetadata1);
                break;
            }
            case 5: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.firebase.pnv.internal.IFpnvCallbacks");
                    gpfu0 = (iInterface2 instanceof gpfu) ? ((gpfu)iInterface2) : new gpfu(iBinder2);
                }
                ExchangeCredentialResponseForPhoneNumberRequest exchangeCredentialResponseForPhoneNumberRequest0 = (ExchangeCredentialResponseForPhoneNumberRequest)wbz.a(parcel0, ExchangeCredentialResponseForPhoneNumberRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                gpfv.gr(parcel0);
                this.a(gpfu0, exchangeCredentialResponseForPhoneNumberRequest0, apiMetadata2);
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

