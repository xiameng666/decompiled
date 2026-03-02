import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ProviderUserInfoList;
import java.util.List;

public final class goyc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        ProviderUserInfoList providerUserInfoList0 = null;
        String s4 = null;
        String s5 = null;
        DefaultOAuthCredential defaultOAuthCredential0 = null;
        List list0 = null;
        boolean z = false;
        boolean z1 = false;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    providerUserInfoList0 = (ProviderUserInfoList)baua.m(parcel0, v3, ProviderUserInfoList.CREATOR);
                    break;
                }
                case 8: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                case 9: {
                    s5 = baua.s(parcel0, v3);
                    break;
                }
                case 10: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 11: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 12: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 13: {
                    defaultOAuthCredential0 = (DefaultOAuthCredential)baua.m(parcel0, v3, DefaultOAuthCredential.CREATOR);
                    break;
                }
                case 14: {
                    list0 = baua.y(parcel0, v3, MfaInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAccountInfoUser(s, s1, z, s2, s3, providerUserInfoList0, s4, s5, v1, v2, z1, defaultOAuthCredential0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAccountInfoUser[v];
    }
}

