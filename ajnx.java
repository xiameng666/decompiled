import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.GplusInfoRequest;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

public final class ajnx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Account account0 = null;
        int v1 = 0;
        CaptchaSolution captchaSolution0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    captchaSolution0 = (CaptchaSolution)baua.m(parcel0, v2, CaptchaSolution.CREATOR);
                    break;
                }
                case 4: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GplusInfoRequest(v1, s, captchaSolution0, account0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GplusInfoRequest[v];
    }
}

