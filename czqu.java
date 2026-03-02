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

final class czqu extends czvg {
    public final AdvertiseData a;
    public final czqj b;
    public final String c;
    private final Context d;
    private cupu e;
    private AdvertisingSetCallback f;

    public czqu(Context context0, czqj czqj0, AdvertiseData advertiseData0, String s) {
        super(0x1F);
        this.d = context0;
        this.b = czqj0;
        this.a = advertiseData0;
        this.c = s;
    }

    @Override  // czvg
    public final czvf a() {
        cupu cupu0 = cupu.b(this.d, "BluetoothLowEnergy");
        if(cupu0 == null) {
            czke.i(this.c, 2, gylz.d, gymd.n);
            return czvf.d;
        }
        gmcu gmcu0 = new gmcu();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        czqt czqt0 = new czqt(this, atomicBoolean0, cupu0, gmcu0);
        try {
            BluetoothGattServer bluetoothGattServer0 = cupt.b().a();
            if(bbqa.d()) {
                czqj czqj0 = this.b;
                if(!czqj0.a || bluetoothGattServer0 == null) {
                    goto label_18;
                }
                else if(!cupu0.f(czqj0.c(), this.a, null, czqt0, bluetoothGattServer0)) {
                    czke.h(this.c, 2, gymp.g);
                    cunf cunf0 = czkq.a.e();
                    String s = gxyf.b(gxye.k, this.c);
                    AdvertisingSetParameters advertisingSetParameters0 = this.b.c();
                    cunf0.j("Failed to start BLE extended advertising, %s, with advertiseData : %s, advertiseSettings : %s", s, this.a.toString(), advertisingSetParameters0);
                    return czvf.d;
                }
            }
            else {
            label_18:
                czqj czqj1 = this.b;
                AdvertisingSetParameters advertisingSetParameters1 = czqj1.c();
                AdvertiseData advertiseData0 = this.a;
                if(!cupu0.e(advertisingSetParameters1, advertiseData0, null, czqt0)) {
                    czke.h(this.c, 2, gymp.g);
                    czkq.a.e().j("Failed to start BLE extended advertising, %s, with advertiseData : %s, advertiseSettings : %s", gxyf.b(gxye.k, this.c), advertiseData0.toString(), czqj1.c());
                    return czvf.d;
                }
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            cunf cunf1 = czkq.a.e().f(illegalArgumentException0);
            String s1 = gxyf.b(gxye.k, this.c);
            AdvertisingSetParameters advertisingSetParameters2 = this.b.c();
            cunf1.j("Failed to start BLE extended advertising, %s, with advertiseData : %s, advertiseSettings : %s", s1, this.a.toString(), advertisingSetParameters2);
            return czvf.c;
        }
        try {
            gmcu0.v(hvog.p(), TimeUnit.SECONDS);
            this.e = cupu0;
            this.f = czqt0;
            czkq.a.d().p("Started BLE Extended advertising with advertisement.", new Object[0]);
            return czvf.b;
        }
        catch(InterruptedException unused_ex) {
            czke.i(this.c, 2, gymp.g, gymd.t);
            atomicBoolean0.set(true);
            Thread.currentThread().interrupt();
            return czvf.c;
        }
        catch(ExecutionException unused_ex) {
            czke.i(this.c, 2, gymp.g, gymd.u);
        }
        catch(TimeoutException unused_ex) {
            czke.i(this.c, 2, gymp.g, gymd.y);
        }
        atomicBoolean0.set(true);
        return czvf.d;
    }

    @Override  // czvg
    public final void g() {
        cupu cupu0 = this.e;
        if(cupu0 != null) {
            AdvertisingSetCallback advertisingSetCallback0 = this.f;
            if(advertisingSetCallback0 != null) {
                if(!cupu0.d(advertisingSetCallback0)) {
                    czke.h(this.c, 3, gymv.d);
                }
                this.f = null;
                this.e = null;
                return;
            }
        }
        czkq.a.d().p("Cannot stop BLE Extended advertising because bleAdvertiser and/or advertisingSetCallback is null.", new Object[0]);
    }

    @Override  // czvg
    public final void p(PrintWriter printWriter0) {
        super.p(printWriter0);
        printWriter0.write(String.format("    Broadcasting: %s\n", Boolean.valueOf(this.e != null)));
        printWriter0.write(String.format("    Advertise Set Parameters: %s\n", this.b.c()));
        printWriter0.write(String.format("    Initial Extended Advertisement Data: %s\n", this.a));
        printWriter0.flush();
    }
}

