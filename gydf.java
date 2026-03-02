import android.bluetooth.BluetoothDevice;
import android.content.Context;

public final class gydf implements gelt {
    @Override  // gelt
    public final fgvb a(Context context0, String s, fgvd fgvd0) {
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)((gycy)cusq.c(context0, gycy.class)).a.get(s);
        batl.s(bluetoothDevice0);
        return new fgvb(bluetoothDevice0.connectGatt(context0, false, fgvd0.b, 2));
    }
}

