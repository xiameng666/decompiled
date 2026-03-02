import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Message;
import j..util.Objects;

final class feir extends fefk {
    final feiy a;

    public feir(feiy feiy0) {
        Objects.requireNonNull(feiy0);
        this.a = feiy0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "AclDisconnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: {
                feiy feiy0 = this.a;
                feiy0.c(true);
                if(this.e()) {
                    feiy0.w(feiy0.l);
                    return true;
                }
                break;
            }
            case 2: {
                this.a.c(false);
                this.a.w(this.a.i);
                return true;
            }
            case 4: {
                this.a.w(this.a.l);
                return true;
            }
            case 3: 
            case 5: {
                break;
            }
            case 11: {
                if(this.e()) {
                    feiy.k("Error is received but still connected to GATT profile");
                    this.a.x(4);
                    return true;
                }
                break;
            }
            default: {
                feiy.i(this.a, message0);
                return false;
            }
        }
        return true;
    }

    private final boolean e() {
        feiy feiy0 = this.a;
        BluetoothAdapter bluetoothAdapter0 = feiy0.b;
        if(!bluetoothAdapter0.isEnabled()) {
            return false;
        }
        String s = fefq.a(feiy0.a.getContentResolver());
        if(s == null) {
            return false;
        }
        BluetoothDevice bluetoothDevice0 = bluetoothAdapter0.getRemoteDevice(s);
        return feiy0.c.getConnectionState(bluetoothDevice0, 7) == 2;
    }
}

