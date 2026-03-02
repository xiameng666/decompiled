import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class aruv {
    public static aruv a;
    public final clht b;
    public final Set c;
    public final Map d;
    public artk e;
    public gged_interceptors f;

    private aruv() {
        this.b = new clht(Looper.getMainLooper());
        this.c = new HashSet();
        this.d = new HashMap();
        this.f = ggna.a;
    }

    public static aruv a() {
        if(aruv.a == null) {
            aruv.a = new aruv();
        }
        return aruv.a;
    }
}

