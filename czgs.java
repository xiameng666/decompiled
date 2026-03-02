import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;

public final class czgs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        BluetoothDevice bluetoothDevice0 = null;
        byte[] arr_b = null;
        ConnectionsDevice connectionsDevice0 = null;
        DctDevice dctDevice0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    bluetoothDevice0 = (BluetoothDevice)baua.m(parcel0, v2, BluetoothDevice.CREATOR);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 6: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 7: {
                    connectionsDevice0 = (ConnectionsDevice)baua.m(parcel0, v2, ConnectionsDevice.CREATOR);
                    break;
                }
                case 8: {
                    dctDevice0 = (DctDevice)baua.m(parcel0, v2, DctDevice.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnEndpointFoundParams(s, s1, s2, bluetoothDevice0, arr_b, v1, connectionsDevice0, dctDevice0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnEndpointFoundParams[v];
    }
}

