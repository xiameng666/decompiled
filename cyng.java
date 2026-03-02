import android.bluetooth.BluetoothA2dp;
import android.media.AudioManager;

public final class cyng implements gfsi {
    public final cynl a;

    public cyng(cynl cynl0) {
        this.a = cynl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((cyql)object0).a()) {
            return (cyql)object0;
        }
        cynl cynl0 = this.a;
        BluetoothA2dp bluetoothA2dp0 = (BluetoothA2dp)cynl0.b.b.d(2);
        AudioManager audioManager0 = cynl0.g();
        if(audioManager0 != null && audioManager0.isMusicActive() && (bluetoothA2dp0 == null || bluetoothA2dp0.isA2dpPlaying(cynl0.c.a))) {
            ((ggtj)cynl0.o.d().ar(0x1EF1)).x("MultiPointConnectionHelper: Failed to SwitchActive because event stream is not connected. But A2DP is active, so ignore");
            return new cyql(cyqm.b, 10);
        }
        return new cyql(cyqm.g, 13);
    }
}

