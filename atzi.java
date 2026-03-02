import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.List;

public final class atzi {
    public final int a;
    public final List b;

    public atzi(int v) {
        this.a = v;
        this.b = new ArrayList();
    }

    public final void a(CastDevice castDevice0) {
        if(castDevice0 != null) {
            this.b.add(castDevice0);
        }
    }
}

