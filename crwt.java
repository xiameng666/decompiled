import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;

public final class crwt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Long long0 = (long)0L;
        ConsentStatus consentStatus0 = null;
        ConsentAgreementText consentAgreementText0 = null;
        Integer integer0 = null;
        Long long1 = null;
        Integer integer1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    consentStatus0 = (ConsentStatus)baua.m(parcel0, v1, ConsentStatus.CREATOR);
                    break;
                }
                case 2: {
                    consentAgreementText0 = (ConsentAgreementText)baua.m(parcel0, v1, ConsentAgreementText.CREATOR);
                    break;
                }
                case 3: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 4: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 5: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                case 6: {
                    integer1 = baua.q(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetConsentInformationResponse(consentStatus0, consentAgreementText0, long0, integer0, long1, integer1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetConsentInformationResponse[v];
    }
}

