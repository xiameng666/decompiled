import android.bluetooth.BluetoothDevice;
import java.util.concurrent.ScheduledExecutorService;

public final class cyqq extends cyqk {
    protected final gxxu f;
    public cxtn g;

    public cyqq(ScheduledExecutorService scheduledExecutorService0, gxxu gxxu0, bbng bbng0) {
        super(scheduledExecutorService0, bbng0);
        this.f = gxxu0;
    }

    public final gmcd c(BluetoothDevice bluetoothDevice0, hfub hfub0, byte[] arr_b) {
        int v = (int)hvpg.a.aY().cK();
        int v1 = (int)hvpg.a.aY().cJ();
        int v2 = this.e;
        this.e = v2 + 1;
        gmcd gmcd0 = jqy.a(new cypw(this, bluetoothDevice0, hfub0, arr_b, v2, v, v1));
        cyqk.a(gmcd0, new cypx(this, v2), this.a);
        return gmcd0;
    }
}

