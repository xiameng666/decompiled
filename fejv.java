import android.bluetooth.BluetoothSocket;
import j..util.Objects;
import java.io.Closeable;
import java.io.IOException;

final class fejv extends Thread implements Closeable {
    final fejw a;
    private final fczq b;
    private final BluetoothSocket c;

    public fejv(fejw fejw0, fczq fczq0, BluetoothSocket bluetoothSocket0) {
        Objects.requireNonNull(fejw0);
        this.a = fejw0;
        super();
        this.b = fczq0;
        this.c = bluetoothSocket0;
    }

    @Override
    public final void close() {
        ffmn.a("WearBTServerConn", "Signaling thread %s termination.", new Object[]{this.getName()});
        fejw.b(this.a);
        this.interrupt();
        ffmm.a(this.c);
    }

    @Override
    public final void run() {
        fejw fejw0 = this.a;
        if(!fejw0.c) {
            try {
                try {
                    ffmn.a("WearBTServerConn", "Starting a server thread with config %s", new Object[]{this.b});
                    String s = this.c.getRemoteDevice().getAddress();
                    this.setName(String.format("BTServThread(%s)", s));
                    this.b.d(s);
                    ffmn.d("WearBTServerConn", "Connected to %s.", new Object[]{this.c.getRemoteDevice()});
                    this.b.u = 1;
                    ffgp.d().p(this.c.getInputStream(), this.c.getOutputStream(), this.b);
                }
                catch(feai feai0) {
                    ffmn.g("WearBTServerConn", feai0, "Unsupported protocol version sent by peer node.", new Object[0]);
                }
                catch(fdrr fdrr0) {
                    ffmn.g("WearBTServerConn", fdrr0, "Invalid client attempted to connect to us.", new Object[0]);
                }
                catch(IOException iOException0) {
                    ffmn.a("WearBTServerConn", "Terminating thread with message: %s", new Object[]{iOException0.getMessage()});
                }
            }
            catch(Throwable throwable0) {
                ffmn.a("WearBTServerConn", "Thread terminated, config: %s", new Object[]{this.b});
                ffmm.a(this.c);
                fejw.b(this.a);
                this.a.d.d(this.b.n, this.a.a);
                throw throwable0;
            }
            ffmn.a("WearBTServerConn", "Thread terminated, config: %s", new Object[]{this.b});
            ffmm.a(this.c);
            fejw.b(this.a);
            this.a.d.d(this.b.n, this.a.a);
            return;
        }
        ffmn.a("WearBTServerConn", "Thread terminated, config: %s", new Object[]{this.b});
        ffmm.a(this.c);
        fejw.b(fejw0);
        fejw0.d.d(this.b.n, fejw0.a);
    }
}

