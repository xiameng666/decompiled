import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;

public final class gosm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UserProfileChangeRequest userProfileChangeRequest0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    userProfileChangeRequest0 = (UserProfileChangeRequest)baua.m(parcel0, v1, UserProfileChangeRequest.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateProfileAidlRequest(userProfileChangeRequest0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateProfileAidlRequest[v];
    }
}

