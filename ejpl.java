import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.recaptcha.RecaptchaResultData;
import com.google.android.gms.recaptcha.internal.ExecuteResults;

public final class ejpl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RecaptchaResultData recaptchaResultData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                recaptchaResultData0 = (RecaptchaResultData)baua.m(parcel0, v1, RecaptchaResultData.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new ExecuteResults(recaptchaResultData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ExecuteResults[v];
    }
}

