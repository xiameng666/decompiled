import android.os.SystemClock;
import com.google.location.nearby.direct.bluetooth.state.BluetoothAdapterWrapper.1;
import j..util.Objects;

public final class gyep extends gxum {
    final BluetoothAdapterWrapper.1 a;

    public gyep(BluetoothAdapterWrapper.1 bluetoothAdapterWrapper$10) {
        Objects.requireNonNull(bluetoothAdapterWrapper$10);
        this.a = bluetoothAdapterWrapper$10;
        super("BluetoothAdapterStateChanged");
    }

    @Override
    public final void run() {
        BluetoothAdapterWrapper.1 bluetoothAdapterWrapper$10 = this.a;
        gyeq gyeq0 = bluetoothAdapterWrapper$10.b;
        if(gyeq0.j()) {
            gyeq0.g = SystemClock.elapsedRealtime();
            gxuf gxuf0 = gyeq0.e;
            gxum gxum0 = bluetoothAdapterWrapper$10.a;
            batl.s(gyeq0.b);
            hiep hiep0 = gyeq0.b.a().h;
            if(hiep0 == null) {
                hiep0 = hiep.a;
            }
            gxuf0.g(gxum0, hiep0.j);
            return;
        }
        gyeq0.g = null;
        gyeq0.e.h(bluetoothAdapterWrapper$10.a);
    }
}

