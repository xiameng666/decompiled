import java.util.HashMap;
import java.util.Map;

public final class attc {
    public final Map a;
    public final Map b;
    private final Map c;

    public attc() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final int a(String s) {
        Integer integer0 = (Integer)this.c.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public final void b(String s, String s1, int v) {
        this.a.put(s, s1);
        this.b.put(s1, s);
        this.c.put(s, Integer.valueOf(v));
    }
}

