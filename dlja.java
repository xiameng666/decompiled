import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SetOnboardingInfoRequest;

public final class dlja implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        Account account0 = null;
        IntentSource intentSource0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 2: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 3: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v1, IntentSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetOnboardingInfoRequest(protoSafeParcelable0, account0, intentSource0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetOnboardingInfoRequest[v];
    }
}

