import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.VerifyBeforeUpdateEmailAidlRequest;

public final class gosn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        ActionCodeSettings actionCodeSettings0 = null;
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
                    actionCodeSettings0 = (ActionCodeSettings)baua.m(parcel0, v1, ActionCodeSettings.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new VerifyBeforeUpdateEmailAidlRequest(s, s1, actionCodeSettings0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new VerifyBeforeUpdateEmailAidlRequest[v];
    }
}

