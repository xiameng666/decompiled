import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

public final class gorz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SendVerificationCodeRequest sendVerificationCodeRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                sendVerificationCodeRequest0 = (SendVerificationCodeRequest)baua.m(parcel0, v1, SendVerificationCodeRequest.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SendVerificationCodeAidlRequest(sendVerificationCodeRequest0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendVerificationCodeAidlRequest[v];
    }
}

