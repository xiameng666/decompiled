import android.bluetooth.BluetoothDevice;

public final class cykm implements kar {
    public final cylw a;
    public final byte[] b;
    public final BluetoothDevice c;

    public cykm(cylw cylw0, byte[] arr_b, BluetoothDevice bluetoothDevice0) {
        this.a = cylw0;
        this.b = arr_b;
        this.c = bluetoothDevice0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        cyna cyna0 = (cyna)object0;
        cyna0.p(true);
        cyna0.o(17, this.b);
        ((ggtj)this.a.n.d().ar(7858)).B("NearbyDeviceManager: Add device %s into Sass dataStore due to notify capability event", fgjo.c(this.c));
    }
}

