import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;

public final class gorv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        PhoneAuthCredential phoneAuthCredential0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    phoneAuthCredential0 = (PhoneAuthCredential)baua.m(parcel0, v1, PhoneAuthCredential.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LinkPhoneAuthCredentialAidlRequest(s, phoneAuthCredential0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LinkPhoneAuthCredentialAidlRequest[v];
    }
}

