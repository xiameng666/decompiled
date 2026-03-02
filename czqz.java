import android.bluetooth.BluetoothGattServer;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertisingSetCallback;
import android.bluetooth.le.AdvertisingSetParameters;
import android.content.Context;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

final class czqz extends czvg {
    public final czqj a;
    public final AdvertiseData b;
    public final AdvertiseData c;
    public final String d;
    public final gyxo e;
    private final Context f;
    private cupu g;
    private AdvertisingSetCallback h;

    public czqz(Context context0, czqj czqj0, AdvertiseData advertiseData0, AdvertiseData advertiseData1, String s) {
        super(0x1F);
        this.e = gyxo.dE;
        this.f = context0;
        this.a = czqj0;
        this.b = advertiseData0;
        this.c = advertiseData1;
        this.d = s;
    }

    @Override  // czvg
    public final czvf a() {
        cupu cupu0 = cupu.b(this.f, "BluetoothLowEnergy");
        if(cupu0 == null) {
            czke.i(this.d, 2, gylz.d, gymd.n);
            return czvf.d;
        }
        BluetoothGattServer bluetoothGattServer0 = cupt.b().a();
        if(this.a.a && bluetoothGattServer0 == null) {
            czkq.a.d().p("Failed to get sharedGattServer for private gatt advertising.", new Object[0]);
        }
        return this.c(cupu0, bluetoothGattServer0);
    }

    private final czvf c(cupu cupu0, BluetoothGattServer bluetoothGattServer0) {
        gmcu gmcu0 = new gmcu();
        boolean z = false;
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        czqy czqy0 = new czqy(this, atomicBoolean0, cupu0, gmcu0);
        try {
            czqj czqj0 = this.a;
            if(czqj0.a && bbqa.d() && bluetoothGattServer0 != null) {
                AdvertiseData advertiseData0 = this.c;
                AdvertisingSetParameters advertisingSetParameters0 = czqj0.d(advertiseData0 != null);
                AdvertiseData advertiseData1 = this.b;
                if(!cupu0.f(advertisingSetParameters0, advertiseData1, advertiseData0, czqy0, bluetoothGattServer0)) {
                    czke.h(this.d, 2, gymp.f);
                    czkq.a.e().k("Failed to start BLE Legacy advertising, %s, with advertiseData : %s, scanResponse : %s, advertiseSettings : %s", gxyf.b(gxye.k, this.d), advertiseData1.toString(), String.valueOf(advertiseData0), czqj0.d(advertiseData0 != null));
                    return czvf.d;
                }
            }
            else {
                AdvertiseData advertiseData2 = this.c;
                AdvertisingSetParameters advertisingSetParameters1 = czqj0.d(advertiseData2 != null);
                AdvertiseData advertiseData3 = this.b;
                if(!cupu0.e(advertisingSetParameters1, advertiseData3, advertiseData2, czqy0)) {
                    czke.h(this.d, 2, gymp.f);
                    czkq.a.e().k("Failed to start BLE Legacy advertising, %s, with advertiseData : %s, scanResponse : %s, advertiseSettings : %s", gxyf.b(gxye.k, this.d), advertiseData3.toString(), String.valueOf(advertiseData2), czqj0.d(advertiseData2 != null));
                    return czvf.d;
                }
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            cunf cunf0 = czkq.a.e().f(illegalArgumentException0);
            String s = gxyf.b(gxye.k, this.d);
            AdvertiseData advertiseData4 = this.b;
            AdvertiseData advertiseData5 = this.c;
            czqj czqj1 = this.a;
            if(advertiseData5 != null) {
                z = true;
            }
            cunf0.k("Failed to start BLE Legacy advertising, %s, with advertiseData : %s, scanResponse : %s, advertiseSettings : %s", s, advertiseData4.toString(), String.valueOf(advertiseData5), czqj1.d(z));
            return czvf.c;
        }
        try {
            gmcu0.v(hvog.p(), TimeUnit.SECONDS);
            this.g = cupu0;
            this.h = czqy0;
            czkq.a.d().p("Started BLE Legacy advertising with extended API.", new Object[0]);
            return czvf.b;
        }
        catch(InterruptedException unused_ex) {
            czke.i(this.d, 2, gymp.f, gymd.t);
            atomicBoolean0.set(true);
            Thread.currentThread().interrupt();
            return czvf.c;
        }
        catch(ExecutionException unused_ex) {
            czke.i(this.d, 2, gymp.f, gymd.u);
        }
        catch(TimeoutException unused_ex) {
            czke.i(this.d, 2, gymp.f, gymd.y);
        }
        atomicBoolean0.set(true);
        return czvf.d;
    }

    @Override  // czvg
    public final void g() {
        cupu cupu0 = this.g;
        if(cupu0 == null) {
            czkq.a.d().p("Cannot stop BLE Legacy advertising because bleAdvertiser is null.", new Object[0]);
            return;
        }
        if(this.h != null && !cupu0.d(this.h)) {
            czke.h(this.d, 3, gymv.c);
        }
        this.h = null;
        this.g = null;
    }

    @Override  // czvg
    public final void p(PrintWriter printWriter0) {
        super.p(printWriter0);
        printWriter0.write(String.format("    Broadcasting: %s\n", Boolean.valueOf(this.g != null)));
        printWriter0.write(String.format("    Advertise Settings: %s\n", this.a.d(false)));
        printWriter0.write(String.format("    Initial Legacy Advertisement Data: %s\n", this.b));
        printWriter0.write(String.format("    Legacy Scan Response: %s\n", this.c));
        printWriter0.flush();
    }
}

