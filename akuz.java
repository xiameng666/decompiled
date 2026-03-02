import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.lang.ref.WeakReference;

final class akuz extends AdvertiseCallback {
    public final RemoteDevice a;
    private final WeakReference b;

    public akuz(RemoteDevice remoteDevice0, akvf akvf0) {
        this.a = remoteDevice0;
        this.b = new WeakReference(akvf0);
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int v) {
        baun baun0 = akvf.a;
        baun0.m("Unable to start advertising; error code: %d", new Object[]{v});
        new aliu().T(v);
        akvf akvf0 = (akvf)this.b.get();
        if(akvf0 == null) {
            baun0.m("BleForegroundAdvertiser has been killed; cannot handle failure. Central device: %s", new Object[]{this.a});
            return;
        }
        akvf0.a(this.a);
    }

    @Override  // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings0) {
        new aliu().U();
        akvf akvf0 = (akvf)this.b.get();
        if(akvf0 == null) {
            akvf.a.m("BleForegroundAdvertiser has been killed; cannot start server. Central device: %s", new Object[]{this.a});
            return;
        }
        String s = this.a.b;
        akve akve0 = akvf0.n;
        if(akve0 != null) {
            akve0.b();
        }
        alit alit0 = akvf0.l.a("peripheral_role_foreground_advertisement_to_initiator_hello_time");
        akvf0.h.put(s, alit0);
    }
}

