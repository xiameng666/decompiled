import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.IntentSource;
import com.google.android.gms.pay.ViewValuableSearchLoyaltyCardProgramIntentArgs;

public final class dllg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IntentSource intentSource0 = null;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 3: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v2, IntentSource.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ViewValuableSearchLoyaltyCardProgramIntentArgs(v1, z, intentSource0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ViewValuableSearchLoyaltyCardProgramIntentArgs[v];
    }
}

