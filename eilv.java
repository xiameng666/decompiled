import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.location.LocationResult;
import java.util.HashSet;
import java.util.Set;

public final class eilv extends cmoa implements LocationListener {
    public final Set a;

    public eilv() {
        this.a = new HashSet();
    }

    @Override  // cmoa
    public final void kq(LocationResult locationResult0) {
        if(hrtd.P()) {
            for(Object object0: this.a) {
                ((eilu)object0).a();
            }
        }
    }

    @Override  // android.location.LocationListener
    public final void onLocationChanged(Location location0) {
        for(Object object0: this.a) {
            ((eilu)object0).a();
        }
    }
}

