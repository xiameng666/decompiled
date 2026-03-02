import android.bluetooth.BluetoothDevice;

public final class cykx implements kar {
    public final cylw a;

    public cykx(cylw cylw0) {
        this.a = cylw0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)object0;
        cylf cylf0 = new cylf(this.a);
        this.a.d.execute(cylf0);
    }
}

