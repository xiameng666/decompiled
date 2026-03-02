import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.ConnectionsDevice;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfoV2;
import com.google.android.gms.nearby.connection.v3.dct.DctDevice;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnInternetConnectionChangedParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.presence.PresenceDevice;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class czdz {
    public static cuwd a(int v, byte[] arr_b) {
        switch(v) {
            case 1: {
                return (cuwd)czdz.o(arr_b, ConnectionsDevice.CREATOR);
            }
            case 2: {
                return (cuwd)czdz.o(arr_b, PresenceDevice.CREATOR);
            }
            default: {
                return null;
            }
        }
    }

    public static cuwd b(OnBandwidthChangedParams onBandwidthChangedParams0) {
        cuwd cuwd0;
        int v = onBandwidthChangedParams0.d;
        if(v == 2) {
            cuwd0 = onBandwidthChangedParams0.e;
            batl.s(cuwd0);
        }
        else {
            switch(v) {
                case 1: {
                    cuwd0 = onBandwidthChangedParams0.f;
                    batl.s(cuwd0);
                    break;
                }
                case 3: {
                    cuwd0 = onBandwidthChangedParams0.g;
                    batl.s(cuwd0);
                    break;
                }
                default: {
                    cuwd0 = null;
                }
            }
        }
        batl.s(cuwd0);
        return cuwd0;
    }

    public static cuwd c(OnConnectionInitiatedParams onConnectionInitiatedParams0) {
        cuwd cuwd0;
        int v = onConnectionInitiatedParams0.i;
        if(v == 2) {
            cuwd0 = onConnectionInitiatedParams0.j;
            batl.s(cuwd0);
        }
        else {
            switch(v) {
                case 1: {
                    cuwd0 = onConnectionInitiatedParams0.k;
                    batl.s(cuwd0);
                    break;
                }
                case 3: {
                    cuwd0 = onConnectionInitiatedParams0.l;
                    batl.s(cuwd0);
                    break;
                }
                default: {
                    cuwd0 = null;
                }
            }
        }
        batl.s(cuwd0);
        return cuwd0;
    }

    public static cuwd d(OnConnectionResultParams onConnectionResultParams0) {
        cuwd cuwd0;
        int v = onConnectionResultParams0.d;
        if(v == 2) {
            cuwd0 = onConnectionResultParams0.e;
            batl.s(cuwd0);
        }
        else {
            switch(v) {
                case 1: {
                    cuwd0 = onConnectionResultParams0.f;
                    batl.s(cuwd0);
                    break;
                }
                case 3: {
                    cuwd0 = onConnectionResultParams0.g;
                    batl.s(cuwd0);
                    break;
                }
                default: {
                    cuwd0 = null;
                }
            }
        }
        batl.s(cuwd0);
        return cuwd0;
    }

    public static cuwd e(OnDisconnectedParams onDisconnectedParams0) {
        cuwd cuwd0;
        int v = onDisconnectedParams0.b;
        if(v == 2) {
            cuwd0 = onDisconnectedParams0.c;
            batl.s(cuwd0);
        }
        else {
            switch(v) {
                case 1: {
                    cuwd0 = onDisconnectedParams0.d;
                    batl.s(cuwd0);
                    break;
                }
                case 3: {
                    cuwd0 = onDisconnectedParams0.e;
                    batl.s(cuwd0);
                    break;
                }
                default: {
                    cuwd0 = null;
                }
            }
        }
        batl.s(cuwd0);
        return cuwd0;
    }

    public static cuwd f(OnInternetConnectionChangedParams onInternetConnectionChangedParams0) {
        cuwd cuwd0 = onInternetConnectionChangedParams0.d;
        if(cuwd0 != null) {
            return cuwd0;
        }
        throw new NullPointerException("null reference");
    }

    public static cuwd g(SendConnectionRequestParams sendConnectionRequestParams0) {
        cuwd cuwd0;
        int v = sendConnectionRequestParams0.j;
        if(v == 2) {
            cuwd0 = sendConnectionRequestParams0.k;
        }
        else {
            switch(v) {
                case 1: {
                    cuwd0 = sendConnectionRequestParams0.l;
                    break;
                }
                case 3: {
                    cuwd0 = sendConnectionRequestParams0.m;
                    break;
                }
                default: {
                    cuwd0 = null;
                }
            }
        }
        batl.s(cuwd0);
        return cuwd0;
    }

    public static List h(byte[] arr_b) {
        List list0 = new ArrayList();
        if(arr_b != null) {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            int v = byteArrayInputStream0.read();
            int v1 = 0;
            while(v1 < v) {
                int v2 = byteArrayInputStream0.read();
                byte[] arr_b1 = new byte[2];
                try {
                    byteArrayInputStream0.read(arr_b1);
                }
                catch(IOException unused_ex) {
                    break;
                }
                byte[] arr_b2 = new byte[cuve.a(arr_b1)];
                try {
                    byteArrayInputStream0.read(arr_b2);
                    switch(v2) {
                        case 2: {
                            goto label_13;
                        }
                        case 4: {
                            goto label_17;
                        }
                        case 5: {
                            goto label_21;
                        }
                    }
                }
                catch(IOException unused_ex) {
                    break;
                }
                goto label_24;
            label_13:
                BluetoothConnectivityInfo bluetoothConnectivityInfo0 = (BluetoothConnectivityInfo)czdz.o(arr_b2, BluetoothConnectivityInfo.CREATOR);
                if(bluetoothConnectivityInfo0 != null) {
                    list0.add(bluetoothConnectivityInfo0);
                    goto label_24;
                label_17:
                    BleConnectivityInfo bleConnectivityInfo0 = (BleConnectivityInfo)czdz.o(arr_b2, BleConnectivityInfo.CREATOR);
                    if(bleConnectivityInfo0 != null) {
                        list0.add(bleConnectivityInfo0);
                        goto label_24;
                    label_21:
                        WifiLanConnectivityInfo wifiLanConnectivityInfo0 = (WifiLanConnectivityInfo)czdz.o(arr_b2, WifiLanConnectivityInfo.CREATOR);
                        if(wifiLanConnectivityInfo0 != null) {
                            list0.add(wifiLanConnectivityInfo0);
                        }
                    }
                }
            label_24:
                ++v1;
            }
        }
        return list0;
    }

    public static List i(byte[] arr_b) {
        List list0 = new ArrayList();
        if(arr_b != null) {
            for(int v = 0; v < arr_b.length; v += v1) {
                byte[] arr_b1 = Arrays.copyOfRange(arr_b, v, arr_b.length);
                int v1 = cuwa.a(arr_b1) + cuwa.c(arr_b1);
                cuvx cuvx0 = cuvw.a(Arrays.copyOf(arr_b1, v1));
                if(cuvx0 != null) {
                    list0.add(cuvx0);
                }
            }
        }
        return list0;
    }

    public static void j(czea czea0, cuwd cuwd0) {
        boolean z = true;
        switch(cuwd0.a()) {
            case 1: {
                czea0.a(cuwd0.a());
                czea0.a.d = (ConnectionsDevice)cuwd0;
                break;
            }
            case 2: {
                czea0.a(cuwd0.a());
                czea0.a.c = (PresenceDevice)cuwd0;
                return;
            }
            case 3: {
                czea0.a(cuwd0.a());
                czea0.a.e = (DctDevice)cuwd0;
            }
        }
        if(czea0.a.b == 0) {
            z = false;
        }
        batl.b(z);
    }

    public static void k(czgx czgx0, cuwd cuwd0) {
        boolean z = true;
        switch(cuwd0.a()) {
            case 1: {
                czgx0.b(cuwd0.a());
                czgx0.a(((ConnectionsDevice)cuwd0));
                break;
            }
            case 2: {
                czgx0.b(cuwd0.a());
                czgx0.a.e = (PresenceDevice)cuwd0;
                return;
            }
            case 3: {
                czgx0.b(cuwd0.a());
                czgx0.a.g = (DctDevice)cuwd0;
            }
        }
        if(czgx0.a.d == 0) {
            z = false;
        }
        batl.b(z);
    }

    public static boolean l(int v) {
        return v != 0;
    }

    public static byte[] m(List list0) {
        byte[] arr_b;
        if(!list0.isEmpty()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            byteArrayOutputStream0.write(list0.size());
            for(Object object0: list0) {
                cuvx cuvx0 = (cuvx)object0;
                try {
                    if((cuvx0 instanceof BluetoothConnectivityInfo)) {
                        arr_b = bauc.n(((BluetoothConnectivityInfo)cuvx0));
                    }
                    else if((cuvx0 instanceof BleConnectivityInfo)) {
                        arr_b = bauc.n(((BleConnectivityInfo)cuvx0));
                    }
                    else if((cuvx0 instanceof WifiLanConnectivityInfo)) {
                        arr_b = bauc.n(((WifiLanConnectivityInfo)cuvx0));
                    }
                    else {
                        arr_b = (cuvx0 instanceof WifiLanConnectivityInfoV2) ? bauc.n(((WifiLanConnectivityInfoV2)cuvx0)) : null;
                    }
                    if(arr_b == null) {
                        return null;
                    }
                    byteArrayOutputStream0.write(cuvx0.a());
                    byteArrayOutputStream0.write(cuve.d(arr_b.length));
                    byteArrayOutputStream0.write(arr_b);
                }
                catch(IOException unused_ex) {
                    return null;
                }
            }
            return byteArrayOutputStream0.toByteArray();
        }
        try {
        }
        catch(IOException unused_ex) {
        }
        return null;
    }

    public static byte[] n(List list0) {
        if(!list0.isEmpty()) {
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            for(Object object0: list0) {
                cuvx cuvx0 = (cuvx)object0;
                try {
                    byte[] arr_b = cuvx0.g();
                    if(arr_b == null) {
                        continue;
                    }
                    byteArrayOutputStream0.write(arr_b);
                }
                catch(IOException unused_ex) {
                    return null;
                }
            }
            return byteArrayOutputStream0.toByteArray();
        }
        return null;
    }

    private static SafeParcelable o(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        try {
            Parcel parcel0 = Parcel.obtain();
            parcel0.unmarshall(arr_b, 0, arr_b.length);
            parcel0.setDataPosition(0);
            SafeParcelable safeParcelable0 = (SafeParcelable)parcelable$Creator0.createFromParcel(parcel0);
            parcel0.recycle();
            return safeParcelable0;
        }
        catch(batz unused_ex) {
            return null;
        }
    }
}

