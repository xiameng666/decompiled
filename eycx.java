import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.DistanceMeasurementManager;
import android.bluetooth.le.DistanceMeasurementParams.Builder;
import android.bluetooth.le.DistanceMeasurementParams;
import android.content.Context;
import android.os.CancellationSignal;
import com.google.android.gms.chimera.modules.activeunlock.primary.AppContextProvider;
import j..time.Duration;
import j..util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class eycx implements eyce {
    public final bboh a;
    public final gmch b;
    public final fghr c;
    public final eydc d;
    public iced e;
    public gfug f;
    public boolean g;
    public boolean h;
    public int i;
    public final Set j;
    private final gfuv k;
    private final icck l;
    private final Context m;

    public eycx(bboh bboh0, gfuv gfuv0, gmch gmch0, fghr fghr0, eydc eydc0, icck icck0) {
        ibuq.f(eydc0, "gattConnector");
        super();
        this.a = bboh0;
        this.k = gfuv0;
        this.b = gmch0;
        this.c = fghr0;
        this.d = eydc0;
        this.l = icck0;
        this.m = AppContextProvider.a();
        Set set0 = DesugarCollections.synchronizedSet(new LinkedHashSet());
        ibuq.e(set0, "synchronizedSet(...)");
        this.j = set0;
    }

    @Override  // eyce
    public final exjv a() {
        this.f = gfug.c(this.k);
        return new exjq(null);
    }

    @Override  // eyce
    public final Object b(List list0, eyfr eyfr0, Duration duration0, ibrl ibrl0) {
        exwv exwv0 = (exwv)ibpo.T(list0);
        if(exwv0 == null) {
            ((ggtj)this.a.j()).x("No enrolled device found.");
            return eycd.d;
        }
        if(!this.f().isEnabled()) {
            ((ggtj)this.a.j()).x("BluetoothAdapter is not enabled.");
            return eycd.d;
        }
        if(this.f().isDistanceMeasurementSupported() != 10) {
            ((ggtj)this.a.j()).x("DistanceMeasurementManager is not supported.");
            return eycd.d;
        }
        return this.d(exwv0, eyfr0, ibrl0);
    }

    @Override  // eyce
    public final void c() {
    }

    public final Object d(exwv exwv0, eyfr eyfr0, ibrl ibrl0) {
        ibvd ibvd3;
        gfug gfug1;
        ibvd ibvd2;
        BluetoothDevice bluetoothDevice1;
        eycu eycu0;
        if((ibrl0 instanceof eycu)) {
            eycu0 = (eycu)ibrl0;
            int v = eycu0.c;
            if((v & 0x80000000) == 0) {
                eycu0 = new eycu(this, ibrl0);
            }
            else {
                eycu0.c = v - 0x80000000;
            }
        }
        else {
            eycu0 = new eycu(this, ibrl0);
        }
        Object object0 = eycu0.a;
        Object object1 = ibrx.a;
        switch(eycu0.c) {
            case 0: {
                ibnx.b(object0);
                BluetoothDevice bluetoothDevice0 = this.f().getRemoteDevice(exwv0.e);
                ibuq.e(bluetoothDevice0, "getRemoteDevice(...)");
                if(!this.j.add(bluetoothDevice0)) {
                    ((ggtj)this.a.j()).B("BluetoothDevice %s is already ranging.", bluetoothDevice0.getAddress());
                    return eycd.d;
                }
                DistanceMeasurementManager distanceMeasurementManager0 = this.f().getDistanceMeasurementManager();
                if(distanceMeasurementManager0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                DistanceMeasurementParams.Builder distanceMeasurementParams$Builder0 = new DistanceMeasurementParams.Builder(bluetoothDevice0);
                int v1 = (int)(homc.f() / 1000L);
                DistanceMeasurementParams distanceMeasurementParams0 = distanceMeasurementParams$Builder0.setDurationSeconds(v1 + v1).setMethodId(2).setFrequency(2).build();
                ibuq.e(distanceMeasurementParams0, "build(...)");
                gfug gfug0 = gfug.c(this.k);
                ibvd ibvd0 = new ibvd();
                ibvd ibvd1 = new ibvd();
                Duration duration0 = glyb.d(homc.f());
                eycw eycw0 = new eycw(this, bluetoothDevice0, gfug0, ibvd0, ibvd1, distanceMeasurementManager0, distanceMeasurementParams0, exwv0, eyfr0, null);
                eycu0.d = bluetoothDevice0;
                eycu0.e = gfug0;
                eycu0.f = ibvd0;
                eycu0.g = ibvd1;
                eycu0.c = 1;
                object0 = glya.c(duration0, eycw0, eycu0);
                if(object0 != object1) {
                    bluetoothDevice1 = bluetoothDevice0;
                    ibvd2 = ibvd1;
                    gfug1 = gfug0;
                    ibvd3 = ibvd0;
                    break;
                }
                return object1;
            }
            case 1: {
                ibvd2 = eycu0.g;
                ibvd3 = eycu0.f;
                gfug1 = eycu0.e;
                bluetoothDevice1 = eycu0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Object object2 = (eycd)object0;
        if(object2 == null) {
            if(this.g) {
                object2 = eycd.b;
            }
            else {
                object2 = this.h ? eycd.c : eycd.d;
            }
        }
        this.e(bluetoothDevice1, ((CancellationSignal)ibvd2.a));
        this.g = false;
        this.h = false;
        this.i = 0;
        gfug1.g();
        if(homc.l()) {
            String s = bluetoothDevice1.getAddress();
            Duration duration1 = gfug1.d();
            this.c.b("Returning CS ranging result: " + object2 + " for " + s + " took " + duration1 + " ms");
        }
        Duration duration2 = gfug1.d();
        ibuq.e(duration2, "elapsed(...)");
        ((ggtj)this.a.h()).Y("Returning CS ranging result: %s for device %s took total %d ms, from ranging start %d ms", ((eycd)object2).name(), bluetoothDevice1.getAddress(), new Long(duration2.toMillis()), new Long((ibvd3.a == null ? -1L : duration2.minus(((Duration)ibvd3.a)).toMillis())));
        return object2;
    }

    public final void e(BluetoothDevice bluetoothDevice0, CancellationSignal cancellationSignal0) {
        int v;
        if(cancellationSignal0 != null) {
            cancellationSignal0.cancel();
        }
        this.j.remove(bluetoothDevice0);
        iced iced0 = this.e;
        if(iced0 != null) {
            iceb.a(iced0);
        }
        eydc eydc0 = this.d;
        if(eydc0.b) {
            if(!this.h && ((int)hokx.c()) > 0) {
                ((ggtj)this.a.h()).J("No ranging result received at all, prolonging GATT connection for %d seconds, stop ranging reason: %d", hokx.c(), this.i);
                v = (int)hokx.c();
            }
            else if(((int)hokx.b()) > 0) {
                ((ggtj)this.a.h()).A("Channel sounding ranging finished, prolonging GATT connection for %d seconds", hokx.b());
                v = (int)hokx.b();
            }
            else {
                v = 0;
            }
            if(v > 0) {
                eycs eycs0 = new eycs(v, this, null);
                this.e = icbb.b(this.l, null, null, eycs0, 3);
                return;
            }
            ((ggtj)this.a.h()).x("Closing GATT connection immediately");
            eydc0.b();
            return;
        }
        ((ggtj)this.a.h()).x("GATT connection is not connected");
        eydc0.b();
    }

    private final BluetoothAdapter f() {
        return ((BluetoothManager)this.m.getSystemService(BluetoothManager.class)).getAdapter();
    }
}

