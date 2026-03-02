import android.bluetooth.BluetoothSocket;
import android.util.Log;
import java.util.Map;

public final class feiz implements fejc {
    public final fejb a;
    public final BluetoothSocket b;

    public feiz(fejb fejb0, BluetoothSocket bluetoothSocket0) {
        this.a = fejb0;
        this.b = bluetoothSocket0;
    }

    @Override  // fejc
    public final void a() {
        if(Log.isLoggable("L2capConnectionHandler", 3)) {
            Log.d("L2capConnectionHandler", "Removing socket from active connections");
        }
        Map map0 = this.a.g;
        map0.remove(this.b);
        feif feif0 = this.a.h;
        if(feif0 != null) {
            feif0.a(((boolean)(map0.isEmpty() ^ 1)));
        }
    }
}

