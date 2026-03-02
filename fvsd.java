import android.content.Context;
import android.location.GnssMeasurementRequest.Builder;
import android.location.GnssMeasurementRequest;
import android.location.GnssMeasurementsEvent.Callback;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.text.Format;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;

public final class fvsd {
    public final List a;
    public final LocationManager b;

    public fvsd(Context context0, boolean z) {
        this.b = (LocationManager)context0.getSystemService("location");
        this.a = z ? new LinkedList() : null;
    }

    public final void a(Format format0, long v, PrintWriter printWriter0) {
        synchronized(this) {
            List list0 = this.a;
            if(list0 != null) {
                Date date0 = new Date(0L);
                for(Object object0: list0) {
                    date0.setTime(v);
                    date0.setTime(date0.getTime() + ((fvsc)object0).b);
                    printWriter0.print(format0.format(date0));
                    printWriter0.print(" @");
                    printWriter0.print(((fvsc)object0).b);
                    printWriter0.print(" ");
                    String s = ((fvsc)object0).a;
                    if(s.length() > 2) {
                        s = s.substring(0, 2);
                    }
                    printWriter0.print(s);
                    printWriter0.print(": ");
                    printWriter0.println(((fvsc)object0).c - 1);
                }
            }
        }
    }

    public final void b(String s, boolean z, LocationListener locationListener0) {
        this.b.removeUpdates(locationListener0);
        if(z) {
            this.d(s, 2);
        }
    }

    public final void c(String s, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0) {
        this.b.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback0);
        this.d(s, 8);
    }

    public final void d(String s, int v) {
        synchronized(this) {
            List list0 = this.a;
            if(list0 != null) {
                list0.add(new fvsc(s, SystemClock.elapsedRealtime(), v));
                if(list0.size() > 100) {
                    list0.remove(0);
                }
            }
        }
    }

    public final void e(String s, GnssMeasurementsEvent.Callback gnssMeasurementsEvent$Callback0, Executor executor0, boolean z) {
        GnssMeasurementRequest gnssMeasurementRequest0 = new GnssMeasurementRequest.Builder().setFullTracking(z).build();
        this.b.registerGnssMeasurementsCallback(gnssMeasurementRequest0, executor0, gnssMeasurementsEvent$Callback0);
        this.d(s, 7);
    }

    public final void f(String s, String s1, long v, LocationListener locationListener0, Looper looper0) {
        if("gps".equals(s1)) {
            LocationManager locationManager0 = this.b;
            if(locationManager0.getProvider(s1) != null) {
                try {
                    locationManager0.requestLocationUpdates(s1, v, 0.0f, locationListener0, looper0);
                    this.d(s, 1);
                }
                catch(NullPointerException unused_ex) {
                    this.d(s, 3);
                }
            }
        }
    }
}

