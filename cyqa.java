import android.bluetooth.BluetoothDevice;

public final class cyqa implements Runnable {
    public final cyqk a;
    public final BluetoothDevice b;
    public final boolean c;

    public cyqa(cyqk cyqk0, BluetoothDevice bluetoothDevice0, boolean z) {
        this.a = cyqk0;
        this.b = bluetoothDevice0;
        this.c = z;
    }

    @Override
    public final void run() {
        for(Object object0: this.a.d.values()) {
            cyqh cyqh0 = (cyqh)object0;
            if(cyqh0.j(this.b)) {
                cyqh0.d(this.c);
            }
        }
    }
}

