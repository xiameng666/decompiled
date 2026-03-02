import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class feid extends fejd {
    public feid(Context context0, BluetoothSocket bluetoothSocket0, fczq fczq0, fdzv fdzv0, fejc fejc0) {
        super(context0, bluetoothSocket0, fczq0, fdzv0, fejc0);
    }

    @Override  // fejd
    public final void run() {
        feid.b("Starting a L2CAP connection thread.");
        try {
            BluetoothSocket bluetoothSocket0 = this.a;
            InputStream inputStream0 = bluetoothSocket0.getInputStream();
            OutputStream outputStream0 = bluetoothSocket0.getOutputStream();
            if(inputStream0 == null || outputStream0 == null) {
                Log.e("AndroidL2capThread", "Socket disconnected before connecting");
            }
            else if(!bluetoothSocket0.isConnected()) {
                Log.w("AndroidL2capThread", "The socket is not connected.");
            }
            else {
                fczq fczq0 = this.b;
                fczq0.d(bluetoothSocket0.getRemoteDevice().getAddress());
                feid.b(("Set remote address: " + fczq0.c));
                feid.b("Starting HandleConnection.");
                fczq0.u = 3;
                this.c.p(inputStream0, outputStream0, fczq0);
                feid.b("Finished HandleConnection.");
            }
        }
        catch(IOException iOException0) {
            feid.c(iOException0);
        }
        catch(feai feai0) {
            Log.e("AndroidL2capThread", "Wire version mismatch", feai0);
        }
        catch(fdrr fdrr0) {
            Log.e("AndroidL2capThread", "Client node mismatch", fdrr0);
        }
        finally {
            this.a();
        }
    }
}

