import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.EsimTransferExceptionInfo;
import com.google.android.gms.esim.ProfileTransferCredential;
import com.google.android.gms.esim.ProfileTransferMessageInfo;
import com.google.android.gms.esim.ProfileTransferWebSheetInfo;

public final class bjoy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        ProfileTransferWebSheetInfo profileTransferWebSheetInfo0 = null;
        ProfileTransferMessageInfo profileTransferMessageInfo0 = null;
        EsimTransferExceptionInfo esimTransferExceptionInfo0 = null;
        boolean z = false;
        boolean z1 = false;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    profileTransferWebSheetInfo0 = (ProfileTransferWebSheetInfo)baua.m(parcel0, v2, ProfileTransferWebSheetInfo.CREATOR);
                    break;
                }
                case 6: {
                    profileTransferMessageInfo0 = (ProfileTransferMessageInfo)baua.m(parcel0, v2, ProfileTransferMessageInfo.CREATOR);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 8: {
                    esimTransferExceptionInfo0 = (EsimTransferExceptionInfo)baua.m(parcel0, v2, EsimTransferExceptionInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProfileTransferCredential(s, z, s1, z1, profileTransferWebSheetInfo0, profileTransferMessageInfo0, v1, esimTransferExceptionInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProfileTransferCredential[v];
    }
}

