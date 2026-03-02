import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedIdpSignInAidlResponse;

public final class goso implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        DefaultOAuthCredential defaultOAuthCredential0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    defaultOAuthCredential0 = (DefaultOAuthCredential)baua.m(parcel0, v1, DefaultOAuthCredential.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnFailedIdpSignInAidlResponse(status0, defaultOAuthCredential0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnFailedIdpSignInAidlResponse[v];
    }
}

