import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ServiceDumpRequest;

public final class blao implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        String s = null;
        String s1 = null;
        String[] arr_s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ServiceDumpRequest(s, s1, arr_s, v1, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ServiceDumpRequest[v];
    }
}

