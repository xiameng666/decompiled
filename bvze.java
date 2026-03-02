import java.util.LinkedHashMap;
import java.util.Map;

public final class bvze extends lsb {
    public final Map a;
    private final icck b;

    public bvze(icck icck0) {
        ibuq.f(icck0, "coroutineScope");
        super();
        this.b = icck0;
        this.a = new LinkedHashMap();
    }

    public final void a(hgmn hgmn0) {
        hgmm hgmm0 = hgmm.b(hgmn0.b) == null ? hgmm.f : hgmm.b(hgmn0.b);
        Map map0 = this.a;
        if(map0.get(hgmm0) == null) {
            map0.put(hgmm0, icmu.e(1, 0, 0, 6));
        }
    }

    public final void b(hgmn hgmn0) {
        ibuq.f(hgmn0, "event");
        this.a(hgmn0);
        bvyx bvyx0 = new bvyx(this, hgmn0, null);
        icbb.b(this.b, null, null, bvyx0, 3);
    }
}

