import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class fega extends fefk {
    final fegb a;

    public fega(fegb fegb0) {
        Objects.requireNonNull(fegb0);
        this.a = fegb0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "GattDisconnectedState";
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        int v = message0.what;
        if(v == 0) {
            fegb fegb1 = this.a;
            fegb1.l = 0;
            fegc fegc0 = fegb1.k;
            if(fegc0 != null) {
                fegc0.a();
            }
            fegb1.z(1, 5000L);
        }
        else {
            switch(v) {
                case 1: {
                    fegb fegb0 = this.a;
                    if(fegb0.j == null) {
                        fegb0.j = fegb0.e.connectGatt(fegb0.c, true, fegb0.h, 2);
                    }
                    Log.d("BleClientConnection", "bluetoothGatt.connect() success: " + fegb0.j.connect());
                    return true;
                }
                case 2: {
                    break;
                }
                default: {
                    if(v != 6) {
                        fegb.g(this.a, message0);
                        return false;
                    }
                    fefw fefw0 = (fefw)message0.obj;
                    fczq fczq0 = (fczq)this.a.d.get();
                    int v1 = fefw0.a;
                    if(fczq0.l != v1) {
                        fczq0.l = v1;
                        return true;
                    }
                    return true;
                }
            }
            this.a.w(this.a.g);
            return true;
        }
        return true;
    }
}

