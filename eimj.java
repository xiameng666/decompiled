import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;

public final class eimj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        String s = null;
        String s1 = null;
        Flag flag0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    flag0 = (Flag)baua.m(parcel0, v1, Flag.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new FlagOverride(s, s1, flag0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FlagOverride[v];
    }
}

