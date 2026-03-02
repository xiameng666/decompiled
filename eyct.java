import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.DistanceMeasurementResult;
import android.bluetooth.le.DistanceMeasurementSession.Callback;
import android.bluetooth.le.DistanceMeasurementSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class eyct implements DistanceMeasurementSession.Callback {
    final eycx a;
    final BluetoothDevice b;
    final icbi c;
    final eyfr d;
    final exwv e;
    private final AtomicBoolean f;
    private final AtomicInteger g;
    private final AtomicInteger h;
    private final AtomicBoolean i;

    public eyct(eycx eycx0, BluetoothDevice bluetoothDevice0, icbi icbi0, eyfr eyfr0, exwv exwv0) {
        this.a = eycx0;
        this.b = bluetoothDevice0;
        this.c = icbi0;
        this.d = eyfr0;
        this.e = exwv0;
        super();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicInteger(0);
        this.h = new AtomicInteger(0);
        this.i = new AtomicBoolean(false);
    }

    public final void onResult(BluetoothDevice bluetoothDevice0, DistanceMeasurementResult distanceMeasurementResult0) {
        ibuq.f(bluetoothDevice0, "device");
        ibuq.f(distanceMeasurementResult0, "result");
        eyfr eyfr0 = this.d;
        eyfr0.a(distanceMeasurementResult0.getResultMeters());
        eycx eycx0 = this.a;
        eycx0.h = true;
        if(homc.l()) {
            String s = bluetoothDevice0.getAddress();
            double f = distanceMeasurementResult0.getResultMeters();
            double f1 = distanceMeasurementResult0.getAltitudeAngle();
            double f2 = distanceMeasurementResult0.getAzimuthAngle();
            String[] arr_s = {"CS", "0", Long.toString(eycx0.c.b.a()), "0", s, "", Double.toString(f), Double.toString(f1), Double.toString(f2)};
            eycx0.c.a.a(arr_s);
        }
        if((distanceMeasurementResult0.getConfidenceLevel() < 1.0)) {
            ((ggtj)eycx0.a.h()).x("Received uncofident CS result, ignore it");
            return;
        }
        eycx0.g = true;
        eyfr0.a(distanceMeasurementResult0.getResultMeters());
        ibuq.f(this.e, "enrolledDevice");
        Integer integer0 = (Integer)this.e.p.get(exjx.g);
        homi homi0 = homi.a;
        Double double0 = (Double)homi0.c().e().b.get(Integer.valueOf((integer0 == null ? 0 : ((int)integer0))));
        double f3 = double0 == null ? 0.0 : ((double)double0);
        double f4 = distanceMeasurementResult0.getResultMeters() + f3;
        boolean z = f4 <= homi.b();
        if(z) {
            this.h.getAndIncrement();
        }
        else {
            this.h.set(0);
        }
        AtomicBoolean atomicBoolean0 = this.f;
        atomicBoolean0.compareAndSet(false, ((long)this.h.get()) >= homi0.c().d());
        boolean z1 = f4 > homi0.c().b();
        AtomicInteger atomicInteger0 = this.g;
        boolean z2 = atomicInteger0.getAndIncrement() >= ((int)homi0.c().c());
        bboh bboh0 = eycx0.a;
        ((ggtj)bboh0.h()).ad("Result for device %s: distance=%.2f meters, error=%.2f meters, confidence=%.2f, offset applied=%.2f, rangingDistance=%.2f, numResultsInRange=%d, withinRange %b, exceedsMaxDistance %b, maxResultsExceeded %b", bluetoothDevice0.getAddress(), Double.valueOf(f4), Double.valueOf(distanceMeasurementResult0.getErrorMeters()), Double.valueOf(distanceMeasurementResult0.getConfidenceLevel()), Double.valueOf(f3), Double.valueOf(homi.b()), Integer.valueOf(this.h.get()), Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2));
        if(atomicBoolean0.get() || z1 || z2) {
            eyfr0.b(atomicInteger0.get(), distanceMeasurementResult0.getResultMeters());
            eycd eycd0 = atomicBoolean0.get() ? eycd.a : eycd.b;
            if(this.i.compareAndSet(false, true)) {
                ((ggtj)bboh0.h()).B("Completing the ranging, result? %s", eycd0.name());
                this.c.w(eycd0);
            }
        }
    }

    public final void onStartFail(int v) {
        ((ggtj)this.a.a.j()).P("Channel sounding distance measurement session failed to start for device %s, reason=%d", this.b.getAddress(), v);
        icbi icbi0 = this.c;
        if(icbi0.i()) {
            return;
        }
        icbi0.w(eycd.d);
    }

    public final void onStarted(DistanceMeasurementSession distanceMeasurementSession0) {
        ibuq.f(distanceMeasurementSession0, "session");
        ((ggtj)this.a.a.h()).B("Channel sounding distance measurement session is started for device %s.", this.b.getAddress());
    }

    public final void onStopped(DistanceMeasurementSession distanceMeasurementSession0, int v) {
        ibuq.f(distanceMeasurementSession0, "session");
        eycx eycx0 = this.a;
        bboh bboh0 = eycx0.a;
        ggtj ggtj0 = (ggtj)bboh0.h();
        String s = this.b.getAddress();
        icbi icbi0 = this.c;
        ggtj0.X("Channel sounding distance measurement session stopped for device %s, reason=%d, isSessionCompleted=%b", s, Integer.valueOf(v), Boolean.valueOf(icbi0.i()));
        eycx0.i = v;
        if(!icbi0.i() && this.i.compareAndSet(false, true)) {
            ((ggtj)bboh0.h()).W("Should complete ranging, result received? confident: %b, any: %b", eycx0.g, eycx0.h);
            if(eycx0.g) {
                icbi0.w(eycd.b);
                return;
            }
            if(eycx0.h) {
                icbi0.w(eycd.c);
                return;
            }
            icbi0.w(eycd.d);
        }
    }
}

