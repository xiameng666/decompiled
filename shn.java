import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.android.settingslib.bluetooth.devicesettings.DeviceInfo;
import com.android.settingslib.bluetooth.devicesettings.DeviceSettingState;
import java.util.HashMap;
import java.util.List;

public abstract class shn extends Service {
    public final HashMap a;
    public final HashMap b;
    private static final ggsf c;

    static {
        shn.c = ggsf.b("shn");
    }

    public shn() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public void a(DeviceInfo deviceInfo0) {
        throw null;
    }

    public void b(DeviceInfo deviceInfo0) {
        throw null;
    }

    public abstract void c(DeviceInfo arg1, DeviceSettingState arg2);

    public final void d(DeviceInfo deviceInfo0, List list0) {
        ibuq.f(deviceInfo0, "deviceInfo");
        ibuq.f(list0, "settings");
        synchronized(this) {
            this.b.put(deviceInfo0.a, list0);
            RemoteCallbackList remoteCallbackList0 = (RemoteCallbackList)this.a.get(deviceInfo0.a);
            if(remoteCallbackList0 != null) {
                int v1 = remoteCallbackList0.beginBroadcast();
                for(int v2 = 0; v2 < v1; ++v2) {
                    try {
                        ((shs)remoteCallbackList0.getBroadcastItem(v2)).a(list0);
                    }
                    catch(RemoteException remoteException0) {
                        ((ggsc)((ggsc)shn.c.j()).s(remoteException0).ar(1)).x("Error happens in setDeviceSettings.");
                    }
                }
                remoteCallbackList0.finishBroadcast();
            }
        }
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return new sht(this);
    }
}

