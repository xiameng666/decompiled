import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.ConversionCredentialData;
import com.google.android.gms.esim.ProfileTransferData;
import com.google.android.gms.esim.ProfileTransferMessageInfo;
import com.google.android.gms.esim.ProfileTransferWebSheetInfo;

public final class bjol implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        int v1 = 0;
        String s = null;
        ProfileTransferData profileTransferData0 = null;
        ProfileTransferWebSheetInfo profileTransferWebSheetInfo0 = null;
        ProfileTransferMessageInfo profileTransferMessageInfo0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    profileTransferData0 = (ProfileTransferData)baua.m(parcel0, v2, ProfileTransferData.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    profileTransferWebSheetInfo0 = (ProfileTransferWebSheetInfo)baua.m(parcel0, v2, ProfileTransferWebSheetInfo.CREATOR);
                    break;
                }
                case 5: {
                    profileTransferMessageInfo0 = (ProfileTransferMessageInfo)baua.m(parcel0, v2, ProfileTransferMessageInfo.CREATOR);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConversionCredentialData(s, profileTransferData0, z, profileTransferWebSheetInfo0, profileTransferMessageInfo0, s1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConversionCredentialData[v];
    }
}

