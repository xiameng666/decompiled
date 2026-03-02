import java.util.Collections;
import java.util.Map;

public final class crqd {
    public final String a;
    public final crnq b;
    public final crtf c;
    private final Map d;

    public crqd(String s, crnq crnq0) {
        this(s, Collections.EMPTY_MAP, crnq0, null);
    }

    public crqd(String s, Map map0, crnq crnq0, crtf crtf0) {
        this.a = s;
        this.d = map0;
        this.b = crnq0;
        this.c = crtf0;
    }

    public final Map a() {
        return this.d == null ? Collections.EMPTY_MAP : this.d;
    }
}

