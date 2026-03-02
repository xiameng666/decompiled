import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import com.google.android.gms.recaptcha.internal.InitResults;

public final class ejpv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RecaptchaHandle recaptchaHandle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                recaptchaHandle0 = (RecaptchaHandle)baua.m(parcel0, v1, RecaptchaHandle.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new InitResults(recaptchaHandle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InitResults[v];
    }
}

