import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class fegi {
    public final BluetoothGattService a;
    public List b;

    public fegi(UUID uUID0) {
        this.a = new BluetoothGattService(uUID0, 0);
        this.b = new ArrayList();
    }

    public final UUID a() {
        return this.a.getUuid();
    }

    public boolean b(BluetoothDevice bluetoothDevice0) {
        return true;
    }

    public void c(int v) {
    }
}

