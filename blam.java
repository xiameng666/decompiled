import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;

public final class blam implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ServiceDumpRequest serviceDumpRequest0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    serviceDumpRequest0 = (ServiceDumpRequest)baua.m(parcel0, v1, ServiceDumpRequest.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ServiceDump(serviceDumpRequest0, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ServiceDump[v];
    }
}

