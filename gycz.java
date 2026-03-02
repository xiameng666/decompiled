import android.bluetooth.BluetoothGattService;
import j..util.Objects;

final class gycz extends fgvg {
    final gydb a;

    public gycz(gydb gydb0) {
        Objects.requireNonNull(gydb0);
        this.a = gydb0;
        super();
    }

    @Override  // fgvg
    public final void h(int v, BluetoothGattService bluetoothGattService0) {
        this.a.a.h.countDown();
    }
}

