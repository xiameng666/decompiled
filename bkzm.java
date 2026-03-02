import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;

public final class bkzm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ServiceDumpRequest[] arr_serviceDumpRequest = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    z2 = baua.D(parcel0, v1);
                    break;
                }
                case 6: {
                    z3 = baua.D(parcel0, v1);
                    break;
                }
                case 7: {
                    arr_serviceDumpRequest = (ServiceDumpRequest[])baua.J(parcel0, v1, ServiceDumpRequest.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LogOptions(s, z, z1, z2, z3, arr_serviceDumpRequest);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LogOptions[v];
    }
}

