import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.android.gms.activeunlock.DeviceIdentifier;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.Feature;
import j..util.Optional;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public final class ezho extends lsb {
    public static final Function a;
    static final Supplier b;
    public final lqi c;
    public Set d;
    private static final ezhf e;
    private final azts f;

    static {
        ezho.e = new ezhf(false, ggnj.a);
        ezho.a = new ezhl();
        ezhm ezhm0 = bbqa.c() ? new ezhm() : new ezhn();
        ezho.b = ezhm0;
        bboh.b("TrustAgent", bbcu.aR);
    }

    public ezho() {
        this.c = new lqi(ezho.e);
        Context context0 = AppContextProvider.a();
        this.f = (azts)ezho.a.apply(context0);
        this.d = ggnj.a;
    }

    final void a() {
        Context context0 = AppContextProvider.a();
        evql evql0 = null;
        BluetoothAdapter bluetoothAdapter0 = (BluetoothAdapter)Optional.ofNullable(((BluetoothManager)context0.getSystemService("bluetooth"))).map(new ezhh()).orElse(null);
        if(bluetoothAdapter0 != null && bluetoothAdapter0.isEnabled()) {
            ggdy ggdy0 = new ggdy();
            ArrayList arrayList0 = new ArrayList();
            if(bbqa.c()) {
                evql0 = ((ezgj)ezho.b.get()).a(context0);
                arrayList0.add(evql0.c(new ezhi()));
            }
            for(Object object0: bluetoothAdapter0.getBondedDevices()) {
                BluetoothDevice bluetoothDevice0 = (BluetoothDevice)object0;
                String s = bluetoothDevice0.getAddress();
                if(!this.d.contains(s)) {
                    DeviceIdentifier deviceIdentifier0 = new DeviceIdentifier(s);
                    azzc azzc0 = new azzc();
                    azzc0.c = new Feature[]{aayl.b};
                    azzc0.a = new aayw(deviceIdentifier0);
                    azzc0.d = 32402;
                    azzd azzd0 = azzc0.a();
                    evql evql1 = this.f.iG(azzd0);
                    evql1.c(new ezhj(ggdy0, bluetoothDevice0));
                    arrayList0.add(evql1);
                }
            }
            evrg.g(arrayList0).z(new ezhk(this, evql0, ggdy0));
            return;
        }
        ezhf ezhf0 = new ezhf(true, ggnj.a);
        this.c.l(ezhf0);
    }
}

