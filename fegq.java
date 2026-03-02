import android.bluetooth.BluetoothSocket;
import java.util.concurrent.Callable;

public final class fegq implements Callable {
    public final fegy a;

    public fegq(fegy fegy0) {
        this.a = fegy0;
    }

    @Override
    public final Object call() {
        BluetoothSocket bluetoothSocket0;
        fegy fegy0 = this.a;
        fegy0.c.lock();
        try {
            bluetoothSocket0 = fegy0.q;
            if(bluetoothSocket0 == null) {
                ffmn.f("BleOffloadClientConn", "Client socket is disconnected; socket not created", new Object[0]);
                throw new IllegalStateException("Socket not connected");
            }
            ffmn.a("BleOffloadClientConn", "Offload connection is ready, starting the socket", new Object[0]);
        }
        catch(Throwable throwable0) {
            fegy0.c.unlock();
            throw throwable0;
        }
        fegy0.c.unlock();
        fczq fczq0 = fegy0.i;
        feqp feqp0 = fegy0.m;
        if(gfta.c(fczq0.j)) {
            throw new IllegalArgumentException("Node ID must be defined");
        }
        String s = gfta.b(fczq0.j);
        int v = bluetoothSocket0.getMaxTransmitPacketSize();
        ffmn.a("OffloadClientSocket", "Create socket config [node: %s] maxSize:%d", new Object[]{s, v});
        ferb ferb0 = new ferb(new feqo(feqp0, s), bluetoothSocket0.getOutputStream(), v, ffgp.i());
        Object object0 = new fehe(s, fegy0, bluetoothSocket0, feqp0);
        if(((ferb)feqp0.b.put(s, ferb0)) != null) {
            ffmn.f("OffloadMessageManager", "stale writer was replaced for node: %s", new Object[]{s});
        }
        object0.f = new feia(((fehe)object0));
        ffmn.a("OffloadClientSocket", "Starting the reader thread", new Object[0]);
        object0.f.start();
        fegy0.g(fehf.c);
        return object0;
    }
}

