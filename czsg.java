import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class czsg {
    public final String a;
    public final int b;
    public final BluetoothSocket c;
    private final ScheduledExecutorService d;

    public czsg(BluetoothDevice bluetoothDevice0, int v) {
        this.d = cuui.f();
        this.a = bluetoothDevice0.getAddress();
        this.b = v;
        this.c = bluetoothDevice0.createInsecureL2capChannel(v);
    }

    public final cumn a() {
        czsd czsd0 = new czsd(this);
        long v = hvog.k();
        return cumn.d(czkq.a, czsd0, v, this.d);
    }

    public static czsq b(DataInputStream dataInputStream0) {
        int v = dataInputStream0.readInt();
        if(!czsq.b(v)) {
            throw new IOException(a.f(v, "Got invalid length of BleL2capPacket from server!(", ")"));
        }
        byte[] arr_b = new byte[v];
        dataInputStream0.readFully(arr_b);
        czsq czsq0 = czsq.a(arr_b);
        if(czsq0 != null) {
            return czsq0;
        }
        throw new IOException("Got invalid BleL2capPacket bytes from server! raw data : " + czmk.g(arr_b));
    }

    public final void c() {
        bbpb.b(this.c);
        cuui.h(this.d, "BleL2capClient.timeoutAlarmExecutor");
    }

    public final void d() {
        new czse(this).start();
    }

    public static void e(DataOutputStream dataOutputStream0, byte[] arr_b) {
        dataOutputStream0.writeInt(arr_b.length);
        dataOutputStream0.write(arr_b);
        dataOutputStream0.flush();
    }

    public final czsf f(String s, int v) {
        long v1 = System.currentTimeMillis();
        czsf czsf0 = this.g(s, v);
        if(hvol.aa()) {
            czkq.a.b().i("[PERFORMANCE] createL2capSocket took %d ms, success : %s", Long.valueOf(System.currentTimeMillis() - v1), Boolean.valueOf(czsf0.a));
        }
        return czsf0;
    }

    private final czsf g(String s, int v) {
        gmcu gmcu0 = new gmcu();
        new bbln(9, new czsc(this, s, v, gmcu0)).start();
        try {
            Boolean boolean0 = (Boolean)gmcu0.v(hvog.a.bk().aP(), TimeUnit.MILLISECONDS);
            return new czsf(true);
        }
        catch(InterruptedException | ExecutionException | TimeoutException | CancellationException | SecurityException exception0) {
            a.ae(cunc.a.j(), "Failed connectWithTimeout while waiting for the result.", exception0);
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            czmk.z(this.c, "BLE_L2CAP", s);
            return new czsf(false, exception0);
        }
    }
}

