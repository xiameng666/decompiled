import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothLeAudio;
import android.bluetooth.BluetoothProfile;
import j..util.Objects;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class cykz implements Runnable {
    public final cylw a;
    public final int b;

    public cykz(cylw cylw0, int v) {
        this.a = cylw0;
        this.b = v;
    }

    @Override
    public final void run() {
        cyko cyko0;
        int v;
        cylw cylw0 = this.a;
        Iterator iterator0 = new LinkedHashSet(cylw0.a).iterator();
        boolean z = false;
        while(true) {
            v = this.b;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            cyna cyna0 = (cyna)object0;
            cync cync0 = cyna0.d.a();
            if(cync0 != null && cync0.e <= 0L && cync0.l == 2) {
                ((ggtj)cyna0.o.d().ar(7912)).z("SassDevice: setPendingAudioUsage to %d", v);
                cyna0.j = v;
                return;
            }
            if(cyna0.b.a().l() && cyna0.z(v)) {
                z = true;
            }
        }
        if(z) {
            int[] arr_v = {2, 1};
            if(gxuo.q(cylw0.e)) {
                ((ggtj)cylw0.n.d().ar(7847)).x("NearbyDeviceManager: notifyActiveAudioStatusChanged profile list including BluetoothLeAudio ");
                arr_v = new int[]{2, 1, 22};
            }
            int v1 = 0;
            while(v1 < arr_v.length) {
                int v2 = arr_v[v1];
                BluetoothProfile bluetoothProfile0 = cylw0.b.b.d(v2);
                if(bluetoothProfile0 == null) {
                    ((ggtj)cylw0.n.d().ar(7846)).z("NearbyDeviceManager: notifyActiveAudioStatusChanged failed to get profile proxy for %d", v2);
                }
                else if((bluetoothProfile0 instanceof BluetoothA2dp)) {
                    Objects.requireNonNull(((BluetoothA2dp)bluetoothProfile0));
                    cyko0 = new cyko(((BluetoothA2dp)bluetoothProfile0));
                    goto label_37;
                }
                else if((bluetoothProfile0 instanceof BluetoothHeadset)) {
                    Objects.requireNonNull(((BluetoothHeadset)bluetoothProfile0));
                    cyko0 = new cykp(((BluetoothHeadset)bluetoothProfile0));
                    goto label_37;
                }
                else if(bbqa.c() && (bluetoothProfile0 instanceof BluetoothLeAudio)) {
                    cyko0 = new cykq(cylw0);
                label_37:
                    gged_interceptors gged0 = gxuo.e(bluetoothProfile0);
                    if(gged0 != null && !gged0.isEmpty()) {
                        int v3 = gged0.size();
                        for(int v4 = 0; v4 < v3; ++v4) {
                            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)gged0.get(v4);
                            cyna cyna1 = cylw0.n(bluetoothDevice0.getAddress());
                            if(cyna1 != null) {
                                boolean z1 = cyko0.a(bluetoothDevice0);
                                ((ggtj)cylw0.n.d().ar(7845)).X("NearbyDeviceManager: notifyActiveAudioStatusChanged check device %s, profile %d, active state:%b", fgjo.c(bluetoothDevice0), Integer.valueOf(v2), Boolean.valueOf(z1));
                                if(z1 && cyna1.z(v)) {
                                    cyna1.u(v);
                                    return;
                                }
                            }
                        }
                    }
                    else {
                        ((ggtj)cylw0.n.d().ar(7844)).z("NearbyDeviceManager: notifyActiveAudioStatusChanged failed to get connected devices from profile proxy %d", v2);
                    }
                }
                else {
                    ((ggtj)cylw0.n.g().ar(7843)).z("NearbyDeviceManager: Not supported proxy for %d", v2);
                }
                ++v1;
            }
        }
    }
}

