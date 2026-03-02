import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.api.aidlrequests.StartMfaPhoneNumberSignInAidlRequest;

public final class gosi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        long v1 = 0L;
        PhoneMultiFactorInfo phoneMultiFactorInfo0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    phoneMultiFactorInfo0 = (PhoneMultiFactorInfo)baua.m(parcel0, v2, PhoneMultiFactorInfo.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartMfaPhoneNumberSignInAidlRequest(phoneMultiFactorInfo0, s, s1, v1, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartMfaPhoneNumberSignInAidlRequest[v];
    }
}

