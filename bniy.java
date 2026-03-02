import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.LocationReportRequest;
import com.google.android.gms.findmydevice.spot.ScanResult;

public final class bniy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        ScanResult[] arr_scanResult = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    arr_scanResult = (ScanResult[])baua.J(parcel0, v2, ScanResult.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationReportRequest(arr_scanResult, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationReportRequest[v];
    }
}

