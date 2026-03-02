import android.bluetooth.BluetoothSocket;
import java.io.Closeable;

public final class fejw implements ffmj, Closeable {
    public boolean a;
    final fczq b;
    public volatile boolean c;
    public final feju d;
    private final fejv e;

    public fejw(fczq fczq0, BluetoothSocket bluetoothSocket0, feju feju0) {
        this.a = false;
        this.b = fczq0;
        this.e = new fejv(this, fczq0, bluetoothSocket0);
        this.d = feju0;
        this.c = false;
    }

    public final void a() {
        if(!this.c) {
            this.e.start();
        }
    }

    static void b(fejw fejw0) {
        fejw0.c = true;
    }

    @Override
    public final void close() {
        this.c = true;
        this.a = true;
        this.e.close();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        batl.h("dump");
        bbpd0.println("BluetoothServerConnection to: " + this.b.c + " closed:" + this.c + " wasStopped: " + this.a);
        bbpd0.println(this.b);
        bbpd0.println();
    }
}

