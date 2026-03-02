import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.media.AudioManager;

public class cyqw implements AutoCloseable {
    private final AudioManager a;
    private final cyrq b;

    public cyqw(Context context0, cyrq cyrq0) {
        AudioManager audioManager0 = (AudioManager)context0.getSystemService("audio");
        gfuy.e(audioManager0);
        this.a = audioManager0;
        this.b = cyrq0;
    }

    public void a(BluetoothDevice bluetoothDevice0) {
        AudioManager audioManager0 = this.a;
        int v = audioManager0.getStreamVolume(3);
        int v1 = audioManager0.getStreamMinVolume(3);
        cyrq cyrq0 = this.b;
        Integer integer0 = null;
        if(!cyrq0.a()) {
            if(bluetoothDevice0 != null && v > v1) {
                integer0 = (int)-100;
            }
        }
        else if(bluetoothDevice0 == null) {
            integer0 = (int)100;
        }
        String s = "mute";
        if(integer0 == null) {
            ggtj ggtj0 = (ggtj)cyjh.a.d().ar(8056);
            Boolean boolean0 = Boolean.valueOf(cyrq0.a());
            Integer integer1 = v;
            if(bluetoothDevice0 == null) {
                s = "unmute";
            }
            ggtj0.X("NearbyDeviceManager: Skip adjustStreamVolume to %s, isMuteBySass=%b, volume=%d", s, boolean0, integer1);
            return;
        }
        boolean z = false;
        audioManager0.adjustStreamVolume(3, integer0.intValue(), 0);
        if(bluetoothDevice0 != null) {
            z = true;
        }
        cjpa cjpa0 = cyrq0.a.c();
        cjpa0.e("IS_MEDIA_MUTE_BY_SASS", z);
        cygf.b(cjpa0);
        ggtj ggtj1 = (ggtj)cyjh.a.d().ar(8055);
        if(bluetoothDevice0 == null) {
            s = "unmute";
        }
        ggtj1.B("NearbyDeviceManager: Set adjustStreamVolume to %s", s);
    }

    public boolean b() {
        return true;
    }

    @Override
    public void close() {
    }
}

