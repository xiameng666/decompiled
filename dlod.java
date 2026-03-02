import java.util.Map;
import java.util.Objects;

public final class dlod {
    public static final bboh a;
    public final edon b;
    private final Map c;

    static {
        dlod.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlod(Map map0, edon edon0) {
        this.c = map0;
        this.b = edon0;
    }

    public final dlok a(ascs ascs0) {
        Object object0 = this.c.get(ascs0);
        if(object0 != null) {
            Object object1 = ((ibnf)object0).get();
            ibuq.e(object1, "get(...)");
            return (dlok)object1;
        }
        Objects.toString(ascs0);
        throw new IllegalArgumentException("D2D handler is not available for " + ascs0);
    }
}

