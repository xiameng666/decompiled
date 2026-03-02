import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfoV2;
import com.google.android.gms.nearby.internal.connection.OnStartListeningForIncomingConnectionsResultParams;

public final class czhb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        BleConnectivityInfo bleConnectivityInfo0 = null;
        BluetoothConnectivityInfo bluetoothConnectivityInfo0 = null;
        WifiLanConnectivityInfo wifiLanConnectivityInfo0 = null;
        WifiLanConnectivityInfoV2 wifiLanConnectivityInfoV20 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    bleConnectivityInfo0 = (BleConnectivityInfo)baua.m(parcel0, v2, BleConnectivityInfo.CREATOR);
                    break;
                }
                case 4: {
                    bluetoothConnectivityInfo0 = (BluetoothConnectivityInfo)baua.m(parcel0, v2, BluetoothConnectivityInfo.CREATOR);
                    break;
                }
                case 5: {
                    wifiLanConnectivityInfo0 = (WifiLanConnectivityInfo)baua.m(parcel0, v2, WifiLanConnectivityInfo.CREATOR);
                    break;
                }
                case 6: {
                    wifiLanConnectivityInfoV20 = (WifiLanConnectivityInfoV2)baua.m(parcel0, v2, WifiLanConnectivityInfoV2.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new OnStartListeningForIncomingConnectionsResultParams(v1, s, bleConnectivityInfo0, bluetoothConnectivityInfo0, wifiLanConnectivityInfo0, wifiLanConnectivityInfoV20);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OnStartListeningForIncomingConnectionsResultParams[v];
    }
}

