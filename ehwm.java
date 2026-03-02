import android.bluetooth.BluetoothGatt;
import j..util.Objects;

final class ehwm implements Runnable {
    final ehwn a;

    public ehwm(ehwn ehwn0) {
        Objects.requireNonNull(ehwn0);
        this.a = ehwn0;
        super();
    }

    @Override
    public final void run() {
        ehwn ehwn0 = this.a;
        BluetoothGatt bluetoothGatt0 = ehwn0.d;
        if(bluetoothGatt0 == null) {
            return;
        }
        bluetoothGatt0.readRemoteRssi();
        ehwn0.b.postDelayed(ehwn0.g, 200L);
    }
}

