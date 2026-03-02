import android.bluetooth.BluetoothDevice;

public final class cyqb implements kba {
    public final cyqk a;
    public final BluetoothDevice b;
    public final hfub c;
    public final byte[] d;

    public cyqb(cyqk cyqk0, BluetoothDevice bluetoothDevice0, hfub hfub0, byte[] arr_b) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
        this.c = hfub0;
        this.d = arr_b;
    }

    @Override  // kba
    public final Object a() {
        return this.a.c.a(this.b, this.c, this.d);
    }
}

