import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;
import j..util.Objects;
import java.util.Iterator;
import java.util.Set;

final class eiga extends cmoa {
    final eigb a;

    public eiga(eigb eigb0) {
        Objects.requireNonNull(eigb0);
        this.a = eigb0;
        super();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        Iterator iterator2;
        if(locationResult0 != null) {
            if(hrtd.P()) {
                eigb eigb0 = this.a;
                Set set0 = eigb0.a;
                if(!set0.isEmpty()) {
                    for(Object object0: locationResult0.b) {
                        Location location0 = (Location)object0;
                        if(location0 != null && (eigb0.d == null || eigb0.d.getElapsedRealtimeNanos() < location0.getElapsedRealtimeNanos())) {
                            eigb0.d = location0;
                        }
                    }
                    for(Object object1: set0) {
                        ((cmoa)object1).kq(locationResult0);
                    }
                    return;
                }
            }
            iterator2 = locationResult0.b.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                Location location1 = (Location)object2;
                if(location1 != null) {
                    this.a.d = location1;
                    for(Object object3: this.a.b) {
                        ((LocationListener)object3).onLocationChanged(location1);
                    }
                }
            }
        }
    }
}

