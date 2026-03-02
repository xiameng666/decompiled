import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

final class fein extends Thread {
    public final BluetoothServerSocket a;
    public volatile AtomicBoolean b;
    private final feim c;

    public fein(BluetoothServerSocket bluetoothServerSocket0, feim feim0) {
        this.a = bluetoothServerSocket0;
        this.c = feim0;
        this.b = new AtomicBoolean(false);
    }

    @Override
    public final void run() {
        fejd fejd0;
        BluetoothServerSocket bluetoothServerSocket0 = this.a;
        int v = bluetoothServerSocket0.getPsm();
        feio feio0 = this.c.a;
        if(feio0.d != null) {
            feii feii0 = feio0.d;
            if(Log.isLoggable("IosL2capCM", 3)) {
                feil.f(("L2CAP server started listening, change PSM to: " + v));
            }
            feii0.a.f.d(v);
        }
        try {
            while(true) {
                feio.a("Waiting for a connection.");
                BluetoothSocket bluetoothSocket0 = bluetoothServerSocket0.accept();
                if(feio0.d != null) {
                    feil feil0 = feio0.d.a;
                    feil.f("L2CAP socket opened.");
                    fejb fejb0 = feil0.h;
                    Context context0 = feil0.a;
                    if(fejb0.f) {
                        feiz feiz0 = new feiz(fejb0, bluetoothSocket0);
                        fejd0 = new feid(context0, bluetoothSocket0, fejb0.b, fejb0.a, feiz0);
                    }
                    else {
                        feja feja0 = new feja(fejb0, bluetoothSocket0);
                        fejd0 = new fejd(context0, bluetoothSocket0, fejb0.b, fejb0.a, fejb0.d, fejb0.e, fejb0.c, feja0);
                    }
                    fejb0.g.put(bluetoothSocket0, fejd0);
                    fejd0.start();
                    fekd fekd0 = feil0.l;
                    if(fekd0 != null) {
                        fekd0.b(feil0.m, true);
                    }
                }
                feio.a("Connection accepted.");
            }
        }
        catch(IOException iOException0) {
            boolean z = this.b.get();
            if(!z) {
                feio feio1 = this.c.a;
                if(feio1.d != null && feio1.c == this) {
                    feil feil1 = feio1.d.a;
                    feil.f("L2CAP server stopped listening, change PSM to 0.");
                    feil1.f.d(0);
                }
            }
            if(Log.isLoggable("IosL2capSocketServer", 3) && Log.isLoggable("IosL2capSocketServer", 3)) {
                Log.d("IosL2capSocketServer", "Server thread is stopped with cancelled: " + z + "." + ": " + iOException0.getMessage());
            }
        }
    }
}

