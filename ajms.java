import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.util.List;

public final class ajms implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        List list0 = null;
        String s1 = null;
        CaptchaChallenge captchaChallenge0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    captchaChallenge0 = (CaptchaChallenge)baua.m(parcel0, v1, CaptchaChallenge.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AccountNameCheckResponse(s, list0, s1, captchaChallenge0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountNameCheckResponse[v];
    }
}

