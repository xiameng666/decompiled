import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.SetConsentStatusRequest;

public final class crww implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ParcelUuid parcelUuid0 = null;
        ConsentStatus consentStatus0 = null;
        Long long0 = null;
        Integer integer0 = null;
        Long long1 = null;
        Bundle bundle0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    parcelUuid0 = (ParcelUuid)baua.m(parcel0, v2, ParcelUuid.CREATOR);
                    break;
                }
                case 3: {
                    consentStatus0 = (ConsentStatus)baua.m(parcel0, v2, ConsentStatus.CREATOR);
                    break;
                }
                case 4: {
                    long0 = baua.r(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 6: {
                    integer0 = baua.q(parcel0, v2);
                    break;
                }
                case 7: {
                    long1 = baua.r(parcel0, v2);
                    break;
                }
                case 8: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetConsentStatusRequest(s, parcelUuid0, consentStatus0, long0, v1, integer0, long1, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetConsentStatusRequest[v];
    }
}

