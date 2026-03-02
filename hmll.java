import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class hmll {
    public final Map a;
    public final List b;
    final hmlg c;
    private final Map d;

    public hmll(hmlg hmlg0) {
        this.d = new HashMap();
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = hmlg0;
    }

    public final hmli a(String s) {
        return ((hmkd)this.d.get(s)) == null ? null : ((hmkd)this.d.get(s)).a();
    }

    public final void b(String s, hmkd hmkd0) {
        this.d.put(s, hmkd0);
    }
}

