import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.AddValuableIntentArgs;
import com.google.android.gms.pay.IntentSource;

public final class dlbo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        IntentSource intentSource0 = null;
        String s1 = null;
        boolean z = false;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    intentSource0 = (IntentSource)baua.m(parcel0, v2, IntentSource.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AddValuableIntentArgs(v1, s, z, intentSource0, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AddValuableIntentArgs[v];
    }
}

