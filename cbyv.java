import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.learning.BrellaInvocationOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;

public final class cbyv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        InAppTrainingConstraints inAppTrainingConstraints0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    inAppTrainingConstraints0 = (InAppTrainingConstraints)baua.m(parcel0, v2, InAppTrainingConstraints.CREATOR);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new BrellaInvocationOptions(s, s1, v1, inAppTrainingConstraints0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BrellaInvocationOptions[v];
    }
}

