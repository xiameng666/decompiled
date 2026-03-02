import java.util.Collections;
import java.util.Set;

public final class igic implements igib {
    private static final Set a;

    static {
        igic.a = Collections.singleton("UTC");
    }

    @Override  // igib
    public final Set a() {
        return igic.a;
    }

    @Override  // igib
    public final igcw b(String s) {
        return "UTC".equalsIgnoreCase(s) ? igcw.b : null;
    }
}

