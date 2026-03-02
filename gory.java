import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.aidlrequests.SendGetOobConfirmationCodeEmailAidlRequest;

public final class gory implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ActionCodeSettings actionCodeSettings0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    actionCodeSettings0 = (ActionCodeSettings)baua.m(parcel0, v1, ActionCodeSettings.CREATOR);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SendGetOobConfirmationCodeEmailAidlRequest(s, actionCodeSettings0, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendGetOobConfirmationCodeEmailAidlRequest[v];
    }
}

