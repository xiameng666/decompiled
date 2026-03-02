import android.bluetooth.BluetoothDevice;
import java.util.concurrent.ScheduledExecutorService;

public final class cyqj extends cyqh {
    protected cyqj(BluetoothDevice bluetoothDevice0, kba kba0, jqt jqt0, ScheduledExecutorService scheduledExecutorService0, bbng bbng0, hfub hfub0) {
        super(bluetoothDevice0, kba0, jqt0, scheduledExecutorService0, bbng0, hfub0);
        this.h = 0;
    }

    @Override  // cyqh
    protected final String b() {
        return "WaitSend";
    }

    @Override  // cyqh
    protected final void e(boolean z, int v, byte[] arr_b) {
    }
}

