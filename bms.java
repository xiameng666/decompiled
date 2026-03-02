import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

public final class bms {
    public static final bms a;
    protected final Map b;

    static {
        bms.a = new bms(new ArrayMap());
    }

    public bms(Map map0) {
        this.b = map0;
    }

    public final Object a(String s) {
        return this.b.get(s);
    }

    public final Set b() {
        return this.b.keySet();
    }

    public final void c(String s, Object object0) {
        this.b.put(s, object0);
    }

    public static bms d() {
        return new bms(new ArrayMap());
    }

    @Override
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}

