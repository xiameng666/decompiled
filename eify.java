import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;

public final class eify implements evqf {
    public final eigb a;

    public eify(eigb eigb0) {
        this.a = eigb0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((Location)object0) != null) {
            eigb eigb0 = this.a;
            if(hrtd.P()) {
                for(Object object1: eigb0.a) {
                    ((cmoa)object1).kq(LocationResult.b(gged_interceptors.l(((Location)object0))));
                }
                return;
            }
            for(Object object2: eigb0.b) {
                ((LocationListener)object2).onLocationChanged(((Location)object0));
            }
        }
    }
}

