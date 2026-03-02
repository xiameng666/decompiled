import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dynamiteloader.DynamiteFlags;

public final class bjin implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        gged_interceptors gged0 = ggna.a;
        gged_interceptors gged1 = gged0;
        gged_interceptors gged2 = gged1;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 9: {
                    z2 = baua.D(parcel0, v1);
                    break;
                }
                case 10: {
                    gged0 = baua.x(parcel0, v1);
                    break;
                }
                case 11: {
                    z3 = baua.D(parcel0, v1);
                    break;
                }
                case 12: {
                    gged1 = baua.x(parcel0, v1);
                    break;
                }
                case 17: {
                    z4 = baua.D(parcel0, v1);
                    break;
                }
                case 18: {
                    gged2 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DynamiteFlags(z, z1, z2, gged0, z3, gged1, z4, gged2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DynamiteFlags[v];
    }
}

