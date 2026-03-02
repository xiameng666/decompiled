import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

public final class iamg {
    public static final Logger a;
    public static final iamg b;
    public final ConcurrentNavigableMap c;
    public final ConcurrentMap d;
    public final ConcurrentMap e;

    static {
        iamg.a = Logger.getLogger(iamg.class.getName());
        iamg.b = new iamg();
    }

    public iamg() {
        new ConcurrentSkipListMap();
        this.c = new ConcurrentSkipListMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map0, iamk iamk0) {
        iamk iamk1 = (iamk)map0.put(Long.valueOf(iamk0.c().a), iamk0);
    }

    public static void b(Map map0, iamk iamk0) {
        iamk iamk1 = (iamk)map0.remove(Long.valueOf(iamk0.c().a));
    }
}

