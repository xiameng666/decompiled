import java.util.HashMap;
import java.util.Map;

public final class gyjo {
    public final Map a;

    public gyjo() {
        this.a = new HashMap();
    }

    public final void a(gyjp gyjp0) {
        String s = gyjp0.c();
        this.a.put(s, gyjp0);
    }

    public final void b(gyjp gyjp0) {
        if(gyjp0 != null) {
            String s = gyjp0.c();
            this.a.remove(s);
        }
    }
}

