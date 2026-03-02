import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import com.google.android.gms.nearby.common.ble.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;

public final class gyiz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        IBinder iBinder0 = null;
        WorkSource workSource0 = null;
        BleFilter[] arr_bleFilter = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 3: {
                    workSource0 = (WorkSource)baua.m(parcel0, v1, WorkSource.CREATOR);
                    break;
                }
                case 4: {
                    arr_bleFilter = (BleFilter[])baua.J(parcel0, v1, BleFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OperationRequest(arr_b, iBinder0, workSource0, arr_bleFilter);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OperationRequest[v];
    }
}

