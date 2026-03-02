import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.fill.SafeFillField;
import com.google.android.gms.autofill.metrics.SafeFillContext;
import java.util.List;

public final class aoas implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        byte[][] arr2_b = null;
        List list0 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 2: {
                    arr2_b = baua.M(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    list0 = baua.y(parcel0, v2, SafeFillField.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SafeFillContext(arr_b, arr2_b, v1, z, z1, z2, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SafeFillContext[v];
    }
}

