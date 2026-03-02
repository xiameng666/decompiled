import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.net.wifi.p2p.WifiP2pManager.DeviceInfoListener;

public final class eqyq implements WifiP2pManager.DeviceInfoListener {
    public final eqyw a;

    public eqyq(eqyw eqyw0) {
        this.a = eqyw0;
    }

    @Override  // android.net.wifi.p2p.WifiP2pManager$DeviceInfoListener
    public final void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice0) {
        if(wifiP2pDevice0 != null) {
            eqyw eqyw0 = this.a;
            eqyw.f.d("Android >= Q: get Wifi P2p address.", new Object[0]);
            eqyw0.r = wifiP2pDevice0.deviceAddress;
            WifiP2pManager.Channel wifiP2pManager$Channel0 = eqyw0.u;
            if(wifiP2pManager$Channel0 != null) {
                wifiP2pManager$Channel0.close();
                eqyw0.u = null;
            }
        }
    }
}

