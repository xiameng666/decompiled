import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.DistanceMeasurementManager;
import android.bluetooth.le.DistanceMeasurementParams;
import j..time.Duration;

final class eycw extends ibsl implements ibtw {
    int a;
    final eycx b;
    final BluetoothDevice c;
    final gfug d;
    final ibvd e;
    final ibvd f;
    final DistanceMeasurementManager g;
    final DistanceMeasurementParams h;
    final exwv i;
    final eyfr j;

    public eycw(eycx eycx0, BluetoothDevice bluetoothDevice0, gfug gfug0, ibvd ibvd0, ibvd ibvd1, DistanceMeasurementManager distanceMeasurementManager0, DistanceMeasurementParams distanceMeasurementParams0, exwv exwv0, eyfr eyfr0, ibrl ibrl0) {
        this.b = eycx0;
        this.c = bluetoothDevice0;
        this.d = gfug0;
        this.e = ibvd0;
        this.f = ibvd1;
        this.g = distanceMeasurementManager0;
        this.h = distanceMeasurementParams0;
        this.i = exwv0;
        this.j = eyfr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eycw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eycw(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                eycx eycx0 = this.b;
                iced iced0 = eycx0.e;
                if(iced0 != null) {
                    iceb.a(iced0);
                }
                eycx0.e = null;
                this.a = 1;
                object0 = eycx0.d.a(this.c, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return object0;
            }
        }
        if(!((Boolean)object0).booleanValue()) {
            ((ggtj)this.b.a.j()).x("Failed to establish a GATT connection in a time window.");
            return eycd.d;
        }
        eycx eycx1 = this.b;
        bboh bboh0 = eycx1.a;
        ggtj ggtj0 = (ggtj)bboh0.h();
        gfug gfug0 = eycx1.f;
        long v1 = -1L;
        if(gfug0 != null) {
            Duration duration0 = gfug0.d();
            if(duration0 != null) {
                v1 = duration0.toMillis();
            }
        }
        gfug gfug1 = this.d;
        ggtj0.K("Time taken to establish a GATT connection from config setting is %d millis, from connectGatt() is %d millis", v1, gfug1.d().toMillis());
        if(homi.a.c().f()) {
            return eycd.a;
        }
        this.e.a = gfug1.d();
        ((ggtj)bboh0.h()).x("CsRangeValidator GATT instance found, start distance measurement.");
        this.a = 2;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        eycx1.j.add(this.c);
        eyct eyct0 = new eyct(eycx1, this.c, icbk0, this.j, this.i);
        this.f.a = this.g.startMeasurementSession(this.h, eycx1.b, eyct0);
        icbk0.d(new eycv(eycx1, this.c, this.f));
        Object object2 = icbk0.k();
        if(object2 == object1) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

