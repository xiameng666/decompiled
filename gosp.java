import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.List;

public final class gosp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        List list0 = null;
        DefaultOAuthCredential defaultOAuthCredential0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, MfaInfo.CREATOR);
                    break;
                }
                case 3: {
                    defaultOAuthCredential0 = (DefaultOAuthCredential)baua.m(parcel0, v1, DefaultOAuthCredential.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnFailedMfaSignInAidlResponse(s, list0, defaultOAuthCredential0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnFailedMfaSignInAidlResponse[v];
    }
}

