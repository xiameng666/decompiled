import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.util.Log;

public final class feio {
    public final BluetoothAdapter a;
    public volatile BluetoothServerSocket b;
    public volatile fein c;
    public volatile feii d;

    public feio(BluetoothAdapter bluetoothAdapter0) {
        this.a = bluetoothAdapter0;
        this.c = null;
        this.b = null;
    }

    public static void a(String s) {
        if(Log.isLoggable("IosL2capSocketServer", 3)) {
            Log.d("IosL2capSocketServer", s);
        }
    }
}

