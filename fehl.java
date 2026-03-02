import android.bluetooth.BluetoothServerSocket;
import java.util.concurrent.Callable;

public final class fehl implements Callable {
    public final fehs a;

    public fehl(fehs fehs0) {
        this.a = fehs0;
    }

    @Override
    public final Object call() {
        fehs fehs0 = this.a;
        BluetoothServerSocket bluetoothServerSocket0 = ((feqm)fehs0.d).d.a(fehs0.b);
        feqd feqd0 = new feqd(((feqm)fehs0.d), bluetoothServerSocket0);
        feqd feqd1 = (feqd)((feqm)fehs0.d).p.getAndSet(feqd0);
        if(feqd1 != null) {
            ffmn.a("McuManager", "startAcceptLoop: join existing looper: %s", new Object[]{feqd1});
            feqd1.a();
        }
        feqd0.start();
        int v = bluetoothServerSocket0.getPsm();
        fehs0.e.a("startConnection: Socket created. PSM=" + v);
        Object object0 = v;
        ffmn.a("BleOffloadServerConn", "BLE server with PSM=%d is listening", new Object[]{object0});
        return object0;
    }
}

