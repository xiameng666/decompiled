import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.DeviceStatus;

public final class atsl implements Runnable {
    public final atss a;
    public final DeviceStatus b;

    public atsl(atss atss0, DeviceStatus deviceStatus0) {
        this.a = atss0;
        this.b = deviceStatus0;
    }

    @Override
    public final void run() {
        boolean z3;
        boolean z1;
        atst atst0 = this.a.a;
        DeviceStatus deviceStatus0 = this.b;
        ApplicationMetadata applicationMetadata0 = deviceStatus0.d;
        if(!aurf.u(applicationMetadata0, atst0.i)) {
            atst0.i = applicationMetadata0;
            atst0.s.a(atst0.i);
        }
        double f = deviceStatus0.a;
        boolean z = true;
        if(!Double.isNaN(f) && (Math.abs(f - atst0.k) > 1.000000E-07)) {
            atst0.k = f;
            z1 = true;
        }
        else {
            z1 = false;
        }
        boolean z2 = deviceStatus0.b;
        if(z2 != atst0.l) {
            atst0.l = z2;
            z1 = true;
        }
        aurs aurs0 = atst.a;
        aurs0.c("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z1), Boolean.valueOf(atst0.c)});
        atri atri0 = atst0.s;
        if(atri0 != null && (z1 || atst0.c)) {
            atri0.b();
        }
        int v = deviceStatus0.c;
        if(v == atst0.m) {
            z3 = false;
        }
        else {
            atst0.m = v;
            z3 = true;
        }
        aurs0.c("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z3), Boolean.valueOf(atst0.c)});
        int v1 = deviceStatus0.e;
        if(v1 == atst0.n) {
            z = false;
        }
        else {
            atst0.n = v1;
        }
        aurs0.c("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(atst0.c)});
        if(!aurf.u(atst0.o, deviceStatus0.f)) {
            atst0.o = deviceStatus0.f;
        }
        atst0.c = false;
    }
}

