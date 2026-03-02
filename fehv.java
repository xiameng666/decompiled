import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;

public final class fehv implements jqv {
    public final fehy a;
    public final BluetoothDevice b;

    public fehv(fehy fehy0, BluetoothDevice bluetoothDevice0) {
        this.a = fehy0;
        this.b = bluetoothDevice0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        int v = this.a.a.getAndIncrement();
        ffmn.a("BleServiceMngr", "configureConnection: [%s]:%d", new Object[]{this.b, v});
        fehx fehx0 = new fehx(v, jqt0);
        BluetoothGatt bluetoothGatt0 = this.b.connectGatt(this.a.b, false, fehx0, 2);
        jqt0.a(new fehw(this.b, v, bluetoothGatt0), gmap.a);
        return "BleServiceManager-configure";
    }
}

