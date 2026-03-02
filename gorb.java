import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

public final class gorb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        VerifyAssertionRequest verifyAssertionRequest0 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    verifyAssertionRequest0 = (VerifyAssertionRequest)baua.m(parcel0, v1, VerifyAssertionRequest.CREATOR);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DefaultOAuthCredential(s, s1, s2, verifyAssertionRequest0, s3, s4, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DefaultOAuthCredential[v];
    }
}

