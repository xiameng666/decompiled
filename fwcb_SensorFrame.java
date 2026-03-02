import android.location.Location;
import java.util.HashSet;
import java.util.Set;

public final class fwcb_SensorFrame {
    public final Set a;

    public fwcb_SensorFrame() {
        this.a = new HashSet();
    }

    public final void a(fwca fwca0) {
        this.a.add(fwca0);
    }

    public final void b(Location location0) {
        for(Object object0: this.a) {
            ((fwca)object0).b(location0);
        }
    }
}

