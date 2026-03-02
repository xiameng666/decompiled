import android.bluetooth.BluetoothAdapter;
import android.os.Message;
import j..util.Objects;

final class feel extends fefk {
    final feeq a;

    public feel(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "DisconnectedState";
    }

    @Override  // fefk
    public final void b() {
        feeq feeq0 = this.a;
        if(!((fczq)feeq0.g.get()).f) {
            feeq0.x(3);
            return;
        }
        BluetoothAdapter bluetoothAdapter0 = feeq0.b;
        if(bluetoothAdapter0.getState() == 12) {
            feeq0.x(1);
            return;
        }
        if(bluetoothAdapter0.getState() == 10) {
            feeq0.E(10);
        }
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        return true;
    }
}

