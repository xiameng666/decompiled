import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;

public final class akvk extends fgvg {
    public fgve a;
    public byte[] b;
    private final UUID d;

    public akvk(UUID uUID0) {
        this.d = uUID0;
        this.b = new byte[4];
    }

    @Override  // fgvg
    public final void a(fgva fgva0, int v, int v1, BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        if(this.a != null && bluetoothGattCharacteristic0.getUuid().equals(this.d)) {
            this.a.d(fgva0, v, 0, v1, this.b);
        }
    }
}

