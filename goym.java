import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ResetPasswordResponse;

public final class goym implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        MfaInfo mfaInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    mfaInfo0 = (MfaInfo)baua.m(parcel0, v1, MfaInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ResetPasswordResponse(s, s1, s2, mfaInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ResetPasswordResponse[v];
    }
}

