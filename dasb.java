import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.presence.CastIdentity;
import com.google.android.gms.nearby.presence.DataElementCollection;
import com.google.android.gms.nearby.presence.DeviceCapability;
import com.google.android.gms.nearby.presence.DeviceType;
import com.google.android.gms.nearby.presence.DiscoveryType;
import com.google.android.gms.nearby.presence.SequenceNumber;
import com.google.android.gms.nearby.presence.UwbConnectivityCapability;
import java.util.List;

public final class dasb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SequenceNumber sequenceNumber0 = null;
        CastIdentity castIdentity0 = null;
        byte[] arr_b = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        UwbConnectivityCapability uwbConnectivityCapability0 = null;
        DeviceType deviceType0 = null;
        byte[] arr_b1 = null;
        List list3 = null;
        List list4 = null;
        DiscoveryType discoveryType0 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    sequenceNumber0 = (SequenceNumber)baua.m(parcel0, v1, SequenceNumber.CREATOR);
                    break;
                }
                case 2: {
                    castIdentity0 = (CastIdentity)baua.m(parcel0, v1, CastIdentity.CREATOR);
                    break;
                }
                case 3: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v1, BleConnectivityInfo.CREATOR);
                    break;
                }
                case 6: {
                    list1 = baua.y(parcel0, v1, WifiLanConnectivityInfo.CREATOR);
                    break;
                }
                case 7: {
                    list2 = baua.y(parcel0, v1, BluetoothConnectivityInfo.CREATOR);
                    break;
                }
                case 8: {
                    uwbConnectivityCapability0 = (UwbConnectivityCapability)baua.m(parcel0, v1, UwbConnectivityCapability.CREATOR);
                    break;
                }
                case 9: {
                    deviceType0 = (DeviceType)baua.m(parcel0, v1, DeviceType.CREATOR);
                    break;
                }
                case 10: {
                    arr_b1 = baua.E(parcel0, v1);
                    break;
                }
                case 11: {
                    list3 = baua.y(parcel0, v1, DeviceCapability.CREATOR);
                    break;
                }
                case 12: {
                    list4 = baua.y(parcel0, v1, DeviceCapability.CREATOR);
                    break;
                }
                case 13: {
                    discoveryType0 = (DiscoveryType)baua.m(parcel0, v1, DiscoveryType.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataElementCollection(sequenceNumber0, castIdentity0, arr_b, z, list0, list1, list2, uwbConnectivityCapability0, deviceType0, arr_b1, list3, list4, discoveryType0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataElementCollection[v];
    }
}

