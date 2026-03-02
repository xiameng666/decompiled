import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

public final class eilx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Flag[] arr_flag = null;
        int v1 = 0;
        String[] arr_s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_flag = (Flag[])baua.J(parcel0, v2, Flag.CREATOR);
                    break;
                }
                case 4: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Configuration(v1, arr_flag, arr_s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Configuration[v];
    }
}

