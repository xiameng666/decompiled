import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.BleConnectivityInfo;
import com.google.android.gms.nearby.connection.BluetoothConnectivityInfo;
import com.google.android.gms.nearby.connection.WifiLanConnectivityInfo;
import com.google.android.gms.nearby.internal.connection.OnStartListeningForIncomingConnectionsResultParams;
import java.util.ArrayList;

public final class czge extends wby implements czgf {
    private final azvd a;

    public czge() {
        super("com.google.android.gms.nearby.internal.connection.IStartListeningForIncomingConnectionsResultListener");
    }

    public czge(azvd azvd0) {
        super("com.google.android.gms.nearby.internal.connection.IStartListeningForIncomingConnectionsResultListener");
        this.a = azvd0;
    }

    @Override  // czgf
    public final void a(OnStartListeningForIncomingConnectionsResultParams onStartListeningForIncomingConnectionsResultParams0) {
        Status status0 = czbf.s(onStartListeningForIncomingConnectionsResultParams0.a);
        if(status0.e()) {
            ArrayList arrayList0 = new ArrayList();
            BluetoothConnectivityInfo bluetoothConnectivityInfo0 = onStartListeningForIncomingConnectionsResultParams0.d;
            if(bluetoothConnectivityInfo0 != null) {
                arrayList0.add(bluetoothConnectivityInfo0);
            }
            BleConnectivityInfo bleConnectivityInfo0 = onStartListeningForIncomingConnectionsResultParams0.c;
            if(bleConnectivityInfo0 != null) {
                arrayList0.add(bleConnectivityInfo0);
            }
            WifiLanConnectivityInfo wifiLanConnectivityInfo0 = onStartListeningForIncomingConnectionsResultParams0.e;
            if(wifiLanConnectivityInfo0 != null) {
                arrayList0.add(wifiLanConnectivityInfo0);
            }
            cuwr cuwr0 = new cuwr(onStartListeningForIncomingConnectionsResultParams0.b, arrayList0);
            this.a.b(cuwr0);
            return;
        }
        this.a.a(status0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 2) {
            OnStartListeningForIncomingConnectionsResultParams onStartListeningForIncomingConnectionsResultParams0 = (OnStartListeningForIncomingConnectionsResultParams)wbz.a(parcel0, OnStartListeningForIncomingConnectionsResultParams.CREATOR);
            czge.gr(parcel0);
            this.a(onStartListeningForIncomingConnectionsResultParams0);
            return true;
        }
        return false;
    }
}

