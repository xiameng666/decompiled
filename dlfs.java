import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.HomeIntentArgs;
import com.google.android.gms.pay.HomescreenConfig;
import com.google.android.gms.pay.IntentSource;

public final class dlfs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        IntentSource intentSource0 = null;
        HomescreenConfig homescreenConfig0 = null;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v1, IntentSource.CREATOR);
                    break;
                }
                case 3: {
                    homescreenConfig0 = (HomescreenConfig)baua.m(parcel0, v1, HomescreenConfig.CREATOR);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new HomeIntentArgs(z, intentSource0, homescreenConfig0, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HomeIntentArgs[v];
    }
}

