import android.bluetooth.BluetoothGattCharacteristic;
import java.util.UUID;

public class fege {
    public final BluetoothGattCharacteristic a;
    protected final fegd b;
    protected final fejk c;
    protected fegj d;

    public fege(UUID uUID0, int v, int v1, fegd fegd0, fejk fejk0) {
        this.a = new BluetoothGattCharacteristic(uUID0, v, v1);
        this.b = fegd0;
        this.c = fejk0;
        this.d = null;
    }

    public final UUID a() {
        return this.a.getUuid();
    }
}

