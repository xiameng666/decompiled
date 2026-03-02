import android.content.Intent;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper.1;
import j..util.Objects;

public final class gyeo extends gxum {
    final BluetoothAdapterWrapper.1 a;

    public gyeo(BluetoothAdapterWrapper.1 bluetoothAdapterWrapper$10) {
        Objects.requireNonNull(bluetoothAdapterWrapper$10);
        this.a = bluetoothAdapterWrapper$10;
        super("SendActuallyEnabled");
    }

    @Override
    public final void run() {
        batl.s(this.a.b.a);
        Intent intent0 = new Intent("com.google.android.location.copresence.bluetooth.action.ACTUALLY_ENABLED");
        this.a.b.a.sendBroadcast(intent0);
    }
}

