import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.api.aidlrequests.SignInWithEmailLinkAidlRequest;

public final class gosf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        EmailAuthCredential emailAuthCredential0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                emailAuthCredential0 = (EmailAuthCredential)baua.m(parcel0, v1, EmailAuthCredential.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SignInWithEmailLinkAidlRequest(emailAuthCredential0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SignInWithEmailLinkAidlRequest[v];
    }
}

