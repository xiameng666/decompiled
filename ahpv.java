import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.SignInCredential;

public final class ahpv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SignInCredential signInCredential0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                signInCredential0 = (SignInCredential)baua.m(parcel0, v1, SignInCredential.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new CompleteSignInResult(signInCredential0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CompleteSignInResult[v];
    }
}

