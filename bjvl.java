import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.CarrierInfo;
import com.google.android.gms.esim.EsimTransferStatus;
import com.google.android.gms.esim.ProfileTransferCredential;
import com.google.android.gms.esim.ProfileTransferData;
import com.google.android.gms.esim.ProfilesTransferData;
import com.google.android.gms.esim.internal.MessagePayload;
import java.util.List;

public final class bjvl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        int v4 = 0;
        boolean z = false;
        boolean z1 = false;
        int v5 = 0;
        int v6 = 0;
        String s = null;
        ProfilesTransferData profilesTransferData0 = null;
        List list0 = null;
        ProfileTransferData profileTransferData0 = null;
        ProfileTransferCredential profileTransferCredential0 = null;
        List list1 = null;
        List list2 = null;
        while(parcel0.dataPosition() < v) {
            int v7 = parcel0.readInt();
            switch(((char)v7)) {
                case 1: {
                    v3 = baua.f(parcel0, v7);
                    break;
                }
                case 2: {
                    v4 = baua.f(parcel0, v7);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v7);
                    break;
                }
                case 4: {
                    profilesTransferData0 = (ProfilesTransferData)baua.m(parcel0, v7, ProfilesTransferData.CREATOR);
                    break;
                }
                case 5: {
                    list0 = baua.x(parcel0, v7);
                    break;
                }
                case 6: {
                    profileTransferData0 = (ProfileTransferData)baua.m(parcel0, v7, ProfileTransferData.CREATOR);
                    break;
                }
                case 7: {
                    profileTransferCredential0 = (ProfileTransferCredential)baua.m(parcel0, v7, ProfileTransferCredential.CREATOR);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v7);
                    break;
                }
                case 9: {
                    v1 = baua.i(parcel0, v7);
                    break;
                }
                case 10: {
                    z1 = baua.D(parcel0, v7);
                    break;
                }
                case 11: {
                    list1 = baua.y(parcel0, v7, CarrierInfo.CREATOR);
                    break;
                }
                case 12: {
                    list2 = baua.y(parcel0, v7, EsimTransferStatus.CREATOR);
                    break;
                }
                case 13: {
                    v5 = baua.f(parcel0, v7);
                    break;
                }
                case 14: {
                    v6 = baua.f(parcel0, v7);
                    break;
                }
                case 15: {
                    v2 = baua.i(parcel0, v7);
                    break;
                }
                default: {
                    baua.C(parcel0, v7);
                }
            }
        }
        baua.A(parcel0, v);
        return new MessagePayload(v3, v4, s, profilesTransferData0, list0, profileTransferData0, profileTransferCredential0, z, v1, z1, list1, list2, v5, v6, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MessagePayload[v];
    }
}

