import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.EndCondition;
import com.google.android.gms.locationsharingreporter.Lifecycle;

public final class cobf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        EndCondition endCondition0 = null;
        boolean z = false;
        int[] arr_v = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 2: {
                    endCondition0 = (EndCondition)baua.m(parcel0, v1, EndCondition.CREATOR);
                    break;
                }
                case 3: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Lifecycle(z, endCondition0, arr_v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Lifecycle[v];
    }
}

