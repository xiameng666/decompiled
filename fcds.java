import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

public final class fcds implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        LoyaltyPointsBalance loyaltyPointsBalance0 = null;
        TimeInterval timeInterval0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    loyaltyPointsBalance0 = (LoyaltyPointsBalance)baua.m(parcel0, v1, LoyaltyPointsBalance.CREATOR);
                    break;
                }
                case 5: {
                    timeInterval0 = (TimeInterval)baua.m(parcel0, v1, TimeInterval.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LoyaltyPoints(s, loyaltyPointsBalance0, timeInterval0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LoyaltyPoints[v];
    }
}

