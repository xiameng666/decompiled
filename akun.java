import android.bluetooth.le.AdvertiseData.Builder;
import android.bluetooth.le.AdvertiseSettings.Builder;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.ForceSyncFirstAccountIntentOperation;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import j..util.Objects;
import java.util.List;

final class akun extends akxc {
    final aliu a;
    final akup b;
    final akus c;

    public akun(akus akus0, aliu aliu0, akup akup0) {
        this.a = aliu0;
        this.b = akup0;
        Objects.requireNonNull(akus0);
        this.c = akus0;
        super(null);
    }

    @Override  // akxc
    public final void a() {
        akus.e(this.c);
        this.c.e = null;
        this.c.f(2, 8);
        this.a.R(5);
        this.b.a("Failed to fetch local device data.");
    }

    @Override  // akxc
    public final void b(byte[] arr_b, List list0) {
        akus akus0 = this.c;
        int v = 2;
        if(!akus0.h) {
            akus0.f(2, 5);
            this.a.R(2);
            this.b.a("Advertising stopped during data fetch.");
            return;
        }
        BluetoothLeAdvertiser bluetoothLeAdvertiser0 = akus0.a();
        if(bluetoothLeAdvertiser0 == null) {
            akus0.f(2, 6);
            this.a.R(3);
            this.b.a("Advertiser is null");
            return;
        }
        if(hpyn.e()) {
            akus0.f = bluetoothLeAdvertiser0;
        }
        akwl akwl0 = akwm.a(list0, hpyn.b());
        akwj akwj0 = akwl0 == null ? null : akwm.c(list0, akwl0.a, akwl0.b);
        if(akwj0 == null) {
            akus0.f(2, 7);
            this.a.R(4);
            this.b.a("Failed to generate EID data.");
            if(hpyn.a.d().e()) {
                Context context0 = AppContextProvider.a();
                context0.startService(IntentOperation.getStartIntent(context0, ForceSyncFirstAccountIntentOperation.class, "com.google.android.gms.auth.proximity.FORCE_DEVICE_SYNC"));
            }
            return;
        }
        byte[] arr_b1 = hpzq.d() ? glwl.d(new byte[][]{akwj0.a, new byte[]{akus0.i}}) : akwj0.a;
        Object[] arr_object = {bboy.c(arr_b1)};
        akus.a.h("Attempting to start advertising with EID: 0x%s", arr_object);
        akus0.f(2, 2);
        this.a.R(0);
        akum akum0 = new akum(this, this.a, arr_b1, this.b);
        akus0.g = akum0;
        try {
            AdvertiseSettings.Builder advertiseSettings$Builder0 = new AdvertiseSettings.Builder().setAdvertiseMode((hpyk.c() ? ((int)hpyk.a.b().a()) : 1)).setConnectable(true);
            if(hpyk.c()) {
                v = (int)hpyk.a.b().b();
            }
            bluetoothLeAdvertiser0.startAdvertising(advertiseSettings$Builder0.setTxPowerLevel(v).build(), new AdvertiseData.Builder().addServiceUuid(akus.c).addServiceData(akus.c, arr_b1).build(), akum0);
        }
        catch(NullPointerException unused_ex) {
            akus.a.h("NullPointerException starting advertising.", new Object[0]);
            akum0.onStartFailure(4);
        }
    }
}

