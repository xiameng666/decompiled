import java.util.HashMap;
import java.util.Map;

public final class udx {
    private final Map a;
    private final Map b;

    public udx() {
        this.a = new HashMap();
        this.b = new HashMap();
    }

    public final Map a(boolean z) {
        return z ? this.b : this.a;
    }

    final void b(uay uay0, udr udr0) {
        Map map0 = this.a(udr0.e);
        if(udr0.equals(map0.get(uay0))) {
            map0.remove(uay0);
        }
    }
}

